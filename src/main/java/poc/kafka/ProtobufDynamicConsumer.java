package poc.kafka;

import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.DynamicMessage;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class ProtobufDynamicConsumer {

    public void readFromTopic() {

        //Set properties for the consumer
        Properties consumerProps = new Properties();

        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "18.117.118.109:9092");
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "poc-dynamic-consumer-group");
        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        consumerProps.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaProtobufDeserializer.class);
        consumerProps.put(KafkaProtobufDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://18.117.118.109:8081");

        KafkaConsumer<String, DynamicMessage> consumer = new KafkaConsumer<>(consumerProps);
        consumer.subscribe(Collections.singleton("proto"));


        while(true) {
            ConsumerRecords<String, DynamicMessage> records = consumer.poll(Duration.ofMillis(100));

            int msgCount = 0;

            for(ConsumerRecord<String, DynamicMessage> record : records) {

                for(FieldDescriptor field : record.value().getAllFields().keySet()) {
                    System.out.println(field.getName() + " : " + record.value().getField(field));
                }

                msgCount++;
            }

            //Commit read events
            consumer.commitAsync();

            if (msgCount > 0) {
                break;
            }

        }

    }
}

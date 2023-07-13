package poc.kafka;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import poc.protobuf.protos.Person;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class ProtobufConsumer {

    public void readFromTopic() {

        //Set properties for the consumer
        Properties consumerProps = new Properties();

        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "18.117.118.109:9092");
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "poc-consumer-group");
        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        consumerProps.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaProtobufDeserializer.class);
        consumerProps.put(KafkaProtobufDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://18.117.118.109:8081");
        consumerProps.put(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, Person.class);

        KafkaConsumer<String, Person> consumer = new KafkaConsumer<>(consumerProps);
        consumer.subscribe(Collections.singleton("proto"));


        while(true) {
            ConsumerRecords<String, Person> records = consumer.poll(Duration.ofMillis(100));

            int msgCount = 0;

            for(ConsumerRecord<String, Person> record : records) {
                System.out.println("Message Content: " + record.value().getName());
                System.out.println("Message Content: " + record.value().getEmail());

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

package poc.kafka;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import poc.protobuf.protos.OrderCreated;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import poc.protobuf.Config;
public class ProtobufOrderCreatedConsumer {

    public void readFromTopic(Config envProps) {

        //Set properties for the consumer
        Properties consumerProps = new Properties();

        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, envProps.get(Config.PropKeys.KAFKA_IP));
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "poc-order-group");
        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, envProps.get(Config.PropKeys.AUTO_OFFSET_REST_CONFIG));
        consumerProps.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, envProps.get(Config.PropKeys.ENABLE_AUTO_COMMIT_CONFIG));
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaProtobufDeserializer.class);
        consumerProps.put(KafkaProtobufDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG, envProps.get(Config.PropKeys.KAFKA_SCHEMA_REGISTRY));
        consumerProps.put(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, OrderCreated.class);

        KafkaConsumer<String, OrderCreated> consumer = new KafkaConsumer<>(consumerProps);
        consumer.subscribe(Collections.singleton(envProps.get(Config.PropKeys.KAKFA_TOPIC)));

        while (true) {
            ConsumerRecords<String, OrderCreated> records = consumer.poll(Duration.ofMillis(100));

            int msgCount = 0;

            for (ConsumerRecord<String, OrderCreated> record : records) {
                System.out.println("Order Created Message Content - Order ID: " + record.value().getOrderId());
                System.out.println("Order Created Message Content - Customer ID: " + record.value().getCustomerId());

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

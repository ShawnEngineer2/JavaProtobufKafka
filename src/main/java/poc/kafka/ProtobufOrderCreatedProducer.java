package poc.kafka;

import poc.protobuf.protos.OrderCreated;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializerConfig;
import io.confluent.kafka.serializers.subject.TopicRecordNameStrategy;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

import poc.protobuf.Config;
public class ProtobufOrderCreatedProducer {

    public void writeToTopic (Config envProps) {

        //Set properties for the producer
        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, envProps.get(Config.PropKeys.KAFKA_IP));
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);
        producerProps.put(KafkaProtobufSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,envProps.get(Config.PropKeys.KAFKA_SCHEMA_REGISTRY));
        producerProps.put(envProps.get(Config.PropKeys.TOPIC_RECORD_NAME_STRATEGY_CONFIG), TopicRecordNameStrategy.class);

        Producer<String, OrderCreated> producer = new KafkaProducer<>(producerProps);

        //Make a new OrderCreated record
        OrderCreated.Builder orderCreated = OrderCreated.newBuilder();

        orderCreated.setCustomerId(35467);
        orderCreated.setOrderId(798);
        orderCreated.setOrderType(OrderCreated.OrderType.DELIVERY);
        orderCreated.setProductId(397);
        orderCreated.setQuantity(200);

        OrderCreated newRec = orderCreated.build();

        //Prep and send to Redpanda
        ProducerRecord<String, OrderCreated> newRpRec = new ProducerRecord<>(envProps.get(Config.PropKeys.KAKFA_TOPIC), null, newRec);
        producer.send(newRpRec);
        producer.flush();
        producer.close();
    }


}

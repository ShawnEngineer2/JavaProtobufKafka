package poc.kafka;

import poc.protobuf.Config;
import poc.protobuf.protos.OrderStatusUpdate;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializerConfig;
import io.confluent.kafka.serializers.subject.TopicRecordNameStrategy;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;
public class ProtobufOrderUpdateProducer {

    public void writeToTopic (Config envProps) {

        //Set properties for the producer
        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, envProps.get(Config.PropKeys.KAFKA_IP));
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);
        producerProps.put(KafkaProtobufSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,envProps.get(Config.PropKeys.KAFKA_SCHEMA_REGISTRY));
        producerProps.put(envProps.get(Config.PropKeys.TOPIC_RECORD_NAME_STRATEGY_CONFIG), TopicRecordNameStrategy.class);

        Producer<String, OrderStatusUpdate> producer = new KafkaProducer<>(producerProps);

        //Make a series of Order Status Updates to Redpanda
        OrderStatusUpdate.Builder orderStatusUpdate = OrderStatusUpdate.newBuilder();

        orderStatusUpdate.setOrderId(798);
        orderStatusUpdate.setOrderStatus(OrderStatusUpdate.OrderStatus.ORDER_RECEIVED);

        OrderStatusUpdate newRec = orderStatusUpdate.build();

        ProducerRecord<String, OrderStatusUpdate> newRpRec = new ProducerRecord<>(envProps.get(Config.PropKeys.KAKFA_TOPIC), null, newRec);
        producer.send(newRpRec);

        orderStatusUpdate.setOrderId(798);
        orderStatusUpdate.setOrderStatus(OrderStatusUpdate.OrderStatus.PROCESSING);
        newRec = orderStatusUpdate.build();

        newRpRec = new ProducerRecord<>(envProps.get(Config.PropKeys.KAKFA_TOPIC), null, newRec);
        producer.send(newRpRec);

        orderStatusUpdate.setOrderId(798);
        orderStatusUpdate.setOrderStatus(OrderStatusUpdate.OrderStatus.SHIPPED);
        newRec = orderStatusUpdate.build();

        newRpRec = new ProducerRecord<>(envProps.get(Config.PropKeys.KAKFA_TOPIC), null, newRec);
        producer.send(newRpRec);

        orderStatusUpdate.setOrderId(798);
        orderStatusUpdate.setOrderStatus(OrderStatusUpdate.OrderStatus.DELIVERED);
        newRec = orderStatusUpdate.build();

        newRpRec = new ProducerRecord<>(envProps.get(Config.PropKeys.KAKFA_TOPIC), null, newRec);
        producer.send(newRpRec);

        producer.flush();
        producer.close();
    }

}

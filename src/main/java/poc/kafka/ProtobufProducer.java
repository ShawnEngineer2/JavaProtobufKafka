package poc.kafka;

import poc.protobuf.protos.AddressBook;
import poc.protobuf.protos.Person;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

import poc.protobuf.Config;

public class ProtobufProducer {

    public void writeToTopic (Config envProps) {

        //Set properties for the producer
        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, envProps.get(Config.PropKeys.KAFKA_IP));
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);
        producerProps.put(KafkaProtobufSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,envProps.get(Config.PropKeys.KAFKA_SCHEMA_REGISTRY));

        Producer<String, Person> producer = new KafkaProducer<>(producerProps);

        //Make a new Person record
        Person.Builder person = Person.newBuilder();

        person.setId(50);
        person.setName("Shawn Nance");
        person.setEmail("xyx@insightglobal.net");
        person.addPhones(Person.PhoneNumber.newBuilder().setNumber("804-888-9999"));

        Person newRec = person.build();

        //Prep and send to Redpanda
        ProducerRecord<String, Person> newRpRec = new ProducerRecord<>(envProps.get(Config.PropKeys.KAKFA_TOPIC), null, newRec);
        producer.send(newRpRec);
        producer.flush();
        producer.close();
    }


}

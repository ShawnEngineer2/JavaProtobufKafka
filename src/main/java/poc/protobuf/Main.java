package poc.protobuf;

import poc.kafka.ProtobufDynamicConsumer;
import poc.kafka.ProtobufProducer;
import poc.kafka.ProtobufConsumer;

import poc.protobuf.Config;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Config envProps = new Config();

        envProps.put(Config.PropKeys.KAFKA_IP, "18.191.161.199:9092");
        envProps.put(Config.PropKeys.KAFKA_SCHEMA_REGISTRY, "http://18.191.161.199:8081");
        envProps.put(Config.PropKeys.KAKFA_TOPIC, "proto");
        envProps.put(Config.PropKeys.AUTO_OFFSET_REST_CONFIG, "earliest");
        envProps.put(Config.PropKeys.ENABLE_AUTO_COMMIT_CONFIG, String.valueOf(false));

//        System.out.println("Making new Address Book");
//        AddPerson addPerson = new AddPerson();
//        addPerson.MakeAddressBook();
//
//        System.out.println("Address Book Created");
//        System.out.println("Reading Address Book");
//
//        ReadPerson readPerson = new ReadPerson();
//        readPerson.readPerson();

        System.out.println("Producing to Redpanda");
        ProtobufProducer protoProducer = new ProtobufProducer();
        protoProducer.writeToTopic(envProps);
        System.out.println("Message Produced!");

        System.out.println("Consuming from Redpanda");
        ProtobufConsumer protoConsumer = new ProtobufConsumer();
        protoConsumer.readFromTopic(envProps);
        System.out.println("Messages Consumed!");

        System.out.println("Producing to Redpanda");
        protoProducer.writeToTopic(envProps);
        System.out.println("Message Produced!");

        System.out.println("Consuming from Redpanda as DynamicMessage");
        ProtobufDynamicConsumer protoDynConsumer = new ProtobufDynamicConsumer();
        protoDynConsumer.readFromTopic(envProps);
        System.out.println("Messages Consumed!");
    }
}
package poc.protobuf;

import poc.kafka.ProtobufDynamicConsumer;
import poc.kafka.ProtobufProducer;
import poc.kafka.ProtobufConsumer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Making new Address Book");
        AddPerson addPerson = new AddPerson();
        addPerson.MakeAddressBook();

        System.out.println("Address Book Created");
        System.out.println("Reading Address Book");

        ReadPerson readPerson = new ReadPerson();
        readPerson.readPerson();

        System.out.println("Producing to Redpanda");
        ProtobufProducer protoProducer = new ProtobufProducer();
        protoProducer.writeToTopic();
        System.out.println("Message Produced!");

        System.out.println("Consuming from Redpanda");
        ProtobufConsumer protoConsumer = new ProtobufConsumer();
        protoConsumer.readFromTopic();
        System.out.println("Messages Consumed!");

        System.out.println("Producing to Redpanda");
        protoProducer.writeToTopic();
        System.out.println("Message Produced!");

        System.out.println("Consuming from Redpanda as DynamicMessage");
        ProtobufDynamicConsumer protoDynConsumer = new ProtobufDynamicConsumer();
        protoDynConsumer.readFromTopic();
        System.out.println("Messages Consumed!");
    }
}
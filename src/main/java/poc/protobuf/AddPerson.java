package poc.protobuf;

import poc.protobuf.protos.AddressBook;
import poc.protobuf.protos.Person;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

public class AddPerson {
    //This class instantiates an Address Book and writes it to a file

    public void MakeAddressBook() {

        //First create a Person record
        Person.Builder person = Person.newBuilder();

        person.setId(50);
        person.setName("Shawn Nance");
        person.setEmail("xyx@insightglobal.net");
        person.addPhones(Person.PhoneNumber.newBuilder().setNumber("804-888-9999"));

        Person newRec = person.build();

        //Second - make AddressBook
        AddressBook.Builder addressBook = AddressBook.newBuilder();
        addressBook.addPeople(newRec);

        //Third - write to file
        try {
            FileOutputStream output = new FileOutputStream("/Users/shawn.nance/Desktop/AddressBook.bin");
            addressBook.build().writeTo(output);
        }
        catch(Exception e) {
            e.printStackTrace();
        }


    }




}

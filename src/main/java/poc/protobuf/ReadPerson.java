package poc.protobuf;

import poc.protobuf.protos.AddressBook;
import poc.protobuf.protos.Person;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ReadPerson {

    public void readPerson() {

        try {
            AddressBook addressBook = AddressBook.parseFrom(new FileInputStream("/Users/shawn.nance/Desktop/AddressBook.bin"));

            for (Person person : addressBook.getPeopleList()) {

                PrintMsg("Name: " + person.getName());
                PrintMsg("ID: " + String.valueOf(person.getId()));

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void PrintMsg(String msg) {
        System.out.println(msg);
    }
}

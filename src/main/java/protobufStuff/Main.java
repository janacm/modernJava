package protobufStuff;


import gen.PersonProtos;
import gen.PersonProtos.Person;

public class Main {

    public static void main(String[] args) {
        PersonProtos.Another another = PersonProtos.Another.newBuilder()
                .setAnotherName("mr cool guys")
                .build();

        Person cowboy = Person.newBuilder()
                .setName("cowboy")
                .addArtist("bon jobi")
                .addArtist("xon jobi")
                .addArtist("aon jobi")
                .addAnother(another)
                .build();

        System.out.println(Person.Color.BLUE);
        System.out.println(cowboy.getAllFields());
    }
}


package com.lpu.revise.unit5.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

    public static void main(String[] args) {
        ByteXLDashboard Uttkarsh = new ByteXLDashboard("Uttkarsh", 50 );
        ByteXLDashboard Shalvi = new ByteXLDashboard("Shalvi", 40);

        // Serialize Object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(Uttkarsh);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

class ByteXLDashboard implements Serializable {
    String name;
    int questionSolved;

    ByteXLDashboard(String name, int questionSolved){
        this.name = name;
        this.questionSolved = questionSolved;

    }
}

// { "Uttkarsh":
//    {
//        "name": "Uttkarsh",
//        "questionSolved": 50;
//    }
// }



package com.lpu.unit6.jdbc;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;


public class MongoDBConnection {
    public static void main(String[] args) {
        try {
            // Connecting to MongoDB Server running on localhost
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

            // Accessing the database
            MongoDatabase database = mongoClient.getDatabase("myMongoDB");
            System.out.println("Connected to MongoDB Successfully!");

            // 2. Access the database and collection
            MongoCollection<Document> collection = database.getCollection("students");

//             3. Create - Insert a document
//            Document student = new Document("name", "Nandani")
//                    .append("email", "nandani@gmail.com")
//                    .append("age", 20);
//            collection.insertOne(student);
//            System.out.println("Inserted: " + student.toJson());

//            4. Read
            MongoCursor<Document> cursor = collection.find().iterator();

//            System.out.println(cursor.next().toString());
//            while (cursor.hasNext() ){
//                System.out.println(cursor.next().toJson());
//            }

//            5. Update

//            collection.updateOne(Filters.eq("name", "Manoj"), new Document("$set", new Document("age", 30)));

//            6. Delete

            collection.deleteOne(Filters.eq("name", "Manoj"));

            Document deletedDocument  = collection.find(Filters.eq("name", "sdfnhbfsd")).first();

            if (deletedDocument == null){
                System.out.println("Document Deleted Successfully");
            }
            else {
                System.out.println("Something went wrong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    {
//        "name": "Ummed Singh",
//        "Contat": "98y3t61",
//            {
//                "age", 24;
//            }
//    }
//    {
//        "name": "Singh",
//        "Contact": 903298
//    }


//   col-. name, Contact, age
//   row1 - Ummed, 09398u4, 24
//    row2- Singh, 983u87y3
}




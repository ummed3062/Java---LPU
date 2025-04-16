package com.lpu.unit6.jdbc;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class MongoCRUDExample {
    public static void main(String[] args) {
        // 1. Connect to MongoDB
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {

            // 2. Access the database and collection
            MongoDatabase database = mongoClient.getDatabase("testdb");
            MongoCollection<Document> collection = database.getCollection("students");

            // 3. Create - Insert a document
//            Document student = new Document("name", "Ummed Singh")
//                    .append("email", "ummedsingh3062000@gmail.com")
//                    .append("age", 24);
//            collection.insertOne(student);
//            System.out.println("Inserted: " + student.toJson());

            // 4. Read - Find all documents
//            System.out.println("\nAll students:");
//            MongoCursor<Document> cursor = collection.find().iterator();
//            while (cursor.hasNext()) {
//                System.out.println(cursor.next().toJson());
//            }

            // 5. Update - Update student by name
            collection.updateOne(eq("name", "Ummed Singh"),
                    new Document("$set", new Document("age", 24)));
            System.out.println("\nUpdated Ummed's age to 25.");

            // 6. Read again to see update
            Document updatedStudent = collection.find(eq("name", "Ummed Singh")).first();
            System.out.println("Updated document: " + updatedStudent.toJson());

//            6. Delete
//            collection.deleteOne(Filters.eq("name", "Manoj"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//{
//    "_id": "12345",
//    "name": "Ummed Singh",
//    "email": "Ummed@example.com",
//    "age": 24
//}


//{
//        "productId": "JKT101",
//        "name": "Winter Jacket",
//        "brand": "Puma",
//        "size": ["S", "M", "L", "XL"],
//        "color": ["Black", "Blue"],
//        "material": "Polyester",
//        "category": "Clothing"
//}

//{
//        "productId": "MOB202",
//        "name": "Samsung Galaxy S24",
//        "brand": "Samsung",
//        "ram": "8GB",
//        "storage": "256GB",
//        "battery": "5000mAh",
//        "camera": "108MP",
//        "category": "Electronics"
//        }

//CREATE TABLE products (
//        productId VARCHAR(10),
//name VARCHAR(100),
//brand VARCHAR(50),
//category VARCHAR(30),
//size VARCHAR(20),
//color VARCHAR(30),
//ram VARCHAR(10),
//storage VARCHAR(20),
//battery VARCHAR(20),
//camera VARCHAR(20)
//);

//{
//        "productId": "JKT101",
//        "name": "Winter Jacket",
//        "brand": "Puma",
//        "size": ["S", "M", "L"],
//        "color": ["Black", "Blue"]
//        }


//{
//        "productId": "MOB202",
//        "name": "Samsung Galaxy S24",
//        "ram": "8GB",
//        "storage": "256GB",
//        "battery": "5000mAh"
//}






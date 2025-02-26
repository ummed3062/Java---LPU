package com.lpu.unit4;


interface ChatBot{

    void respond(String question);
}
public class ChatbotDemo {

    public static void main(String[] args) {

        ChatBot chatBot = new ChatBot() {
            @Override
            public void respond(String question) {

                if (question.equalsIgnoreCase("Hi")){
                    System.out.println("Hello! How can I help you");
                }else if (question.equalsIgnoreCase("where is my order?")){
                    System.out.println("Your order is being processed and will be delivered soon!");
                }else {
                    System.out.println("I'm sorry, I didn't understand your question...!");
                }
            }
        };

        chatBot.respond("Hi");
        chatBot.respond("where is my order?");

    }
}

package com.iremgunay;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        // charAt()
        System.out.println("Eleman sayisi: " + message.length());
        System.out.println("5. eleman: " + message.charAt(4));

        // concat()
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message); // message's value does not change

        // startsWith(), endsWith()
        System.out.println(message.startsWith("B")); // it turns false for "b" or "A"
        System.out.println(message.endsWith("."));

        // getChars()
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);

        // indexOf(), lastIndexOf()
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.indexOf('ü')); // returns the first found index number

        System.out.println("------------");

        // replace()
        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        // substring()
        System.out.println(message.substring(2,5));

        // split()
        for(String word : message.split(" ")) {
            System.out.println(word);
        }

        // toLowerCase(), toUpperCase() - uses for searching in database
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));

        // trim()
        System.out.println(message.trim());
    }
}

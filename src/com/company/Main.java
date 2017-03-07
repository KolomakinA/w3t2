package com.company;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
        for (int i = 0; i < 35 ; i++) {
            deck.drawOne();
        }
        System.out.println(deck.hasNext());
        deck.drawOne();
        System.out.println(deck.hasNext());
//        for (int i = 0; i < 36; i++) {
//            System.out.println(deck.toString(i));
//        }
//        System.out.println("-------Performing shufle");
//        deck.shuffle();
//        for (int i = 0; i < 36; i++) {
//            System.out.println(deck.toString(i));
//        }
//        System.out.println("-------Performing order");
//        deck.order();
//        for (int i = 0; i < 36; i++) {
//            System.out.println(deck.toString(i));
//        }
    }
}

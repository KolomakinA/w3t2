package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kolom on 07.03.2017.
 */
public class Deck {

    private Card[] deck ;
    private int cardsLeft;

    public Deck() {
        deck = new Card[36];
        cardsLeft = 36;
        createDeck();
    }

    private void createDeck(){
        int rcount = 0;
        int scount = 0;
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(getRank(rcount), getSuit(scount));
            rcount++;
            if (i !=0 && rcount%9 == 0) {
                rcount = 0;
                scount++;
            }
        }
    }

    private Rank getRank(int rcount){
        switch (rcount){
            case 0:
                return Rank.ACE;
            case 1:
                return Rank.KING;
            case 2:
                return Rank.QUEEN;
            case 3:
                return Rank.JACK;
            case 4:
                return Rank.TEN;
            case 5:
                return Rank.NINE;
            case 6:
                return Rank.EIGHT;
            case 7:
                return Rank.SEVEN;
            case 8:
                return Rank.SIX;
        }
        return null;
    }

    private Suit getSuit(int scount){
        switch (scount){
            case 0:
                return Suit.HEARTS;
            case 1:
                return Suit.DIAMONDS;
            case 2:
                return Suit.CLUBS;
            case 3:
                return Suit.SPADES;
        }
        return null;
    }

//    public String toString(int i){
//        return "Rank: " + deck[i].getRank().getName() +", Suit: "+  deck[i].getSuit().getName();
//    }//REMOVE

    public void shuffle() {
        Random rnd = ThreadLocalRandom.current();
        for (int j = 0; j < 3; j++) {
            for (int i = deck.length - 1; i > 0; i--){
                int index = rnd.nextInt(i + 1);
                Card a = deck[index];
                deck[index] = deck[i];
                deck[i] = a;
            }
        }
    }

    public void order() {
        createDeck();
    }

    public boolean hasNext() {
        if (cardsLeft > 0)
            return true;
        else return false;
    }

    public Card drawOne() {
        if(cardsLeft==0) return null;
        else {
            cardsLeft--;
            return deck[cardsLeft];
        }

    }
}
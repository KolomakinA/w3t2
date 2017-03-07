package com.company;

/**
 * Created by kolom on 07.03.2017.
 */
public class Deck {
    private Card[] deck;
    public Deck() {
        deck = new Card[36];
        initialize();
    }

    private void initialize(){
        int rcount = 0;
        int scount = 0;
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(getRank(rcount), getSuit(scount));
            scount++;
            if (i !=0 && scount%4 == 0) {
                scount = 0;
                rcount++;
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
                return Suit.CLUBS;
            case 1:
                return Suit.DIAMONDS;
            case 2:
                return Suit.HEARTS;
            case 3:
                return Suit.SPADES;
        }
        return null;
    }

    public String toString(int i){
        return "Rank: " + deck[i].getRank().getName() +", Suit: "+  deck[i].getSuit().getName();
    }

    public void shuffle() {
        //Перемішує колоду у випадковому порядку
    }

    public void order() {
                /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    }


//    public boolean hasNext() {
//        //Повертає true у випадку коли в колоді ще доступні карти
//    }
//
//
//    public Card drawOne() {
//        //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
//        //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
//        //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
//    }
}
package com.java.yaala.bean;

import java.util.Random;

public class Deck {

    private final int CARD_MARK = 4;
    private final int CARD_NUMBER = 6;
    private final int DECK_SIZE = CARD_MARK * CARD_NUMBER;
    private final int HAND_SIZE = 5;
    private final int SHUFFLE_EXCHANGES = 2000;
    
    int deckPosition = 5;
    
    Card[] deck = new Card[DECK_SIZE];
    
    Random r = new Random();
    
    public void reload() {
        
        deckPosition = 5;
        int count = 0;
        
        for(int mark = 1; mark <= CARD_MARK; mark++) {
            for(int number = 1; number <= CARD_NUMBER; number++) {
                deck[count] = new Card();
                deck[count].mark = mark;
                deck[count].number = number;
                count++;
            }
        }
    }
    
    public void shuffle() {
        
        for(int count = 0; count < SHUFFLE_EXCHANGES; count++) {
            int number1 = r.nextInt(DECK_SIZE);
            int number2 = r.nextInt(DECK_SIZE);
            
            Card temp = deck[number1];
            deck[number1] = deck[number2];
            deck[number2] = temp;
        }
    }
    
    public Card[] deal() {
        
        Card[] hand = new Card[HAND_SIZE];
        
        for(int position = 0; position < 5; position++) {
            hand[position] = deck[position];
        }
        
        return hand;
    }
    
    public Card redeal() {
        
        Card nextCard = deck[deckPosition];
        deckPosition++;
        
        return nextCard;
    }
}

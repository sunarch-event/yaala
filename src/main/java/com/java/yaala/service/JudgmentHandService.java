package com.java.yaala.service;

import java.util.ArrayList;
import java.util.List;

import com.java.yaala.bean.Card;

public class JudgmentHandService {

    public boolean judgementTwoPair(Card[] cards) {
        int count = 0;
        boolean result = false;
        List<Card> pairCard = new ArrayList<Card>();
        for(Card card1 : cards) {
            for(Card card2 : cards) {
                if(!card1.equals(card2) && !pairCard.contains(card1) && !pairCard.contains(card2)) {
                    if(card1.getNumber() == card2.getNumber()) {
                        count++;
                        pairCard.add(card1);
                        pairCard.add(card2);
                    }
                }
            }
        }
        if(count == 2) {
            result = true;
        }
        return result;
    }
    
    int hasSameNumberCardCount(Card[] cards) {
        
        return 2;
    }
}

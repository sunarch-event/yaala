package com.java.yaala.service;

import java.util.ArrayList;
import java.util.List;

import com.java.yaala.bean.Card;

public class JudgementHandUtil {

    public static boolean judgementTwoPair(Card[] cards) {
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
    
    public static boolean judgementThreeCard(Card[] cards) {
        boolean result = false;
        for(Card card1 : cards) {
            int count = 0;
            for(Card card2 : cards) {
                if(!card1.equals(card2)) {
                    if(card1.getNumber() == card2.getNumber()) {
                        count++;
                    }
                }
            }
            if(count >= 2) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    public static boolean judgementOnePair(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementFourCard(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementFullHouse(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementStraight(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementFlash(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementStraightFlash(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementSunshine(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementTwinSun(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementStarFlash(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementDiaHouse(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementSpadeLeader(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementSpadeDiaMix(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementMarkWonder(Card[] cards) {
        boolean result = false;
        return result;
    }
    
    public static boolean judgementSunArch(Card[] cards) {
        boolean result = false;
        return result;
    }
}

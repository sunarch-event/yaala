package com.java.yaala.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.java.yaala.bean.Card;


public class JudgementHandUtilTests {

    private final int HANDS_SIZE = 5;
    
    @Test
    void judgementTwoPairTest() {
        List<HandsJudge> handsJudgeList = createTwoPairHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementTwoPair(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementThreeCardTest() {
        List<HandsJudge> handsJudgeList = createThreeCardHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementThreeCard(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementOnePairTest() {
        List<HandsJudge> handsJudgeList = createOnePairHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementOnePair(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementFourCardTest() {
        List<HandsJudge> handsJudgeList = createFourCardHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementFourCard(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementFullHouseTest() {
        List<HandsJudge> handsJudgeList = createFullHouseHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementFullHouse(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementStraightTest() {
        List<HandsJudge> handsJudgeList = createStraightHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementStraight(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementFlashTest() {
        List<HandsJudge> handsJudgeList = createFlashHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementFlash(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementStraightFlashTest() {
        List<HandsJudge> handsJudgeList = createStraightFlashHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementStraightFlash(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementSunshineTest() {
        List<HandsJudge> handsJudgeList = createSunshineHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementSunshine(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementTwinSunTest() {
        List<HandsJudge> handsJudgeList = createTwinSunHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementTwinSun(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementStarFlashTest() {
        List<HandsJudge> handsJudgeList = createStarFlashHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementStarFlash(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementDiaHouseTest() {
        List<HandsJudge> handsJudgeList = createDiaHouseHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementDiaHouse(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementSpadeLeaderTest() {
        List<HandsJudge> handsJudgeList = createSpadeLeaderHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementSpadeLeader(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementSpadeDiaMixTest() {
        List<HandsJudge> handsJudgeList = createSpadeDiaMixHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementSpadeDiaMix(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementMarkWonderTest() {
        List<HandsJudge> handsJudgeList = createMarkWonderHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementMarkWonder(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    @Test
    void judgementSunArchTest() {
        List<HandsJudge> handsJudgeList = createSunArchHandsJudgeList();
        boolean result = true;
        for(HandsJudge handsJudge : handsJudgeList) {
            boolean judgeResult = JudgementHandUtil.judgementSunArch(handsJudge.getHands());
            if(!judgeResult == handsJudge.isEstablished()) {
                result = false;
            }
        }
        assertTrue(result);
    }
    
    private List<HandsJudge> createThreeCardHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(2, 1);
        hand1[2] = new Card(3, 1);
        hand1[3] = new Card(2, 2);
        hand1[4] = new Card(3, 3);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(3, 2);
        hand2[2] = new Card(4, 2);
        hand2[3] = new Card(1, 1);
        hand2[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(4, 3);
        hand3[2] = new Card(1, 3);
        hand3[3] = new Card(4, 4);
        hand3[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(1, 4);
        hand4[2] = new Card(2, 4);
        hand4[3] = new Card(3, 2);
        hand4[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 1);
        hand5[1] = new Card(2, 1);
        hand5[2] = new Card(3, 1);
        hand5[3] = new Card(4, 1);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 1);
        hand6[2] = new Card(1, 2);
        hand6[3] = new Card(1, 3);
        hand6[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(1, 1);
        hand7[1] = new Card(2, 1);
        hand7[2] = new Card(3, 2);
        hand7[3] = new Card(4, 2);
        hand7[4] = new Card(2, 4);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 1);
        hand8[1] = new Card(4, 1);
        hand8[2] = new Card(3, 2);
        hand8[3] = new Card(4, 3);
        hand8[4] = new Card(4, 4);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 2);
        hand9[1] = new Card(2, 2);
        hand9[2] = new Card(1, 1);
        hand9[3] = new Card(1, 3);
        hand9[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 4);
        hand10[1] = new Card(2, 4);
        hand10[2] = new Card(3, 2);
        hand10[3] = new Card(4, 3);
        hand10[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createTwoPairHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(2, 1);
        hand1[2] = new Card(1, 2);
        hand1[3] = new Card(2, 2);
        hand1[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(3, 2);
        hand2[2] = new Card(3, 3);
        hand2[3] = new Card(4, 3);
        hand2[4] = new Card(4, 2);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(4, 3);
        hand3[2] = new Card(3, 4);
        hand3[3] = new Card(4, 4);
        hand3[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(1, 1);
        hand4[1] = new Card(4, 1);
        hand4[2] = new Card(2, 2);
        hand4[3] = new Card(3, 2);
        hand4[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 6);
        hand5[1] = new Card(4, 6);
        hand5[2] = new Card(1, 5);
        hand5[3] = new Card(4, 5);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 1);
        hand6[2] = new Card(1, 2);
        hand6[3] = new Card(1, 3);
        hand6[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(1, 1);
        hand7[1] = new Card(2, 1);
        hand7[2] = new Card(3, 1);
        hand7[3] = new Card(4, 3);
        hand7[4] = new Card(2, 4);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 1);
        hand8[1] = new Card(4, 1);
        hand8[2] = new Card(3, 2);
        hand8[3] = new Card(4, 3);
        hand8[4] = new Card(4, 4);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 2);
        hand9[1] = new Card(2, 2);
        hand9[2] = new Card(1, 1);
        hand9[3] = new Card(1, 3);
        hand9[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 4);
        hand10[1] = new Card(2, 4);
        hand10[2] = new Card(3, 2);
        hand10[3] = new Card(4, 3);
        hand10[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }
    
    private List<HandsJudge> createOnePairHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(2, 1);
        hand1[2] = new Card(1, 2);
        hand1[3] = new Card(2, 3);
        hand1[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(3, 2);
        hand2[2] = new Card(3, 3);
        hand2[3] = new Card(4, 3);
        hand2[4] = new Card(4, 2);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(4, 3);
        hand3[2] = new Card(3, 4);
        hand3[3] = new Card(4, 4);
        hand3[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(1, 4);
        hand4[1] = new Card(4, 4);
        hand4[2] = new Card(2, 2);
        hand4[3] = new Card(3, 3);
        hand4[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 6);
        hand5[1] = new Card(4, 6);
        hand5[2] = new Card(1, 5);
        hand5[3] = new Card(4, 5);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 5);
        hand6[2] = new Card(1, 2);
        hand6[3] = new Card(1, 3);
        hand6[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(1, 1);
        hand7[1] = new Card(2, 2);
        hand7[2] = new Card(3, 3);
        hand7[3] = new Card(4, 4);
        hand7[4] = new Card(2, 5);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 2);
        hand8[1] = new Card(4, 3);
        hand8[2] = new Card(3, 4);
        hand8[3] = new Card(4, 5);
        hand8[4] = new Card(4, 6);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 1);
        hand9[1] = new Card(1, 2);
        hand9[2] = new Card(1, 3);
        hand9[3] = new Card(1, 4);
        hand9[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 1);
        hand10[1] = new Card(2, 2);
        hand10[2] = new Card(3, 3);
        hand10[3] = new Card(4, 4);
        hand10[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }
    
    private List<HandsJudge> createFourCardHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(2, 1);
        hand1[2] = new Card(3, 1);
        hand1[3] = new Card(4, 1);
        hand1[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(3, 2);
        hand2[2] = new Card(4, 2);
        hand2[3] = new Card(1, 2);
        hand2[4] = new Card(2, 3);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(4, 3);
        hand3[2] = new Card(1, 3);
        hand3[3] = new Card(2, 3);
        hand3[4] = new Card(3, 4);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(1, 4);
        hand4[2] = new Card(2, 4);
        hand4[3] = new Card(3, 4);
        hand4[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(4, 5);
        hand5[1] = new Card(3, 5);
        hand5[2] = new Card(2, 5);
        hand5[3] = new Card(1, 5);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 1);
        hand6[2] = new Card(3, 1);
        hand6[3] = new Card(1, 3);
        hand6[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(3, 2);
        hand7[2] = new Card(4, 2);
        hand7[3] = new Card(4, 4);
        hand7[4] = new Card(2, 5);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 6);
        hand8[1] = new Card(4, 6);
        hand8[2] = new Card(2, 6);
        hand8[3] = new Card(1, 1);
        hand8[4] = new Card(4, 2);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 1);
        hand9[1] = new Card(1, 2);
        hand9[2] = new Card(1, 3);
        hand9[3] = new Card(1, 4);
        hand9[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 1);
        hand10[1] = new Card(2, 2);
        hand10[2] = new Card(3, 3);
        hand10[3] = new Card(4, 4);
        hand10[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }
    
    private List<HandsJudge> createFullHouseHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(2, 1);
        hand1[2] = new Card(3, 1);
        hand1[3] = new Card(2, 2);
        hand1[4] = new Card(3, 2);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(3, 2);
        hand2[2] = new Card(4, 2);
        hand2[3] = new Card(1, 1);
        hand2[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(4, 3);
        hand3[2] = new Card(1, 3);
        hand3[3] = new Card(4, 4);
        hand3[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(1, 4);
        hand4[2] = new Card(2, 4);
        hand4[3] = new Card(3, 2);
        hand4[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 5);
        hand5[1] = new Card(2, 5);
        hand5[2] = new Card(3, 5);
        hand5[3] = new Card(4, 6);
        hand5[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 1);
        hand6[2] = new Card(3, 1);
        hand6[3] = new Card(1, 3);
        hand6[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(1, 1);
        hand7[1] = new Card(2, 1);
        hand7[2] = new Card(3, 2);
        hand7[3] = new Card(4, 2);
        hand7[4] = new Card(2, 4);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 1);
        hand8[1] = new Card(4, 1);
        hand8[2] = new Card(3, 2);
        hand8[3] = new Card(4, 3);
        hand8[4] = new Card(4, 4);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 2);
        hand9[1] = new Card(2, 2);
        hand9[2] = new Card(1, 1);
        hand9[3] = new Card(1, 3);
        hand9[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 4);
        hand10[1] = new Card(2, 4);
        hand10[2] = new Card(3, 2);
        hand10[3] = new Card(4, 3);
        hand10[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }
    
    private List<HandsJudge> createStraightHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(2, 2);
        hand1[2] = new Card(3, 3);
        hand1[3] = new Card(2, 4);
        hand1[4] = new Card(3, 5);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(3, 3);
        hand2[2] = new Card(4, 4);
        hand2[3] = new Card(1, 5);
        hand2[4] = new Card(4, 6);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(4, 4);
        hand3[2] = new Card(1, 5);
        hand3[3] = new Card(4, 6);
        hand3[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(1, 5);
        hand4[2] = new Card(2, 6);
        hand4[3] = new Card(3, 2);
        hand4[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 5);
        hand5[1] = new Card(2, 6);
        hand5[2] = new Card(3, 2);
        hand5[3] = new Card(4, 3);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 2);
        hand6[2] = new Card(3, 3);
        hand6[3] = new Card(1, 4);
        hand6[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(1, 2);
        hand7[1] = new Card(2, 3);
        hand7[2] = new Card(3, 4);
        hand7[3] = new Card(4, 5);
        hand7[4] = new Card(2, 5);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 3);
        hand8[1] = new Card(4, 4);
        hand8[2] = new Card(3, 5);
        hand8[3] = new Card(4, 6);
        hand8[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 4);
        hand9[1] = new Card(2, 5);
        hand9[2] = new Card(1, 6);
        hand9[3] = new Card(1, 1);
        hand9[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 5);
        hand10[1] = new Card(2, 6);
        hand10[2] = new Card(3, 1);
        hand10[3] = new Card(4, 2);
        hand10[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createFlashHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(1, 2);
        hand1[2] = new Card(1, 3);
        hand1[3] = new Card(1, 4);
        hand1[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(2, 3);
        hand2[2] = new Card(2, 4);
        hand2[3] = new Card(2, 5);
        hand2[4] = new Card(2, 1);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(3, 4);
        hand3[2] = new Card(3, 5);
        hand3[3] = new Card(3, 6);
        hand3[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(4, 5);
        hand4[2] = new Card(4, 6);
        hand4[3] = new Card(4, 1);
        hand4[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 5);
        hand5[1] = new Card(1, 6);
        hand5[2] = new Card(1, 2);
        hand5[3] = new Card(1, 3);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(1, 2);
        hand6[2] = new Card(1, 3);
        hand6[3] = new Card(1, 4);
        hand6[4] = new Card(2, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(2, 3);
        hand7[2] = new Card(2, 4);
        hand7[3] = new Card(3, 5);
        hand7[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 3);
        hand8[1] = new Card(4, 4);
        hand8[2] = new Card(3, 5);
        hand8[3] = new Card(4, 6);
        hand8[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 4);
        hand9[1] = new Card(2, 5);
        hand9[2] = new Card(1, 6);
        hand9[3] = new Card(1, 1);
        hand9[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 5);
        hand10[1] = new Card(2, 6);
        hand10[2] = new Card(3, 1);
        hand10[3] = new Card(4, 2);
        hand10[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }
    
    private List<HandsJudge> createStraightFlashHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(1, 2);
        hand1[2] = new Card(1, 3);
        hand1[3] = new Card(1, 4);
        hand1[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(2, 3);
        hand2[2] = new Card(2, 4);
        hand2[3] = new Card(2, 5);
        hand2[4] = new Card(2, 6);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(3, 4);
        hand3[2] = new Card(3, 5);
        hand3[3] = new Card(3, 6);
        hand3[4] = new Card(3, 2);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(4, 5);
        hand4[2] = new Card(4, 6);
        hand4[3] = new Card(4, 2);
        hand4[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 5);
        hand5[1] = new Card(1, 6);
        hand5[2] = new Card(1, 2);
        hand5[3] = new Card(1, 3);
        hand5[4] = new Card(1, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(2, 2);
        hand6[2] = new Card(3, 3);
        hand6[3] = new Card(2, 4);
        hand6[4] = new Card(3, 5);
        handsJudgeList.add(new HandsJudge(hand6, true));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(3, 3);
        hand7[2] = new Card(4, 4);
        hand7[3] = new Card(1, 5);
        hand7[4] = new Card(4, 6);
        handsJudgeList.add(new HandsJudge(hand7, true));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 3);
        hand8[1] = new Card(4, 4);
        hand8[2] = new Card(1, 5);
        hand8[3] = new Card(4, 6);
        hand8[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand8, true));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(4, 4);
        hand9[1] = new Card(1, 5);
        hand9[2] = new Card(2, 6);
        hand9[3] = new Card(3, 2);
        hand9[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand9, true));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 5);
        hand10[1] = new Card(1, 6);
        hand10[2] = new Card(1, 2);
        hand10[3] = new Card(1, 3);
        hand10[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand10, true));
        
        return handsJudgeList;
    }
    
    private List<HandsJudge> createSunshineHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(1, 2);
        hand1[2] = new Card(4, 1);
        hand1[3] = new Card(4, 2);
        hand1[4] = new Card(2, 1);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(1, 2);
        hand2[1] = new Card(1, 3);
        hand2[2] = new Card(4, 2);
        hand2[3] = new Card(4, 3);
        hand2[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(4, 3);
        hand3[1] = new Card(4, 4);
        hand3[2] = new Card(1, 3);
        hand3[3] = new Card(1, 4);
        hand3[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(1, 5);
        hand4[1] = new Card(4, 5);
        hand4[2] = new Card(1, 6);
        hand4[3] = new Card(4, 6);
        hand4[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(4, 4);
        hand5[1] = new Card(1, 6);
        hand5[2] = new Card(1, 4);
        hand5[3] = new Card(4, 6);
        hand5[4] = new Card(2, 3);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(1, 3);
        hand6[2] = new Card(3, 1);
        hand6[3] = new Card(3, 3);
        hand6[4] = new Card(2, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(2, 3);
        hand7[2] = new Card(4, 2);
        hand7[3] = new Card(4, 3);
        hand7[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(1, 4);
        hand8[1] = new Card(4, 4);
        hand8[2] = new Card(1, 5);
        hand8[3] = new Card(4, 6);
        hand8[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 4);
        hand9[1] = new Card(2, 5);
        hand9[2] = new Card(1, 6);
        hand9[3] = new Card(1, 1);
        hand9[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 5);
        hand10[1] = new Card(2, 6);
        hand10[2] = new Card(3, 1);
        hand10[3] = new Card(4, 2);
        hand10[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createTwinSunHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 2);
        hand1[1] = new Card(1, 4);
        hand1[2] = new Card(1, 6);
        hand1[3] = new Card(2, 2);
        hand1[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(1, 2);
        hand2[1] = new Card(1, 4);
        hand2[2] = new Card(4, 2);
        hand2[3] = new Card(4, 4);
        hand2[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(1, 2);
        hand3[1] = new Card(1, 6);
        hand3[2] = new Card(2, 2);
        hand3[3] = new Card(2, 6);
        hand3[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(1, 4);
        hand4[1] = new Card(1, 6);
        hand4[2] = new Card(3, 6);
        hand4[3] = new Card(4, 6);
        hand4[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 2);
        hand5[1] = new Card(1, 3);
        hand5[2] = new Card(1, 4);
        hand5[3] = new Card(1, 5);
        hand5[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(2, 2);
        hand6[1] = new Card(2, 4);
        hand6[2] = new Card(2, 6);
        hand6[3] = new Card(1, 3);
        hand6[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(3, 2);
        hand7[1] = new Card(3, 4);
        hand7[2] = new Card(3, 6);
        hand7[3] = new Card(1, 3);
        hand7[4] = new Card(2, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(4, 6);
        hand8[1] = new Card(4, 4);
        hand8[2] = new Card(4, 2);
        hand8[3] = new Card(1, 4);
        hand8[4] = new Card(1, 1);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 4);
        hand9[1] = new Card(2, 5);
        hand9[2] = new Card(3, 6);
        hand9[3] = new Card(3, 1);
        hand9[4] = new Card(3, 2);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 4);
        hand10[1] = new Card(2, 6);
        hand10[2] = new Card(3, 1);
        hand10[3] = new Card(4, 2);
        hand10[4] = new Card(1, 3);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createStarFlashHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(4, 1);
        hand1[1] = new Card(4, 2);
        hand1[2] = new Card(4, 3);
        hand1[3] = new Card(4, 4);
        hand1[4] = new Card(4, 6);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(4, 2);
        hand2[1] = new Card(4, 3);
        hand2[2] = new Card(4, 4);
        hand2[3] = new Card(4, 5);
        hand2[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(4, 3);
        hand3[1] = new Card(4, 4);
        hand3[2] = new Card(4, 5);
        hand3[3] = new Card(4, 6);
        hand3[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 4);
        hand4[1] = new Card(4, 5);
        hand4[2] = new Card(4, 6);
        hand4[3] = new Card(4, 1);
        hand4[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(4, 5);
        hand5[1] = new Card(4, 6);
        hand5[2] = new Card(4, 2);
        hand5[3] = new Card(4, 3);
        hand5[4] = new Card(4, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(1, 2);
        hand6[2] = new Card(1, 3);
        hand6[3] = new Card(1, 4);
        hand6[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(2, 3);
        hand7[2] = new Card(2, 4);
        hand7[3] = new Card(2, 5);
        hand7[4] = new Card(2, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 3);
        hand8[1] = new Card(3, 4);
        hand8[2] = new Card(3, 5);
        hand8[3] = new Card(3, 6);
        hand8[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(4, 4);
        hand9[1] = new Card(4, 5);
        hand9[2] = new Card(4, 6);
        hand9[3] = new Card(4, 1);
        hand9[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(4, 5);
        hand10[1] = new Card(4, 6);
        hand10[2] = new Card(4, 1);
        hand10[3] = new Card(2, 2);
        hand10[4] = new Card(2, 3);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createDiaHouseHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(2, 1);
        hand1[1] = new Card(2, 2);
        hand1[2] = new Card(2, 3);
        hand1[3] = new Card(2, 4);
        hand1[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(2, 3);
        hand2[2] = new Card(2, 4);
        hand2[3] = new Card(2, 5);
        hand2[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(2, 3);
        hand3[1] = new Card(2, 4);
        hand3[2] = new Card(2, 5);
        hand3[3] = new Card(2, 6);
        hand3[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(2, 4);
        hand4[1] = new Card(2, 5);
        hand4[2] = new Card(2, 6);
        hand4[3] = new Card(1, 3);
        hand4[4] = new Card(2, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(2, 5);
        hand5[1] = new Card(2, 6);
        hand5[2] = new Card(1, 6);
        hand5[3] = new Card(2, 3);
        hand5[4] = new Card(2, 4);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(1, 2);
        hand6[2] = new Card(1, 3);
        hand6[3] = new Card(1, 4);
        hand6[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(3, 2);
        hand7[1] = new Card(3, 3);
        hand7[2] = new Card(3, 4);
        hand7[3] = new Card(3, 5);
        hand7[4] = new Card(2, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(4, 3);
        hand8[1] = new Card(4, 4);
        hand8[2] = new Card(4, 5);
        hand8[3] = new Card(4, 6);
        hand8[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(2, 1);
        hand9[1] = new Card(2, 2);
        hand9[2] = new Card(2, 3);
        hand9[3] = new Card(1, 4);
        hand9[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(2, 1);
        hand10[1] = new Card(2, 3);
        hand10[2] = new Card(2, 4);
        hand10[3] = new Card(3, 5);
        hand10[4] = new Card(4, 6);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createSpadeLeaderHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(3, 1);
        hand1[1] = new Card(3, 3);
        hand1[2] = new Card(3, 5);
        hand1[3] = new Card(1, 1);
        hand1[4] = new Card(2, 3);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(3, 3);
        hand2[1] = new Card(3, 5);
        hand2[2] = new Card(3, 1);
        hand2[3] = new Card(2, 5);
        hand2[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 5);
        hand3[1] = new Card(3, 3);
        hand3[2] = new Card(3, 1);
        hand3[3] = new Card(1, 6);
        hand3[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(2, 4);
        hand4[1] = new Card(2, 5);
        hand4[2] = new Card(3, 1);
        hand4[3] = new Card(3, 5);
        hand4[4] = new Card(3, 3);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(2, 5);
        hand5[1] = new Card(3, 1);
        hand5[2] = new Card(3, 5);
        hand5[3] = new Card(3, 3);
        hand5[4] = new Card(2, 1);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(3, 1);
        hand6[1] = new Card(3, 5);
        hand6[2] = new Card(3, 2);
        hand6[3] = new Card(3, 4);
        hand6[4] = new Card(3, 6);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(3, 1);
        hand7[1] = new Card(3, 5);
        hand7[2] = new Card(1, 3);
        hand7[3] = new Card(2, 5);
        hand7[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(4, 1);
        hand8[1] = new Card(3, 5);
        hand8[2] = new Card(3, 3);
        hand8[3] = new Card(4, 5);
        hand8[4] = new Card(4, 3);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(2, 1);
        hand9[1] = new Card(2, 3);
        hand9[2] = new Card(2, 5);
        hand9[3] = new Card(3, 3);
        hand9[4] = new Card(3, 5);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(4, 5);
        hand10[1] = new Card(4, 4);
        hand10[2] = new Card(3, 1);
        hand10[3] = new Card(3, 3);
        hand10[4] = new Card(3, 6);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createSpadeDiaMixHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(2, 1);
        hand1[1] = new Card(2, 2);
        hand1[2] = new Card(2, 3);
        hand1[3] = new Card(3, 4);
        hand1[4] = new Card(3, 5);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(2, 3);
        hand2[2] = new Card(3, 4);
        hand2[3] = new Card(3, 5);
        hand2[4] = new Card(3, 6);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(3, 4);
        hand3[2] = new Card(3, 5);
        hand3[3] = new Card(3, 6);
        hand3[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(2, 4);
        hand4[1] = new Card(3, 5);
        hand4[2] = new Card(2, 6);
        hand4[3] = new Card(3, 3);
        hand4[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(3, 5);
        hand5[1] = new Card(2, 6);
        hand5[2] = new Card(3, 4);
        hand5[3] = new Card(2, 3);
        hand5[4] = new Card(3, 2);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(3, 1);
        hand6[1] = new Card(3, 2);
        hand6[2] = new Card(3, 3);
        hand6[3] = new Card(3, 4);
        hand6[4] = new Card(3, 5);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(2, 3);
        hand7[2] = new Card(2, 4);
        hand7[3] = new Card(2, 5);
        hand7[4] = new Card(2, 6);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(2, 1);
        hand8[1] = new Card(2, 3);
        hand8[2] = new Card(3, 4);
        hand8[3] = new Card(3, 5);
        hand8[4] = new Card(3, 6);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(3, 1);
        hand9[1] = new Card(3, 2);
        hand9[2] = new Card(3, 3);
        hand9[3] = new Card(2, 5);
        hand9[4] = new Card(2, 6);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(2, 1);
        hand10[1] = new Card(2, 2);
        hand10[2] = new Card(3, 3);
        hand10[3] = new Card(3, 4);
        hand10[4] = new Card(4, 5);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createMarkWonderHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(1, 2);
        hand1[2] = new Card(1, 3);
        hand1[3] = new Card(2, 1);
        hand1[4] = new Card(3, 3);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(2, 2);
        hand2[1] = new Card(2, 3);
        hand2[2] = new Card(2, 4);
        hand2[3] = new Card(4, 1);
        hand2[4] = new Card(4, 5);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(3, 3);
        hand3[1] = new Card(3, 4);
        hand3[2] = new Card(3, 5);
        hand3[3] = new Card(2, 1);
        hand3[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(4, 5);
        hand4[1] = new Card(4, 3);
        hand4[2] = new Card(4, 4);
        hand4[3] = new Card(3, 3);
        hand4[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(2, 5);
        hand5[1] = new Card(2, 6);
        hand5[2] = new Card(2, 4);
        hand5[3] = new Card(4, 1);
        hand5[4] = new Card(4, 2);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(1, 1);
        hand6[1] = new Card(1, 2);
        hand6[2] = new Card(1, 4);
        hand6[3] = new Card(3, 3);
        hand6[4] = new Card(3, 5);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(2, 2);
        hand7[1] = new Card(2, 3);
        hand7[2] = new Card(2, 5);
        hand7[3] = new Card(3, 4);
        hand7[4] = new Card(4, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(3, 1);
        hand8[1] = new Card(3, 3);
        hand8[2] = new Card(3, 4);
        hand8[3] = new Card(1, 2);
        hand8[4] = new Card(2, 2);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(4, 4);
        hand9[1] = new Card(4, 5);
        hand9[2] = new Card(4, 2);
        hand9[3] = new Card(2, 5);
        hand9[4] = new Card(2, 6);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 6);
        hand10[1] = new Card(1, 5);
        hand10[2] = new Card(1, 3);
        hand10[3] = new Card(1, 2);
        hand10[4] = new Card(2, 4);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    private List<HandsJudge> createSunArchHandsJudgeList() {
        List<HandsJudge> handsJudgeList = new ArrayList<HandsJudge>();
        
        Card[] hand1 = new Card[HANDS_SIZE];
        hand1[0] = new Card(1, 1);
        hand1[1] = new Card(1, 2);
        hand1[2] = new Card(1, 3);
        hand1[3] = new Card(1, 4);
        hand1[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand1, true));
        
        Card[] hand2 = new Card[HANDS_SIZE];
        hand2[0] = new Card(1, 2);
        hand2[1] = new Card(1, 3);
        hand2[2] = new Card(1, 4);
        hand2[3] = new Card(1, 1);
        hand2[4] = new Card(1, 5);
        handsJudgeList.add(new HandsJudge(hand2, true));
        
        Card[] hand3 = new Card[HANDS_SIZE];
        hand3[0] = new Card(1, 3);
        hand3[1] = new Card(1, 4);
        hand3[2] = new Card(1, 5);
        hand3[3] = new Card(1, 6);
        hand3[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand3, true));
        
        Card[] hand4 = new Card[HANDS_SIZE];
        hand4[0] = new Card(1, 5);
        hand4[1] = new Card(1, 3);
        hand4[2] = new Card(1, 4);
        hand4[3] = new Card(1, 6);
        hand4[4] = new Card(1, 2);
        handsJudgeList.add(new HandsJudge(hand4, true));
        
        Card[] hand5 = new Card[HANDS_SIZE];
        hand5[0] = new Card(1, 2);
        hand5[1] = new Card(1, 3);
        hand5[2] = new Card(1, 4);
        hand5[3] = new Card(1, 5);
        hand5[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand5, true));
        
        Card[] hand6 = new Card[HANDS_SIZE];
        hand6[0] = new Card(2, 1);
        hand6[1] = new Card(2, 3);
        hand6[2] = new Card(2, 4);
        hand6[3] = new Card(2, 2);
        hand6[4] = new Card(2, 5);
        handsJudgeList.add(new HandsJudge(hand6, false));
        
        Card[] hand7 = new Card[HANDS_SIZE];
        hand7[0] = new Card(3, 2);
        hand7[1] = new Card(3, 3);
        hand7[2] = new Card(3, 5);
        hand7[3] = new Card(3, 4);
        hand7[4] = new Card(3, 1);
        handsJudgeList.add(new HandsJudge(hand7, false));
        
        Card[] hand8 = new Card[HANDS_SIZE];
        hand8[0] = new Card(4, 1);
        hand8[1] = new Card(4, 3);
        hand8[2] = new Card(4, 4);
        hand8[3] = new Card(4, 2);
        hand8[4] = new Card(4, 5);
        handsJudgeList.add(new HandsJudge(hand8, false));
        
        Card[] hand9 = new Card[HANDS_SIZE];
        hand9[0] = new Card(1, 1);
        hand9[1] = new Card(1, 2);
        hand9[2] = new Card(1, 3);
        hand9[3] = new Card(1, 4);
        hand9[4] = new Card(1, 6);
        handsJudgeList.add(new HandsJudge(hand9, false));
        
        Card[] hand10 = new Card[HANDS_SIZE];
        hand10[0] = new Card(1, 1);
        hand10[1] = new Card(1, 2);
        hand10[2] = new Card(1, 3);
        hand10[3] = new Card(1, 4);
        hand10[4] = new Card(2, 5);
        handsJudgeList.add(new HandsJudge(hand10, false));
        
        return handsJudgeList;
    }

    class HandsJudge{
        private Card[] hands;
        private boolean established;
        
        public HandsJudge(Card[] hands, boolean established) {
            this.hands = hands;
            this.established = established;
        }
        
        public void setHands(Card[] hands) {
            this.hands = hands;
        }
        public Card[] getHands() {
            return this.hands;
        }
        public void setEstablished(boolean established) {
            this.established = established;
        }
        public boolean isEstablished() {
            return this.established;
        }
    }
}

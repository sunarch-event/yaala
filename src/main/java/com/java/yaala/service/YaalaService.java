package com.java.yaala.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.yaala.bean.Card;
import com.java.yaala.bean.Hand;
import com.java.yaala.bean.YaalaHand;

@Service
public class YaalaService {

    public List<Hand> getJudgedHandList(Card[] cards) {
        
        List<Hand> judgedHandList = new ArrayList<Hand>();
        
        for(YaalaHand yaalaHand : YaalaHand.values()) {
            Hand hand = new Hand();
            hand.setYaalaHand(yaalaHand);
            hand.setEstablished(judgedmentHand(yaalaHand, cards));
            judgedHandList.add(hand);
        }
        
        return judgedHandList;
    }
    
    public boolean judgedmentHand(YaalaHand handName, Card[] cards) {
        
        boolean result = false;
        
        switch(handName) {
            case NOHANDS:
                result = true;
                break;
            case ONEPAIR:
                result = JudgementHandUtil.judgementOnePair(cards);
                break;
            case TWOPAIR:
                result = JudgementHandUtil.judgementTwoPair(cards);
                break;
            case THREECARD:
                result = JudgementHandUtil.judgementThreeCard(cards);
                break;
            case FOURCARD:
                result = JudgementHandUtil.judgementFourCard(cards);
                break;
            case FULLHOUSE:
                result = JudgementHandUtil.judgementFullHouse(cards);
                break;
            case STRAIGHT:
                result = JudgementHandUtil.judgementStraight(cards);
                break;
            case FLASH:
                result = JudgementHandUtil.judgementFlash(cards);
                break;
            case STRAIGHTFLASH:
                result = JudgementHandUtil.judgementStraightFlash(cards);
                break;
            case SUNSHINE:
                result = JudgementHandUtil.judgementSunshine(cards);
                break;
            case TWINSUN:
                result = JudgementHandUtil.judgementTwinSun(cards);
                break;
            case STARFLASH:
                result = JudgementHandUtil.judgementStarFlash(cards);
                break;
            case DIAHOUSE:
                result = JudgementHandUtil.judgementDiaHouse(cards);
                break;
            case SPADELEADER:
                result = JudgementHandUtil.judgementSpadeLeader(cards);
                break;
            case SPADEDIAMIX:
                result = JudgementHandUtil.judgementSpadeLeader(cards);
                break;
            case MARKWONDER:
                result = JudgementHandUtil.judgementMarkWonder(cards);
                break;
            case SUNARCH:
                result = JudgementHandUtil.judgementSunArch(cards);
                break;
            default:
                break;
        }
        return result;
    }
}

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
            case THREECARD:
                result = JudgementHandUtil.judgementThreeCard(cards);
                break;
            case TWOPAIR:
                result = JudgementHandUtil.judgementTwoPair(cards);
                break;
            default:
                break;
        }
        return result;
    }
}

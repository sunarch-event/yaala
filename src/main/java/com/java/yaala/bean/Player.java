package com.java.yaala.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Player {

    int point;
    List<YaalaHand> usedHand = new ArrayList<YaalaHand>();

    public void addPoint(int point) {
        this.point = this.point + point;
    }
    
    public void addUsedYaalaHand(YaalaHand hand) {
        if(!YaalaHand.NOHANDS.equals(hand)) {
            this.usedHand.add(hand);
        }
    }
    
    public void resetUsedYaalaHand() {
        this.usedHand = new ArrayList<YaalaHand>();
    }
}

package com.java.yaala.bean;

public enum YaalaHand {
    NOHANDS("役なし", 0),
    AIBOU("相棒", 100),
    TYOUJOU("頂上", 200);
    
    final private String name;
    final private int point;
    
    YaalaHand(String name, int point){
        this.name = name;
        this.point = point;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPoint() {
        return point;
    }
}

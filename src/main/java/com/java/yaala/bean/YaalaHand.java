package com.java.yaala.bean;

public enum YaalaHand {
    NOHANDS("役なし", 0),
    ONEPAIR("ワンペア", 50),
    TWOPAIR("ツーペア", 100),
    THREECARD("スリーカード", 150),
    FOURCARD("フォーカード", 200),
    FULLHOUSE("フルハウス", 200),
    STRAIGHT("ストレート", 250),
    FLASH("フラッシュ", 250),
    STRAIGHTFLASH("ストレートフラッシュ", 350),
    SUNSHINE("サンシャイン", 300),
    TWINSUN("ツインサン", 250),
    STARFLASH("スターフラッシュ", 400),
    DIAHOUSE("ダイアハウス", 350),
    SPADELEADER("スペード・リーダー", 250),
    SPADEDIAMIX("スペード・ダイアミックス", 350),
    MARKWONDER("マークワンダー", 300),
    SUNARCH("サンアーチ", 9999);
    
    
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

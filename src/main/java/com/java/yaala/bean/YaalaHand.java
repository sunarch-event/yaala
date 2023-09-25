package com.java.yaala.bean;

public enum YaalaHand {
    NOHANDS("役なし", 0),
    AIBOU("相棒", 50),
    TYOUJOU("頂上", 150),
    RYUUNOTSUME("竜の爪", 200),
    NIPPAI("曰牌", 100),
    OOKAMINOYUUWAKU("オオカミの誘惑", 200),
    WAKAREMITI("分かれ道", 250),
    GANJOUNANAWA("頑丈な縄", 300),
    FLASH("フラッシュ", 250),
    STRAIGHTFLASH("ストレートフラッシュ", 350),
    SUNSHINE("サンシャイン", 300),
    TWINSUN("ツインシャイン", 250),
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

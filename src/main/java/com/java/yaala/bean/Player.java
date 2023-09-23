package com.java.yaala.bean;

import lombok.Data;

@Data
public class Player {

    int point;

    public void addPoint(int point) {
        this.point = this.point + point;
    }
}

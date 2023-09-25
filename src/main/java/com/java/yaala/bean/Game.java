package com.java.yaala.bean;

import lombok.Data;

@Data
public class Game {

    public static final int ENABLE_GAME_COUNT = 3;
    public static final int ENABEL_EXCHANGE_COUNT = 3;
    
    int gameCount = 0;
    int exchangeCount = 0;
    
    public void addGameCount() {
        gameCount++;
    }
    
    public void addExchangeCount() {
        exchangeCount++;
    }
    
    public boolean isLastGame() {
        return gameCount == ENABLE_GAME_COUNT;
    }
    
    public boolean isContinueGame() {
        return gameCount <= ENABLE_GAME_COUNT;
    }
    
    public boolean isExchange() {
        return exchangeCount < ENABEL_EXCHANGE_COUNT;
    }
    
    public void resetGame() {
        gameCount = 0;
        exchangeCount = 0;
    }
    
    public void resetExchange() {
        exchangeCount = 0;
    }
}

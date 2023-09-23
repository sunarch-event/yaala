package com.java.yaala.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YaalaConfig {

    @Bean
    public Game game() {
        return new Game();
    }
    
    @Bean
    public Deck deck() {
        return new Deck();
    }
    
    @Bean
    public Hands hands() {
        return new Hands();
    }
    
    @Bean
    public Player player() {
        return new Player();
    }
}

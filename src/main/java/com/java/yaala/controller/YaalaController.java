package com.java.yaala.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.yaala.bean.Card;
import com.java.yaala.bean.Deck;
import com.java.yaala.bean.Game;
import com.java.yaala.bean.Hand;
import com.java.yaala.bean.Hands;
import com.java.yaala.bean.Player;
import com.java.yaala.bean.YaalaHand;
import com.java.yaala.service.YaalaService;

@Controller
public class YaalaController {

    Game game;
    Deck deck;
    Hands hands;
    Player player;
    YaalaService service;
    
    public YaalaController(Game game, Deck deck, Hands hands, Player player, YaalaService service) {
        this.game = game;
        this.deck = deck;
        this.hands = hands;
        this.player = player;
        this.service = service;
    }
    
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
    @PostMapping("/start")
    public String start(Model model) {
        game.resetGame();
        game.addGameCount();
        deck.reload();
        deck.shuffle();
        hands.setCards(deck.deal());
        player.setPoint(0);
        player.resetUsedYaalaHand();
        List<Hand> judgedHandList = service.getJudgedHandList(hands.getCards());
        model.addAttribute("isExchange", game.isExchange());
        model.addAttribute("isContinueGame", game.isContinueGame());
        model.addAttribute("hands", hands);
        model.addAttribute("handList", judgedHandList);
        model.addAttribute("player", player);
        model.addAttribute("game", game);
        return "game";
    }
    
    @PostMapping("/change")
    public String change(@RequestParam("hands")int[] changeHands, Model model) {
        
        if(game.isExchange()) {
            Card[] handsCard = hands.getCards();
            
            for(int changeHand : changeHands) {
                handsCard[changeHand] = deck.redeal();
            }
            game.addExchangeCount();
        }
        List<Hand> judgedHandList = service.getJudgedHandList(hands.getCards());
        model.addAttribute("isExchange", game.isExchange());
        model.addAttribute("isContinueGame", game.isContinueGame());
        model.addAttribute("hands", hands);
        model.addAttribute("handList", judgedHandList);
        model.addAttribute("player", player);
        model.addAttribute("game", game);
        return "game";
    }
    
    @PostMapping("/showDown")
    public String showDown(@RequestParam("hand")YaalaHand hand, Model model) {
        
        if(game.isContinueGame()) {
            if(service.judgedmentHand(hand, hands.getCards())) {
                player.addPoint(hand.getPoint());
                player.addUsedYaalaHand(hand);
            }
            if(!game.isLastGame()) {
                deck.reload();
                deck.shuffle();
                hands.setCards(deck.deal());
            }
            game.resetExchange();
            game.addGameCount();
        }
        model.addAttribute("isContinueGame", game.isContinueGame());
        List<Hand> judgedHandList = service.getJudgedHandList(hands.getCards());
        model.addAttribute("isExchange", game.isExchange());
        model.addAttribute("hands", hands);
        model.addAttribute("handList", judgedHandList);
        model.addAttribute("player", player);
        model.addAttribute("game", game);
        return "game";
    }
}

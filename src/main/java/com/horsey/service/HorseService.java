package com.horsey.service;

import com.horsey.model.Bet;
import com.horsey.model.Horse;

import java.util.Map;

public interface HorseService {
    public Map getHorses();
    public Bet retrieveBet();
    public Integer getWinner();
    public void makeBet(Integer horse, Integer bet);
    public void displayHorses(Map<Integer, Horse> horses);
    public void setWinner(Integer key);
}

package com.example.rps;

import java.util.Random;

public class Computer {
     String[] moves = {"rock", "paper", "scissors"};
     Random random = new Random();
     int index = random.nextInt(moves.length);
     String move = moves[index];


    public String move() {
        return move;
    }
}

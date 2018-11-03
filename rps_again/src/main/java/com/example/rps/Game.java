package com.example.rps;

import java.util.Random;


public class Game {

Computer computer = new Computer ();

    public String move(String move){
        if (move.equals("rock")){
            return "You played rock";
        } else if (move.equals("paper")){
            return "You played paper";
        } else if (move.equals("scissors")){
            return "You played scissors";
        } else  {
            return "Not a move";
        }
    }

    public String play(String my_move){
        if (computer.move() == my_move) {
            return "Draw";
        } else if (computer.move() == "rock" && my_move.equals("paper") || computer.move().equals("paper") && my_move.equals("scissors")|| computer.move().equals("scissors") && my_move.equals("rock")){
            return "You won!";
        }
        else {
            return "You lost";
        }
    }
}

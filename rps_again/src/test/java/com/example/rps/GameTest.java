package com.example.rps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GameTest {

    @Mock
    Computer computer; //create a mock of Computer

    @InjectMocks
    Game game; //creates a game object that uses computer mock.

    @BeforeEach
    void init(){
        game = new Game();
        MockitoAnnotations.initMocks(this); //before each test run computer = mock(computer)
    }

    @Test
    void returnsMove(){
        assertEquals("You played rock", game.move("rock"));
        assertEquals("You played paper", game.move("paper"));
        assertEquals("You played scissors", game.move("scissors"));
        assertEquals("Not a move", game.move("fish"));
    }

    @Test
    void computerRock(){
        when(computer.move()).thenReturn("rock");
        assertEquals("You won!", game.play("paper"));
        assertEquals("Draw", game.play("rock"));
        assertEquals("You lost", game.play("scissors"));
    }

    @Test
    void computerPaper(){
        when(computer.move()).thenReturn("paper");
        assertEquals("You won!", game.play("scissors"));
        assertEquals("Draw", game.play("paper"));
        assertEquals("You lost", game.play("rock"));
    }

    @Test
    void computerScissors(){
        when(computer.move()).thenReturn("scissors");
        assertEquals("You won!", game.play("rock"));
        assertEquals("Draw", game.play("scissors"));
        assertEquals("You lost", game.play("paper"));
    }

}
package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.craps.CrapsGame;
import com.github.zipcodewilmington.casino.games.craps.CrapsPlayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CrapsTest {

    private CrapsPlayer crapsPlayer;

    @BeforeEach
    public void setUp() {
        crapsPlayer = new CrapsPlayer();
    }

    @Test
    public void testDiceRoll() {
        // Given
        int diceOne = CrapsPlayer.dieOne;
        int diceTwo = CrapsPlayer.dieTwo;
        int sumOfDice = diceOne + diceTwo;

        // expected
        boolean expectedSum = diceTwo >= 2 && diceTwo <= 12 || diceOne >= 2 && diceOne <= 12;

        // actual
        boolean actualSum = sumOfDice >= 2 && sumOfDice <= 12;

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testWinningRoll() {
        int num = CrapsPlayer.diceRoll();
        int winningNumOne = 7;
        int winningNumTwo = 11;

        boolean expectedWinningGame = num == 7 || num == 11;

        boolean actualWinningGame = num == winningNumOne || num == winningNumTwo ;

        Assert.assertEquals(expectedWinningGame, actualWinningGame);
    }

    @Test
    public void testLosingRoll() {
        int num = CrapsPlayer.diceRoll();
        int losingNumOne = 2;
        int losingNumTwo = 3;
        int losingNumThree = 12;

        boolean expectedLosingGame = num == 2 || num == 3 || num == 12;

        boolean actualLosingGame = num == losingNumOne || num == losingNumTwo || num == losingNumThree ;

        Assert.assertEquals(expectedLosingGame, actualLosingGame);
    }

    @Test
    public void testPointRoll() {
        int num = CrapsPlayer.diceRoll();
        int crapsNumOne = 4;
        int crapsNumTwo = 5;
        int crapsNumThree = 6;
        int crapsNumFour = 8;
        int crapsNumFive = 9;
        int crapsNumSix = 10;

        boolean expectedPointNum = num == CrapsGame.pointRoll();

        boolean actualPointNum = num == crapsNumOne || num == crapsNumTwo || num == crapsNumThree || num == crapsNumFour || num == crapsNumFive || num == crapsNumSix;

        Assert.assertEquals(expectedPointNum, actualPointNum);

    }


}

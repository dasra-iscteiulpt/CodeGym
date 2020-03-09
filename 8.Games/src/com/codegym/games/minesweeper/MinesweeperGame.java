package com.codegym.games.minesweeper;
import com.codegym.engine.cell.*;


public class MinesweeperGame extends Game {
    private final static int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();


    }

    private void createGame() {
        GameObject go=null;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j]=new GameObject(j,i);
                setCellColor(i, j, Color.LIGHTPINK);
            }
            }
        }
    }


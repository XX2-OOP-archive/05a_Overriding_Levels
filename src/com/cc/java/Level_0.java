package com.cc.java;

public class Level_0 extends Level_1{

    private String levelName = "Level 0";
    private int points= 10;

    public String play(){
        if (LevelManager.isPlayerInLevel_0()) {
            return "Yahoo, " + levelName + " here, and I have " + points + " points!";
        } else {
            return super.play();
        }
    }

    
}

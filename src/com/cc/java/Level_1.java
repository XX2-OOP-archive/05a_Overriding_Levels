package com.cc.java;

public class Level_1 extends Level_2{
    
    private String levelName = "Level 1";
    private int points= 100;

    public String play(){
      if (LevelManager.isPlayerInLevel_1()) {
        return "Yahoo, " + levelName + " here, and I have " + points + " points!";
      } else {
          return super.play();
      }
    }

}

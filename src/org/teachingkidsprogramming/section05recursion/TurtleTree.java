package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.setPenWidth(10); // 5
    Tortoise.setX(650);
    Tortoise.setY(500);
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.DarkGray);
    int lengthOfBranch = 120; // 60
    drawBranch(lengthOfBranch);
  }
  private static void drawBranch(int lengthOfBranch)
  {
    if (lengthOfBranch > 0)
    {
      adjustColor(lengthOfBranch);
      Tortoise.move(lengthOfBranch);
      drawLowerBranches(lengthOfBranch);
    }
  }
  private static void adjustColor(int lengthOfBranch)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Blues.AliceBlue);
    colors.put(20, PenColors.Blues.Aqua);
    colors.put(30, PenColors.Blues.Aquamarine);
    colors.put(40, PenColors.Blues.Azure);
    colors.put(50, PenColors.Blues.Blue);
    colors.put(60, PenColors.Blues.CadetBlue);
    Tortoise.setPenColor(colors.get(lengthOfBranch));
  }
  private static void drawLowerBranches(int lengthOfBranch)
  {
    Tortoise.turn(30); // 30
    drawShorterBranch(lengthOfBranch);
    Tortoise.turn(-60); // -60
    drawShorterBranch(lengthOfBranch);
    Tortoise.turn(30); //30
    adjustColor(lengthOfBranch);
    Tortoise.move(-lengthOfBranch); // #11
    drawShorterBranch(lengthOfBranch);
  }
  private static void drawShorterBranch(int lengthOfBranch)
  {
    drawBranch(lengthOfBranch - 10); // #4
  }
}
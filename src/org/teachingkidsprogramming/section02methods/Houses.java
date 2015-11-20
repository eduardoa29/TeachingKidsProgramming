package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawFlatHouse(height);
    drawPointedHouse(120);
    drawSlantyHouse(90);
    drawStepHouse(50);
  }
  private static void drawFlatHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(20);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
  }
  private static void drawPointedHouse(int height)
  {
    Tortoise.turn(-90);
    Tortoise.move(120);
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(45);
    Tortoise.move(120);
    Tortoise.turn(-90);
    Tortoise.move(20);
  }
  private static void drawSlantyHouse(int height)
  {
    Tortoise.turn(-90);
    Tortoise.move(100);
    Tortoise.turn(45);
    Tortoise.move(45);
    Tortoise.turn(135);
    Tortoise.move(131);
    Tortoise.turn(-90);
    Tortoise.move(20);
  }
  private static void drawStepHouse(int height)
  {
    Tortoise.turn(-90);
    Tortoise.move(70);
    for (int i = 0; i < 2; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(10);
      Tortoise.turn(-90);
      Tortoise.move(10);
    }
    Tortoise.turn(90);
    Tortoise.move(10);
    for (int i = 0; i < 2; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(10);
      Tortoise.turn(-90);
      Tortoise.move(10);
    }
    Tortoise.turn(90);
    Tortoise.move(70);
    Tortoise.turn(-90);
  }
}

package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.setX(500);
    Tortoise.setY(300);
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Black);
    double length = 10.5; // 10.5
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      length = weaveOneLayer(length, zoom);
      zoom = zoom * 1.7;
    }
  }
  private static double weaveOneLayer(double length, double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(length);
      Tortoise.turn(360 / 3);
      length = length + zoom;
    }
    return length;
  }
  private static void drawTriangle(double length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 9);
    }
  }
  private static double length()
  {
    return 10.5;
  }
}

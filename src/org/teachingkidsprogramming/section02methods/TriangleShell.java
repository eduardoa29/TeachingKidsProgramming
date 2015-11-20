package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 50; i++)
    {
      Tortoise.setPenColor(PenColors.Reds.Red);
      length = length + 4;
      drawTriangle();
      Tortoise.turn(360 / 40);
    }
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 5);
    }
  }
}

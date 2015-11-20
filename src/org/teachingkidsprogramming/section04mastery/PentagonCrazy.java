package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 500; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(1);
      Tortoise.turn(360 / 5 + 3);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (4 < Tortoise.getPenWidth())
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.Magenta);
    ColorWheel.addColor(PenColors.Greens.Chartreuse);
    ColorWheel.addColor(PenColors.Blues.DodgerBlue);
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Purples.Indigo);
  }
}

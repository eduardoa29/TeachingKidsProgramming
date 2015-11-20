package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 0; i < 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      drawOctagonWithOverlap();
      Tortoise.turn(360 / 30);
      //       Turn the tortoise 5 more degrees to the right --#12
      Tortoise.turn(+5);
    }
  }
  private static void drawOctagonWithOverlap()
  {
    for (int i = 0; i < 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Pinks.HotPink);
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Purples.Fuchsia);
    ColorWheel.addColor(PenColors.Oranges.OrangeRed);
    ColorWheel.addColor(PenColors.Pinks.DeepPink);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
  }
}
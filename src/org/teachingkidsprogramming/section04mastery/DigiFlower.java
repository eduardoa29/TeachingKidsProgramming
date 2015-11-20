package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Silver);
    Tortoise.setPenWidth(3);
    createColorPalette();
    for (int i = 0; i < 15; i++)
    {
      drawOctogon();
      Tortoise.turn(360 / 15);
    }
    createColorPalette();
    drawOctogon();
  }
  private static void drawOctogon()
  {
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.setPenColor(PenColors.Oranges.DarkOrange);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    Tortoise.setPenColor(PenColors.Yellows.Yellow);
    //
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Oranges.DarkOrange);
    ColorWheel.addColor(PenColors.Yellows.Gold);
    ColorWheel.addColor(PenColors.Yellows.Yellow);
    ColorWheel.addColor(PenColors.Yellows.Yellow);
    ColorWheel.addColor(PenColors.Yellows.Gold);
    ColorWheel.addColor(PenColors.Oranges.DarkOrange);
    ColorWheel.addColor(PenColors.Reds.Red);
  }
}

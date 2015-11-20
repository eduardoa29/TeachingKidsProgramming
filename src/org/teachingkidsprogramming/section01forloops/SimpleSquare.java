package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm STEM Academy");
    VirtualProctor.setName("Eduardo & Kellie");
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Oranges.OrangeRed);
    ColorWheel.addColor(PenColors.Oranges.OrangeRed);
    int sides = 70;
    for (int i = 0; i < 1000; i++)
    {
      Tortoise.setPenWidth(2);
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(26);
      Tortoise.turn(i * 31);
    }
  }
}

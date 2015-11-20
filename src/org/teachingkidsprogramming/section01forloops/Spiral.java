package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Add Blue Violet to the Color Wheel --#7
    //    Add Violet to the Color Wheel --#8
    //    Add Purple to the Color Wheel --#9
    for (int i = 0; i < 75; i++)
    {
      //         Change the pen color of the line the tortoise draws the next color on the Color Wheel --#6
      Tortoise.setPenColor(ColorWheel);
      Tortoise.move(5 * 31);
      Tortoise.turn(360 / 3);
    }
  }
}

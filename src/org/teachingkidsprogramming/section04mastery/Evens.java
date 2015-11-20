package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Evens
{
  public static void main(String[] args)
  {
    numbers();
  }
  private static void numbers()
  {
    int div = MessageBox.askForNumericalInput("What should your numbers be divisble by?");
    int numbers = MessageBox.askForNumericalInput("How high do you want the numbers to go?");
    for (int i = 0; i < numbers; i++)
    {
      if (i % div == 0)
        System.out.println(i);
      {
      }
    }
  }
}

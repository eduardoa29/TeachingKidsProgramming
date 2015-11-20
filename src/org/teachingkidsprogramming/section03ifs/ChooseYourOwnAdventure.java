package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("One morning Mr. Turtle woke up in a dream.");
    animateStartStory();
    int answer = MessageBox.askForNumericalInput(
        "Do you want to 'wake up' or 'explore' the dream? Press 1 for 'wake up', 2 for 'explore'.");
    if (answer == 1)
    {
      wakeUp();
    }
    else if (answer == 2)
    {
      approachOoze();
    }
    else if (answer > 2)
    {
      badAnswer();
    }
    else if (answer < 1)
    {
      badAnswer();
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    int answer = MessageBox.askForNumericalInput(
        "Do you want to pour the ooze into the 'backyard' or 'toilet'? Press 1 for 'backyard', 2 for 'toilet'.");
    if (answer == 2)
    {
      pourIntoToilet();
    }
    else if (answer == 1)
    {
      pourIntoBackyard();
    }
    else if (answer > 2)
    {
      badAnswer();
    }
    else if (answer < 1)
    {
      badAnswer();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    int answer = MessageBox.askForNumericalInput(
        "As the man starts to prepare you as soup, do you...  'Scream' or 'Faint'? Press 1 for 'Scream', 2 for 'Faint'.");
    if (answer == 2)
    {
      tortoiseSoup();
    }
    else if (answer == 1)
    {
      startStory();
    }
    else if (answer > 2)
    {
      badAnswer();
    }
    else if (answer < 1)
    {
      badAnswer();
    }
  }
  private static void tortoiseSoup()
  {
    MessageBox.showMessage("You made a delicious soup!  Yum!  The End.");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    int answer = MessageBox.askForNumericalInput(
        "Do you want to train to be a NINJA?  'Yes' or 'HECK YES'? Press 1 for 'Yes', 2 for 'HECK YES'.");
    if (answer == 1)
    {
      ninjaTurtle();
    }
    else if (answer == 2)
    {
      ninjaTurtle();
    }
    else if (answer > 2)
    {
      badAnswer();
    }
    else if (answer < 1)
    {
      badAnswer();
    }
  }
  private static void ninjaTurtle()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You wake up and have a boring day.  The End.");
  }
}

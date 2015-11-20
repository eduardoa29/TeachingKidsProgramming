package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Password
{
  public static void main(String[] args)
  {
    // Specification - Create a little Messagebox app for a login system that checks for an 
    // integer password and limits the number of attempts to enter it before it locks you
    // out (like on my phone)
    passwordAttempts();
    passwordWrong();
  }
  private static void passwordWrong()
  {
    MessageBox.showMessage("You took more than three attempts. System will now log out.");
    System.exit(0);
  }
  private static void passwordAttempts()
  {
    int answer = MessageBox.askForNumericalInput("What is your password?");
    for (int i = 0; i < 3; i++)
    {
      int guess = MessageBox.askForNumericalInput("Input Password");
      if (guess < 0)
      {
        MessageBox.showMessage("Input is invalid");
        System.exit(0);
      }
      else if (guess == answer)
      {
        MessageBox.showMessage("Welcome!");
        System.exit(0);
      }
      else
      {
        if (guess > answer)
        {
          if (i == 1)
          {
            MessageBox.showMessage("Input is wrong. You have " + (2 - i) + " attempt left.");
          }
          else
          {
            MessageBox.showMessage("Input is wrong. You have " + (2 - i) + " attempts left.");
          }
        }
      }
      if (guess < answer)
      {
        if (i == 1)
        {
          MessageBox.showMessage("Input is wrong. You have " + (2 - i) + " attempt left.");
        }
        else
        {
          MessageBox.showMessage("Input is wrong. You have " + (2 - i) + " attempts left.");
        }
      }
    }
  }
}

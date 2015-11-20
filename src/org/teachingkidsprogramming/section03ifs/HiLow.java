package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random randomGenerator = new Random();
    int numberOfGuesses = MessageBox.askForNumericalInput("How many guesses would you like?");
    if (numberOfGuesses < 1)
    {
      MessageBox.showMessage("The number you picked is invalid.");
      System.exit(0);
    }
    int maxGuessValue = MessageBox.askForNumericalInput("What difficulty would you like : 1, 2, or 3?");
    int answer = randomGenerator.nextInt(maxGuessValue);
    int easy = 1;
    if (maxGuessValue == easy)
    {
      easy = randomGenerator.nextInt(maxGuessValue);
      MessageBox.showMessage("You picked 1. You're guessing number will be up to 10.");
    }
    int medium = 2;
    if (maxGuessValue == medium)
    {
      medium = randomGenerator.nextInt(maxGuessValue);
      MessageBox.showMessage("You picked 2. You're guessing number will be up to 50.");
    }
    int hard = 3;
    if (maxGuessValue == hard)
    {
      hard = randomGenerator.nextInt(maxGuessValue);
      MessageBox.showMessage("You picked 3. You're guessing number will be up to 100.");
    }
    MessageBox.showMessage("Answer is : " + answer);
    for (int i = 0; i < numberOfGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You've Won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High!");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    if (numberOfGuesses > 1)
    {
      MessageBox.showMessage("You took more than " + numberOfGuesses + " guesses. You've Lost, Sorry.");
    }
    else if (numberOfGuesses == 1)
    {
      MessageBox.showMessage("You took more than " + numberOfGuesses + " guess. You've Lost, Sorry.");
    }
  }
}
package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter an adverb.");
    if (currentAdverb.isEmpty())
    {
      MessageBox.showMessage("You must enter an adverb, try again");
      return;
    }
    else if (currentAdverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not adverbs, try again.");
      return;
    }
    String currentEdVerb = MessageBox.askForTextInput("Please enter a verb ending in '-ed'.");
    String currentBodyPart = MessageBox.askForTextInput("Please enter a body part.");
    String currentName = MessageBox.askForTextInput("Please enter a name.");
    String currentStory = "Today, " + "I woke " + currentAdverb + ". " + "Then I " + currentEdVerb + " " + "my "
        + currentBodyPart + ". " + "while I met " + currentName + ".";
    //MessageBox.showMessage("I woke " + currentAdverb + ". ");
    //MessageBox.showMessage("Then I " + currentEdVerb + " ");
    //MessageBox.showMessage("my " + currentBodyPart + ". ");
    MessageBox.showMessage(currentStory);
  }
}
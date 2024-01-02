import java.util.Random;
import java.util.Scanner;

public class Assignment1_3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random(); 

    // Track number of correct answers
    int score = 0;

    // Loop 5 questions
    for (int i = 1; i <= 5; i++) {

      // Number generator 
      int num1 = rand.nextInt(50);
      int num2 = rand.nextInt(50);

      // Prints question
      System.out.print("Question " + i + " - Calculate the addition (" + num1 + " + " + num2 + "): ");
      
      // Gets user's answer
      int answer = scanner.nextInt();
      
      
      // Checks if answer is correct
      if(answer == num1 + num2) {
        score++;
      }

    }

    // Prints score after quiz
    System.out.println("Number of correct answers: " +score);

    // Prints feedback
    if(score == 5) {
      System.out.println("Excellent!"); 
    }
    else if (score == 4) {
      System.out.println("Very good!");
    }
    else if (score == 3) {  
      System.out.println("Good.");
    } 
    else if (score == 2) {
      System.out.println("Not bad.");
    }
    else if (score == 1) {
      System.out.println("Very bad.");
    }
    else {
      System.out.println("Try again.");
    }
      scanner.close();
  }
  
}
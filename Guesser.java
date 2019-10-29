package gitProject;

import java.util.Scanner;

public class Guesser {
	private int low;
	private int high;

public Guesser(int low, int high) {

		if (low > high) {
			throw new IllegalArgumentException("The first parameter must be lower than the second parameter");

		} else {
			this.low = low;
			this.high = high;

		}
	}

public void start() {
		//Guesser guesser = new Guesser(0,1000);
		rules();
		doGuesses();
		
	}
	public String toString(){
		  return "low: " + low + " high: " + high;
		}
	private void rules(){
	    System.out.println("Think of a number between " + low + " and "  + high);
	    System.out.println("I'm going to ask a few questions in order " + "to guess the number.");
	    System.out.println("Please answer T for true, and F for false.\n");
	  }
@SuppressWarnings("resource")
	private String getReply() {
        String reply = null;
        boolean correctAnswer = false;
        do {
            System.out.println("Please write T or F");
            //reply = System.console().readLine();
            reply = new Scanner(System.in).nextLine();
            if (reply.equals("T") || reply.equals("F")) {
                correctAnswer = true;
            } else {
                System.out.println("Write answer: T or F");
                correctAnswer = false;
            }
        } while (correctAnswer == false);
        return reply;
	  }

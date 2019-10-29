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

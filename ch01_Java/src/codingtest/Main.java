package codingtest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		StringTokenizer count = new StringTokenizer(word, " ");
		
		System.out.println(count.countTokens());
        scanner.close();
	}
}

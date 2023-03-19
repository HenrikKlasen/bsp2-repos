package sha;

import java.util.Scanner;

public class MainExec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SecureHashingAlgorithm1 sha1 = new SecureHashingAlgorithm1();
    System.out.println("Please enter a string you want to hash!");
    System.out.println(sha1.hash(scanner.nextLine()));
    scanner.close();
  }
}

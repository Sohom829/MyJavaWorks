import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

    System.out.println("Enter a number"); 
    int num1;
    int num2;

     num1 = input.nextInt();



    System.out.println("Enter another number");

     num2 = input.nextInt();

if(num1 < num2 ) {
      System.out.println("Num 1 must be greater than number 2");
    }

    else {
      double result = num1 - num2;
      System.out.println("Ans is = " + result);
    }
  }
}

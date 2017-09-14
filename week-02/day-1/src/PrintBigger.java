public class PrintBigger {

  public static void main(String[] args) {
    whichIsBigger(1,9);
    // Write a program that asks for two numbers and prints the bigger one
  }

    public static void whichIsBigger(int a, int b){
    if (a > b){
      System.out.println("The first number is bigger!");
    }
    else if (a == b){
      System.out.println("The two numbers are equal!");
    }
    else {
      System.out.println("The second number is bigger");
    }
  }
}


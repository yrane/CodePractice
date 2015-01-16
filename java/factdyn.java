import java.util.Scanner;

class FactDyn{
  public static int[] fac = new int[40];
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer to find its factorial: ");
    int num = sc.nextInt();

    int result = fact(num);
    System.out.println("The factorial of " + num + " is " + result);
  }

  public static int fact(int value){
    if (value == 1)
      return 1;
    if (fac[value] != 0) return fac[value];
    fac[value] = value * fact(value-1);
    return fac[value];
  }

}

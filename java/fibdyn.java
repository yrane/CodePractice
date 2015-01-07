import java.util.Scanner;

class FibDyn{

  static int[] fibnos = new int[50];
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of Fibonacci terms: ");
    int n = in.nextInt();
    int ans = fib(n);
    System.out.println("The term is: " + ans);
    //Binet's formula

    // int ans2 = (float)((float)(Math.pow((1+Math.sqrt(5)),n)) - (float)(Math.pow((1-Math.sqrt(5)),n))) / (float)(Math.pow(2,n)*Math.sqrt(5));
    // System.out.println("The term is: " + ans2);
  }

  public static int fib(int val){

    if (val == 1){
      System.out.println(1);
      return 1;}
    if (val == 0){

      System.out.println(0);
      return 0;}
    if (fibnos[val] != 0) return fibnos[val]; //Return Cached values
    fibnos[val] = fib(val - 1) + fib(val - 2);
    System.out.println(fibnos[val]);
    return fibnos[val];
  }
}

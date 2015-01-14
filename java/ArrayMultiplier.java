import java.io.*;

class ArrayMultiplier{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Number of Elements in the Array:");

    int elems = Integer.parseInt(br.readLine());
    int[] nums = new int[elems];

    System.out.println("Enter Array Elements as Integer Values:");
    for (int i = 0; i < elems; i++)
      nums[i] = Integer.parseInt(br.readLine());
    int n = nums.length;
    // int[] above = new int[n];
    // int[] below = new int[n];
    int[] products = new int[n];
    int p = 1;
    for (int i = 0; i < n; i++){
      products[i] = p;
      p *= nums[i];
    }
    p = 1;
    System.out.println("The Product Values are:");
    for (int i = n - 1; i >= 0; i--){
      products[i] *= p;
      p *= nums[i];

    }

    for (int i = 0; i < n; i++){
      System.out.println(products[i]);

    }
  }


}

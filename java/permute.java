class CountChar{
  public static void main(String[] args){
    String s = "Yogeshh";
    String t = "geYshod";
    int flag = 0;

    if (s.length() != t.length())
    {
      System.out.println("False");
      flag = 1;
    }
    else{
      int[] letters = new int[256];

      char[] s_arr = s.toCharArray();

      for (int i = 0; i < s.length(); i++)
      {
        // System.out.print(s_arr[i]);
        letters[s_arr[i]]++;
        // System.out.println("");
        System.out.print(letters[s_arr[i]]);
      }
      System.out.println("");

      char[] t_arr = t.toCharArray();
      for (int i = 0; i < t.length(); i++)
      {
        System.out.print(t_arr[i]);
        if (--letters[t_arr[i]] < 0){
          System.out.print("Here in False");
          flag = 1;
        }
      }
    }
    if (flag == 0){
      System.out.println("");
      System.out.println("True");
    }
    else
    {
      System.out.println("");
      System.out.println("False");
    }
  }
}

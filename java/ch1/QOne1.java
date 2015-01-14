class QOne1{

  public static boolean uniqueornot(String str){
    if (str.length() > 128)
      return false;

    boolean[] isunique = new boolean[128];
    for (int i = 0; i < str.length(); i++){
      int val = str.charAt(i);

      if (isunique[val]) return false;
      isunique[val] = true;
    }
    return true;
  }

  public static boolean uniqueornot2(String str){
    if (str.length() > 128)
      return false;

    int checker = 0;
    for (int i = 0; i < str.length(); i++){
      int val = str.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) return false;
      checker |= (1 << val);
    }
    return true;
  }

  public static void main(String[] args){
    System.out.print("Check whether all characters in a String are unique or not.");
    String words[] = {"apple", "abcde", "paddle", "new121", "alnique"};
    for (String word: words){
      System.out.println("\nWord: " + word + " ==> Unique or not?\nWay 1 ->" + uniqueornot(word) + "\nWay 2 ->" + uniqueornot2(word));
    }
  }
}

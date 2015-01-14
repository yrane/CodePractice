class QOne2{
  public static boolean permutation(String str1, String str2){
    if (str1.length() != str2.length())
      return false;

    char[] cstr1 = str1.toCharArray();
    char[] cstr2 = str2.toCharArray();

    int[] letters = new int[256];
    for (char c: cstr1){
      letters[c]++;
    }

    for (char c: cstr2){
      if (--letters[c] < 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args){
    String words[][] = {{"apple", "ppale"}, {"good", "dog"}, {"1yte", "yet1"}, {"hello", "llloh"}};
    for (String pair[]: words){
      String word1 = pair[0];
      String word2 = pair[1];
      System.out.println("Words are: " + word1 + " and " + word2);
      System.out.println("Permutation of eachother or not?: " + permutation(word1, word2));
    }
  }

}

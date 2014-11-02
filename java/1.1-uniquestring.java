//Here the complexity is O(n) only but we are using extra space
//To avoid using extra space we can use bit vector
//To ask: Whether we have ASCII or Unicode String?
//Here we take 256 characters
//If string is bigger than 256 we can not unique characters, so return false

class UniqueString{
  public static void main(String args[])
  {
    String test_str = "yogeshyane";
    UniqueString n1 = new UniqueString();
    boolean result = n1.match_string(test_str);

    System.out.println("\nDoes the string have all unique chars? " + result);
  }

  public boolean match_string(String test_str)
  {
    if (test_str.length() > 256)
      return false;

    boolean[] bool = new boolean[256];

    int i = 0;
    for (i = 0; i < test_str.length(); i++)
    {
      int val = test_str.charAt(i); //Get the ASCII value of the char
      System.out.print((char)val + " ");
      if (bool[val]){               //Fill that index
        return false;
      }
      bool[val] = true;
    }
    return true;
  }
}

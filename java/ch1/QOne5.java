class QOne5{
  public static void main(String[] args){
    String test = "aaabbbbbbbbbbbbbbbbbbbcccddddcccccddeeee";  //result will be a3b2c3d2
    System.out.println("The original string is: "+ test);
    StringBuffer mystr = new StringBuffer();
    // char[] new_test = new char[test.length()];
    int count = 1;
    int i = 1;
    for (;i < test.length();i++){
      if (test.charAt(i) == test.charAt(i-1))
        count++;
      else{
        mystr.append(test.charAt(i-1));
        // new_test[i-1] = test.charAt(i-1);
        // new_test[i] = count;
        mystr.append(count);
        count = 1;
      }
    }
    mystr.append(test.charAt(i-1));
    mystr.append(count);

    if (mystr.toString().length() > test.length()){
      System.out.println("The compression will be useless as the resulting string will be longer than the original!");
      System.exit(0);
    }
    System.out.println("The compressed string is: ");
    // for (int i = 0; i < new_test.length; i++)
    //   System.out.print(new_test[i]);
    System.out.println(mystr.toString());

  }

}

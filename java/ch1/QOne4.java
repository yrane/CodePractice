class QOne4{

  public static void insertchars(char[] sentence, int new_length){
    char[] final_sent = new char[new_length];
    int j = 0;
    for (int i = 0;i < new_length; i++){
      if (sentence[j] != ' '){
        final_sent[i] = sentence[j];
      }
      else{
        final_sent[i++] = '%';
        final_sent[i++] = '2';
        final_sent[i] = '0';

      }
      j++;

    }

    String result = final_sent.toString();
    System.out.print("\nThe new sentence is: ");
    for (int i = 0;i < new_length;i++)
       System.out.print(final_sent[i]);

    System.out.println();   
  }

  public static void main(String[] args){
    String sentence = "this is a test sentence";
    char[] test = sentence.toCharArray();
    int space = 0;
    for (char c: test){
      if (c == ' ')
        space++;
    }
    System.out.println("The sentence is: " + sentence);
    System.out.println("Number of spaces: "+ space);
    System.out.println("Old length was: "+ sentence.length());
    int new_length = sentence.length() + 2 * space;
    System.out.println("New length will be: "+ new_length);

    insertchars(test, new_length);
  }

}

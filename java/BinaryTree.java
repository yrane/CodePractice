import java.util.Random;
class BinaryTree{
  public BinaryTree left = null;
  public BinaryTree right = null;
  public int val = 0;

  public BinaryTree(int data){
    this.val = data;
  }

  void appendNode(int data){
    BinaryTree node = new BinaryTree(data);
    BinaryTree current = this;

    while ((current.left != null && data <= current.val) || (current.right != null && data > current.val)){
      if (data > current.val)
        current = current.right;
      else
        current = current.left;
    }

    if (data > current.val)
      current.right = node;
    else
      current.left = node;
  }


  public static void main(String[] args){
    BinaryTree root = new BinaryTree(10);

    Random rand = new Random();
    int randomNo = 0;

    for (int i = 0; i < 5;i++){
      randomNo = rand.nextInt(21);
      System.out.println("Node" + i + ": " + randomNo);
      root.appendNode(randomNo);
    }
    // root.appendNode(2);
    // root.appendNode(4);
    System.out.println("The root is: " + root.val);
    BinaryTree root_temp = root;
    while (root_temp.left != null){
      System.out.println("The left node to node is: " + root_temp.left.val);
      root_temp = root_temp.left;
    }

    root_temp = root;
    while (root_temp.right != null){
      System.out.println("The right node to root is: " + root_temp.right.val);
      root_temp = root_temp.right;
    }
  }

}

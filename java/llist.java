import java.util.Random;
class Llist{
  public int val;
  public Llist next = null;

  public Llist(int data){
    val = data;
  }

  void appendTail(int data){
    Llist end = new Llist(data);
    Llist current = this;
    int flag = 0;
    System.out.println("Value to be added: " + data);

    while (current.next != null){
      if (current.next.val >= data){
        // current.val = data;
        end.next = current.next;
        current.next = end;
        flag = 1;
        break;
      }

      current = current.next;
    }
    //
    // while (current != null){
    //   if (current.val >= data){
    //     // current.val = data;
    //     end.next = current;
    //     current = end;
    //     flag = 1;
    //     break;
    //   }
    //
    //   current = current.next;
    // }

    if (flag == 0){
      // if (current.val >= data){
      //   end.next = current;
      //   current = end;
      // }
      // else
        current.next = end;
    }

    current = this;
    current.printList(current);
  }

  void printList(Llist a){
    while(a.next != null){
      System.out.print(a.val + "->");
      a = a.next;
    }
    System.out.println(a.val);
  }

  Llist delNode(Llist head,int data){
    Llist n = head;
    if (n.val == data)
      return head.next;

    while (n.next != null){
      if (n.next.val == data){
        n.next = n.next.next;
        // return head;
      }
      n = n.next;
    }
    return head;
  }

  public static void main(String[] args){
    Llist list1 = new Llist(4);
    // list1.appendTail(3);
    // list1.appendTail(55);
    // list1.appendTail(8);
    // list1.appendTail(1);
    // list1.appendTail(32);
    // list1.appendTail(5);
    // list1.appendTail(3);
    // list1.appendTail(9);
    // list1.appendTail(10);
    // list1.appendTail(27);
    // list1.appendTail(10);
    // list1.appendTail(2);
    Random rand = new Random();
    int randomNum = 0;
    for (int i = 0;i < 5; i++){
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
      randomNum = rand.nextInt(21);
      list1.appendTail(randomNum);
    }
    System.out.println("\n\nOriginal Linked List:");
    list1.printList(list1);


    for (int i = 0;i < 2; i++){
      // nextInt is normally exclusive of the top value,
      // so add 1 to make it inclusive
      randomNum = rand.nextInt(21);
      System.out.println("\nNode to be deleted: " + randomNum);
      list1 = list1.delNode(list1,randomNum);
      list1.printList(list1);
    }
    // list1 = list1.delNode(list1,4);
    System.out.println("\nLinked List after node deletions:");
    list1.printList(list1);
  }
}

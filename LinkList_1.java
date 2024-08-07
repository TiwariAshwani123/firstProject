class LinkList_1 {

  Node head;
  private int size;

  LinkList_1() {
    this.size = 0;
  }

  class Node {

    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  //Insertion
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head; //This node is created for traversing to reach last node
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  //Deletion
  public void deleteFirst() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    }

    size--;
    head = head.next;
  }

  public void deleteLast() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    }

    size--;

    if (head.next == null) {
      head = null;
      return;
    }

    Node SecondLast = head;
    Node LastNode = head.next;
    while (LastNode.next != null) {
      LastNode = LastNode.next;
      SecondLast = SecondLast.next;
    }
    SecondLast.next = null;
  }

  //For Display
  public void printList() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    }

    Node currNode = head; //This node is created for traversing
    while (currNode != null) {
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }

    System.out.println("NULL");
  }

  public void getSize() {
    System.out.println("The Size of the LinkedList is :" + size);
  }

  public static void main(String[] args) {
    LinkList_1 list = new LinkList_1();
    list.addFirst("a");
    list.addFirst("is");
    list.addFirst("This");

    list.addLast("List");

    list.printList();

    list.deleteFirst();
    list.deleteLast();
    list.printList();

    list.getSize();
  }
}

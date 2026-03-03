public class singleLinkedList {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  public void delete(int key) {
    Node current = head, previous = null;

    // If head node itself holds the key to be deleted
    if (current != null && current.data == key) {
      head = current.next; // Change head
      return;
    }

    // Search for the key to be deleted, keep track of the previous node
    while (current != null && current.data != key) {
      previous = current;
      current = current.next;
    }

    // If key was not present in linked list
    if (current == null) return;

    // Unlink the node from linked list
    previous.next = current.next;
  }

  public int insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return data;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
    return data;
  }

  public void printList() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    singleLinkedList list = new singleLinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    System.out.println("Linked List:");
    list.printList();
  }
}

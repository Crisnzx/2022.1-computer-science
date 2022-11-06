package src;

import src.linkedList.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.remove(0);

    System.out.println(linkedList.toString());
    System.out.println(linkedList.isEmpty());

  }
}
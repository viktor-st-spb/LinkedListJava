package com.example.linkedlistjava;

public class LinkedList {
    Node head;

    /*** Insert new data to the end of the list ***/
    public void insert(int data) {
        // Every time we call insert(), we are
        // creating a new node (new object)
        Node node = new Node();

        // Apply data to the new node (the value of 'next'
        // of this node will be null by default).
        node.data = data;  // data from the user
        node.next = null;

        // Check, whether we have any data in our list, or this
        // is a new list.
        // In case we have no data in the list -
        // the 'head' will be null (we don't have any heads
        // in the list and we are adding the first node):
        if (head == null) {
            // The node itself will be the head:
            head = node;
        } else {
            // In case we have already some nodes in the list, we will create a new node
            // and make it as head:
            Node n = head;
            while (n.next != null) {
                n = n.next;  // We are travelling between nodes until
                             // we reach the last existing node (next==null)
            }
            n.next = node;
        }
    }

    public void show(){

    }
}

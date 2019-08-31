/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaoop;

/**
 *
 * @author dave
 */
public class LinkedList {
    private static int counter; 
    private Node head;

    public LinkedList() {
    }
    
    // add element to a list
    public void add(Object data){
        if(head == null){
            head = new Node(data);// head is the first node
        }
        // head is not null, traverse the list
        Node temNode = new Node(data);
        Node currentNode = head;
        if(currentNode != null){
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(temNode);
        }
    }
}

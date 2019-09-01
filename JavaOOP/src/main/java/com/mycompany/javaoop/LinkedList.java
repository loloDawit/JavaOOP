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
        increaseCounter();
    }
    private static int getCounter(){
        return counter;
    }
    private static void increaseCounter(){
        counter++;
    }
    private static void decreseCounter(){
        counter--;
    }
    public int size(){
        return getCounter();
    }
    // add elements at a specific location
    public void add(Object data, int index){
        Node tempNode = new Node(data);
        Node currentNode = head; 
        if(currentNode != null){
            for(int i=0; i < index && currentNode.getNextNode() != null; i++){
                currentNode = currentNode.getNextNode();
            }
        }
        tempNode.setNextNode(currentNode.getNextNode());
        currentNode.setNextNode(tempNode);
        increaseCounter();
    }
    // return specific value from an index
    public Object get(int index){
        Node currentNode = null; 
        if(index < 0){
            return null; 
        }
        while(head != null){
            currentNode = head.getNextNode();
            for(int i=0; i<index; i++){
                if(currentNode.getNextNode() == null){
                    return  null;
                }
                currentNode = currentNode.getNextNode();
            }
            return currentNode.getDataObject();
        }
        return  currentNode; 
    }
}

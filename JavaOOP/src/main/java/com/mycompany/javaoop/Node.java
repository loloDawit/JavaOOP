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
class Node {
    // reference to the next node in the chain, or null if there isn;t one
    Node next;
    // data the node can carry. could be type of any
    Object data;
    
    // Node constructor
    public Node(Object value) {
        data = value;
        next = null;
    }
    @SuppressWarnings("unused")
    public Node(Object dataValue, Node nextValue){
        next = nextValue; 
        data = dataValue;
    }
    
    // getData
    public Object getDataObject(){
        return data;
    }
    // setData
    @SuppressWarnings("unused")
    public void setData(Object dataValue){
        data = dataValue;
    }
    // get the next node
    public Node getNextNode(){
        return next;
    }
    // set node
    public void setNextNode(Node nextNode){
        next = nextNode;
    }
    
}

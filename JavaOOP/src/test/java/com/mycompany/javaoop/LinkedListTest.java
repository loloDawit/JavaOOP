/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dave
 */
public class LinkedListTest {
    LinkedList linkedList = new LinkedList();
    
    public LinkedListTest() {
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        linkedList.add(10);
        linkedList.add(20);
        assertEquals(2, linkedList.size());
        
    }

    /**
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSize() {
        
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd_Object() {
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd_Object_int() {
        double data1 = 30;
        double data2 = 40;
        linkedList.add(data1, 2);
        linkedList.add(data2);
        assertEquals(4, linkedList.size());
    }

    /**
     * Test of get method, of class LinkedList.
     */
    @Test
    public void testGet() {
        Object target = 10; // index = 1
        assertEquals(target, linkedList.get(0));
        
    }
    
}

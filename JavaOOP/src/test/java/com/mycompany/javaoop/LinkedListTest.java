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
    
    public LinkedListTest() {
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        assertEquals(1, linkedList.size());
        
    }

    /**
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSize() {
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Data;

/**
 *
 * @author amart
 */
public class Node 
{
    int data;
    Node next;//self reference
    Node(int data)
    {
        this.data=data;
        this.next=null;//address of other Node
    }
      
}

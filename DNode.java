/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Data;

/**
 *
 * @author amart
 */
public class DNode 
{
    int data;
    DNode left,right;//self reference
    DNode(int data)
    {
        this.data=data;
        this.left=this.right=null;//address of other Node
    }
      
}
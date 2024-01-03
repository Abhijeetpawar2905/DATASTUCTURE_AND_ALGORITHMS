/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Data;

import Stack_Data.StackExample;
import java.util.Scanner;

/**
 *
 * @author amart
 */
public class Dynamic_Stack
{
    Node tos;
    
    void createStack()
    {
        tos=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    
    void push(int e)
    {
        Node n=new Node(e);
        if(tos==null)
            tos=n;
        else
        {
            n.next=tos;//1
            tos=n;//2
        }
        System.out.println("Pushed");       
    }
    
    void pop()
    {
        if(tos==null)
            System.out.println("Empty List");       
        else
        {
          Node t=tos;//1
          tos=tos.next;//2
          System.out.println(t.data+" deleted");       
        }
    }
    void peek()
    {
        if(tos==null)
            System.out.println("Empty List");       
        else
        {
          System.out.println("@TOS:"+tos.data);       
        }
    }
    void print_stack()
    {  if(tos==null)
                System.out.println("Empty Stack");       
       else
       {
           Node t=tos;
           while(t!=null)
           {
               System.out.println(t.data);
               t=t.next;
           }
       }   
    }
    
  public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);        
         Dynamic_Stack obj=new Dynamic_Stack();
         obj.createStack();
         int ch;
         do
         {
           System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.push(no);
                       System.out.println("Pushed "+no);
                       break;
               case 2:
                      obj.pop();
                    break;
               case 3:
                   obj.peek();
                   break;
               case 4:
                       System.out.println("Elements on stack are");
                       obj.print_stack();
                       break;
               case 0:
                       System.out.println("Exiting");
                   break;
               default:
                       System.out.println("Wrong Choice");
                   break;
           }
             
         }while(ch!=0);
     }  
}

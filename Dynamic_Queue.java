/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Data;

import Queue_Data.LinearQueue;
import java.util.Scanner;

/**
 *
 * @author amart
 */
public class Dynamic_Queue 
{
    Node rear,front;
    
    void createQueue()
    {
        rear=front=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    
    void enqueue(int e)
    {   Node n=new Node(e);
        if(rear==null)
        {rear=front=n;}
        else
        {
          rear.next=n;
          rear=n;
        }
        System.out.println("Enqueued");       
    }
    void dequeue()
    {
        if(front==null)
            System.out.println("Empty List");       
        else
        {
          Node t=front;//1
          if (front==rear)
          {
              front=rear=null;
          }
          else
          {
          front=front.next;//2
          System.out.println(t.data+" dequeued");       
          }
        }
    }
    void print_queue()
{  if(front==null)
            System.out.println("Empty List");       
   else
   {
       Node t=front;
       while(t!=null)
       {
           System.out.print("| "+t.data+" |----");
           t=t.next;
       }
   }   
}
      public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         Dynamic_Queue obj=new Dynamic_Queue();
         obj.createQueue();
         int ch;
         do
         {
           System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.enqueue(no);
                       System.out.println("Enqueued "+no);
                       break;
               case 2:
                   obj.dequeue();
                   break;
               case 3:
                       System.out.println("Elements in queue are");
                       obj.print_queue();
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

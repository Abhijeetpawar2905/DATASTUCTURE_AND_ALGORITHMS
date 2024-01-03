 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_Data;

import Stack_Data.StackExample;
import java.util.Scanner;

/**
 *
 * @author amart
 */
public class LinearQueue 
{
  int front,rear,MaxSize,queue[];
   void createQueue(int size)
   {
       MaxSize=size;
       queue=new int[MaxSize];
       front=0;
       rear=-1;
   }
   void enqueue(int e)
   {
       rear++;
       queue[rear]=e;
   }
   boolean is_full()
   {
       if(rear==MaxSize-1)
           return true;
       else
           return false;
   }
   int dequeue()
   {
      int temp=queue[front];
      front++;
      return(temp);
   }
   boolean is_empty()
   {
       if(front>rear)
           return true;
       else
           return false;
   }
    void print_queue()
     {
         for(int i=front;i<=rear;i++)
             System.out.println(queue[i]);
     }
    public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter size of stack:");
         int size=in.nextInt();
         LinearQueue obj=new LinearQueue();
         obj.createQueue(size);
         int ch;
         do
         {
           System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                   if(!obj.is_full())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.enqueue(no);
                       System.out.println("Enqueued "+no);
                   }
                   else
                       System.out.println("Queue is Full");
                   break;
               case 2:
                    if(!obj.is_empty())
                   {
                       System.out.println("Dequeued "+obj.dequeue());
                   }
                   else
                       System.out.println("Queue is Empty");
                   break;
               case 3:
                    if(!obj.is_empty())
                     {
                       System.out.println("Elements in queue are");
                       obj.print_queue();
                     }
                    else
                       System.out.println("Queue is Empty");
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










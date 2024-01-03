/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_Data;

import java.util.Scanner;

/**
 *
 * @author amart
 */
public class Double_Ended_Queue 
{
    int queue[],front_left,front_right,rear_left,rear_right,MaxSize,mid;
    void createQueue(int size)
    {
        MaxSize=size;
        queue=new int[size];
        mid=size/2;
        front_left=mid;
        front_right=mid-1;
        rear_left=mid-1;
        rear_right=mid;
                
    }
    void enqueue_left(int e)
    {
        rear_left++;
        queue[rear_left]=e;
   
        
    }
    void enqueue_right(int e)
    {
        rear_right--;
        queue[rear_right]=e;
       
    }
    boolean is_full_left()
   {
       if(rear_left==MaxSize-1)
           return true;
       else
           return false;
   }
    
    boolean is_full_right()
   {
       if(rear_right==0)
           return true;
       else
           return false;
   }
    
    int dequeue_left()
    {
        int temp=queue[front_left];
        front_left++;
        return(temp);
    }
     int dequeue_right()
    {
        int temp=queue[front_right];
        front_right--;
        return(temp);
    }
   boolean is_empty_right()
   {
       if(front_right<rear_right)
           return true;
       else
           return false;
   }
    boolean is_empty_left()
   {
       if(front_left>rear_left)
           return true;
       else
           return false;
   } 
 void print_queue_left()
     {
         for(int i=front_left;i<=rear_left;i++)
             System.out.println(queue[i]);
     }   
 void print_queue_right()
     {
         for(int i=front_right;i>=rear_right;i--)
             System.out.println(queue[i]);
     }
 public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter size of stack:");
         int size=in.nextInt();
         Double_Ended_Queue obj=new Double_Ended_Queue();
         obj.createQueue(size);
         int ch;
         do
         {
           System.out.println("\n1.Enqueue_Left\n2.Enqueue_Right\n3.Dequeue_Left\n4.Dequeue_right\n5.Print_left\n6.Print_right\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                   if(!obj.is_full_left())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.enqueue_left(no);
                       System.out.println("Enqueued "+no);
                   }
                   else
                       System.out.println("Queue is Full");
                   break;
                case 2:
                   if(!obj.is_full_right())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.enqueue_right(no);
                       System.out.println("Enqueued "+no);
                   }
                   else
                       System.out.println("Queue is Full");
                   break;
               case 3:
                    if(!obj.is_empty_left())
                   {
                       System.out.println("Dequeued "+obj.dequeue_left());
                   }
                   else
                       System.out.println("Queue is Empty");
                   break;
               case 4:
                     if(!obj.is_empty_right())
                   {
                       System.out.println("Dequeued "+obj.dequeue_right());
                   }
                   else
                       System.out.println("Queue is Empty");
                   break;
               case 5:
                    if(!obj.is_empty_left())
                     {
                       System.out.println("Elements in queue are");
                       obj.print_queue_left();
                     }
                    else
                       System.out.println("Queue is Empty");
                   break;
                case 6:
                    if(!obj.is_empty_right())
                     {
                       System.out.println("Elements in queue are");
                       obj.print_queue_right();
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_Data;

import java.util.Scanner;

/**
 *
 * @author amart
 */
public class Min_Stack
{
    int stack[],tos,MaxSize;
    
    void createStack(int size)
    {
        stack=new int[size];
        MaxSize=size;
        tos=-1;
    }
    void push(int e)
    {
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }
    int peek()
    {
        return(stack[tos]);
    }
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
     boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
     
     void print_stack()
     {
         for(int i=tos;i>-1;i--)
             System.out.println(stack[i]);
     }
    
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter size of stack:");
         int size=in.nextInt();
         Min_Stack stack=new Min_Stack();
         stack.createStack(size);
         Min_Stack min=new Min_Stack();
         min.createStack(size);
         int ch;
         do
         {
           System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Print Min\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                   if(!stack.is_full())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       stack.push(no);
                       if(min.is_empty())//no entries in it
                           min.push(no);
                       
                       else
                       {
                           if(no<min.peek())
                           {
                               min.push(no);
                               System.out.println("Pushed on min "+no);
                           }
                       }
                       System.out.println("Pushed "+no);
                   }
                   else
                       System.out.println("Stack is Full");
                   break;
               case 2:
                    if(!stack.is_empty())
                   {
                       if(stack.peek()==min.peek())
                           System.out.println("Poped from both"+stack.pop()+","+min.pop());
                       else
                           System.out.println("Poped:"+stack.pop());
                   }
                   else
                       System.out.println("Stack is Empty");
                   break;
               case 3:
                    if(!stack.is_empty())
                   {
                       System.out.println("Element at peek: "+stack.peek());
                   }
                   else
                       System.out.println("Stack is Empty");
                   break;
               case 4:
                    if(!stack.is_empty())
                   {
                       System.out.println("Elements on stack are");
                       stack.print_stack();
                   }
                    else
                       System.out.println("Stack is Empty");
                   break;
                   
               case 5:
                    if(!min.is_empty())
                   {
                       System.out.println("Min is: "+min.peek());
                   }
                   else
                       System.out.println("Stack is Empty");
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

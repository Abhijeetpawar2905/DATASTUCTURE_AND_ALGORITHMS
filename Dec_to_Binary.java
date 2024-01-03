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
public class Dec_to_Binary 
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
         Dec_to_Binary  obj=new Dec_to_Binary ();
         System.out.println("number:");
         int no=in.nextInt();
         obj.createStack(16);
         while(no>0)
         {
             int binary_digit=no%2;
             no=no/2;
             obj.push(binary_digit);
         }  
         while(!obj.is_empty())
         {
             System.out.print(obj.pop());
         }
         
         
     }}
         
         
  
    
}

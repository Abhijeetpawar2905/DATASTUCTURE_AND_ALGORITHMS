/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_Data;

/**
 *
 * @author amart
 */
import java.util.Scanner;
public class Stack_balance 
{
    char stack[];
    int tos,MaxSize;
    
    void createStack(int size)
    {
        stack=new char[size];
        MaxSize=size;
        tos=-1;
    }
    void push(char e)
    {
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    char pop()
    {
        char temp=stack[tos];
        tos--;
        return(temp);
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
      Scanner in =new Scanner(System.in);
      System.out.println("Enter sequence to test");
      String line=in.nextLine();
      Stack_balance sb=new Stack_balance();
      sb.createStack(line.length());
      boolean flag=true;
      for(int i=0;i<line.length();i++)
      {
          char c=line.charAt(i);
          if(c=='{')
              sb.push(c);
          else if(c=='}')
          {
              if(!sb.is_empty())
              {
                  char temp=sb.pop();
              }
              else
              {
                 System.out.println("} is unexpected");  
                 flag=false;
              }
          }
      }
      if(!sb.is_empty())
      {
                 System.out.println("} is expected");
      }
      else if(flag)
      {
            System.out.println("Perfectly balance");
      } 
      //System.out.println("Entered:"+line);
     }
}
      


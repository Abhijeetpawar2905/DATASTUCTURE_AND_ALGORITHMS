/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

/**
 *
 * @author amart
 */
import java.util.Scanner;
public class HashingSystem
{
    int hashtable[],MaxSize,count;
    void init(int size)
    {
        MaxSize=size;
        hashtable=new int[MaxSize];
        count=0;
        for(int i=0;i<hashtable.length;i++)
            hashtable[i]=-1;
    }
    void printHash()
    {
        for(int i=0;i<hashtable.length;i++)
          System.out.println("@ "+i+"----->"+hashtable[i]);
    }
    boolean isFull()
    {
        if(count==MaxSize)
           return true;
        else
            return false;
    }
    boolean isEmpty()
    {
        if(count==0)
           return true;
        else
            return false;
    }
    void insert(int data)
    {    
          int index=data%MaxSize;
          if(hashtable[index]==-1)
          {
              hashtable[index]=data;
              System.out.println("inserted at "+index); 
              count++;
          }
          else
          {
            int tindex=index;
            while (true)
            {
                if(hashtable[tindex]==-1)
                {
                    hashtable[tindex]=data;
                    System.out.println("inserted at "+tindex+" after handling collision"); 
                    count++;
                    break;
                }
                tindex=(tindex+1)%MaxSize;
            }
                
          }
        }
    

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        HashingSystem obj=new HashingSystem();
        obj.init(10);
        do
        {
            System.out.println("1.Insert in:\n2.Print Hash Table\n0.Exit");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(obj.isFull())
                        System.out.println("Hash Table is Full");
                    else
                    {
                        System.out.println("Enter data to hash:");
                         int data=in.nextInt();
                         obj.insert(data);
                    }
                    break;
                    case 2:
                    if(obj.isEmpty())
                        System.out.println("Hash Table is Empty");
                    else
                    {
                        System.out.println("Data in hash:");
                        obj.printHash();
                    }
                    break;
                    case 0:
                        System.out.println("Exiting....tata");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
            }
            
        }  while(ch!=0);
    }
}

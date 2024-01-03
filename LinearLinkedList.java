/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Data;


import java.util.Scanner;

/**
 *
 * @author amart
 */
public class LinearLinkedList 
{
    Node root;
    
    void createList()
    {
        root=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    
    void insert_left(int e)
    {
        Node n=new Node(e);
        if(root==null)
            root=n;
        else
        {
            n.next=root;//1
            root=n;//2
        }
        System.out.println("Inserted");       
    }
    void insert_right(int e)
    {   Node n=new Node(e);
        if(root==null)
            root=n;
        else
        {
           Node t=root;//1
           while(t.next!=null)//2
               t=t.next;
           t.next=n;//3
        }
        System.out.println("Inserted");       
    }
     void delete_left()
    {
        if(root==null)
            System.out.println("Empty List");       
        else
        {
          Node t=root;//1
          root=root.next;//2
          System.out.println(t.data+" deleted");       
        }
    }
    void delete_right()
    {   if(root==null)
            System.out.println("Empty List");       
        else
        {
          Node t=root;//1
          Node t2=t;//1
          while(t.next!=null)//2
          {t2=t;t=t.next; }
          if(root==t)//only one node
              root=null;//manual reset
          else
             t2.next=null;//3
          System.out.println(t.data+" deleted");       
         }
    }
    
void print_list()
{  if(root==null)
            System.out.println("Empty List");       
   else
   {
       Node t=root;
       while(t!=null)
       {
           System.out.print("| "+t.data+" |->");
           t=t.next;
       }
   }   
}
void search(int key)
{  if(root==null)
            System.out.println("Empty List");       
   else
   {   Node t=root;
       while(t!=null && key!=t.data)
         t=t.next;
       
       if(t==null)
               System.out.println(key+" not found in list");
       else
               System.out.println(key+" found in list");
   }
    

}

void deleteKey(int key)
{  if(root==null)
            System.out.println("Empty List");       
   else//not empty
   {   
       Node t=root;Node t2=root;
       while(t!=null && key!=t.data)
       {
        t2=t;       
        t=t.next;
       }
       if(t==null)//not found
               System.out.println(key+" not found in list");
       else//found
       {
           System.out.println(key+" found in list");
           if(t==root)//case1:left most
            root=root.next;
           else if(t.next==null)//case 2:right most
             t2.next=null;
           else//case 3:in between
             t2.next=t.next;
           System.out.println(t.data+" deleted");     
       }
           
    }
   }
    

void insertAt(int index,int e)
    {  
        if(index==0)
        {
            Node n=new Node(e);
            if(root==null)
                root=n;
            else
            {
                n.next=root;
                root=n;
            }
        }
        else{
            Node t=root;
            Node t2=root;
            while(t!=null && index>0)
            {
                t2=t;
                t=t.next;
                index--;
            }
            if(t==null)
                System.out.println("index out of range");
            else
            {
                Node n=new Node(e);
                t2.next=n;//1
                n.next=t;//2
                System.out.println("iserted:");
            }
                
        }
    }

      
   public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         LinearLinkedList obj=new LinearLinkedList();
         obj.createList();
         int ch;
         do
         {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Search\n6.Print List\n7.Delete on Key\n8.Insert at\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int e=in.nextInt();
                       obj.insert_left(e);
                       break;
               case 2:
                       System.out.println("\nEnter a number:");
                       e=in.nextInt();
                       obj.insert_right(e);
                       break;    case 3:
                      obj.delete_left();
                      break;
               case 4:
                      obj.delete_right();
                      break;
               case 5:
                       System.out.println("\nEnter a number to search:");
                       e=in.nextInt();
                       obj.search(e);
                       break;
               case 6:
                   System.out.println("\nelements in list:");
                   obj.print_list();
                   break;
               case 7:
                       System.out.println("\nEnter a number to delete:");
                       e=in.nextInt();
                       obj.deleteKey(e);
                       break;
               case 8:
                       System.out.println("\nEnter index and data to insert:");
                       int index=in.nextInt();
                       e=in.nextInt();
                       obj.insertAt(index,e);
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

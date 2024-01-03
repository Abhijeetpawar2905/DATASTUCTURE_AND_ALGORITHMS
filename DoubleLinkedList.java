/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Data;

/**
 *
 * @author amart
 */
public class DoubleLinkedList 
{
    DNode root;
    
    void createList()
    {
        root=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    
    void insert_left(int e)
    {
        DNode n=new DNode(e);
        if(root==null)
            root=n;
        else
        {
            n.right=root;//1
            root.left=n;//2
            root=n;//3
        }
        System.out.println("Inserted");       
    }
    void insert_right(int e)
    {   DNode n=new DNode(e);
        if(root==null)
            root=n;
        else
        {
           DNode t=root;//1
           while(t.right!=null)//2
               t=t.right;
           t.right=n;//3
           n.left=t;//4
        }
        System.out.println("Inserted");       
    }
     void delete_left()
    {
        if(root==null)
            System.out.println("Empty List");       
        else
        {
          DNode t=root;//1
          if(root.right==null)//single node
              root=null;
          else
          { root=root.right;root.left=null;//3}
          System.out.println(t.data+" deleted");       
        }
    }
    void delete_right()
    {   if(root==null)
            System.out.println("Empty List");       
        else
        {
          DNode t=root;//1
          while(t.right!=null)//2
            t=t.right; 
          if(root==t)//only one node
              root=null;//manual reset
          else
          {  DNode t2=t.left;//3
             t2.right=null;//4
          }
          System.out.println(t.data+" deleted");       
         }
    }
    
void print_list()
{  if(root==null)
            System.out.println("Empty List");       
   else
   {
       DNode t=root;
       while(t!=null)
       {
           System.out.print("| "+t.data+" |->");
           t=t.right;
       }
   }   
}
void print_list_Rev()
{  if(root==null)
            System.out.println("Empty List");       
   else
   {
       DNode t=root;
       while(t.right!=null)
           t=t.right;
       while(t!=null)
       {    System.out.print(t.data);
            t=t.left;
       }
       
   }   
}
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree_Data;

/**
 *
 * @author amart
 */
public class Tree_example 
{
    DNode root;
    void createtree()
    {
        root=null;
    }
    
    void insert(DNode r,DNode n)//r:root n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
    }
    void inorder(DNode r)
    {
        if(r!=null)
        {
            inorder(r.left);//l
            System.out.print(r.data+",");//p
            inorder(r.right);//r
        }
    }
     boolean search(DNode r,int key)
    {
        if(r!=null)
        {
            if(r.data==key)
                return true;
            else
            {
              if(key<r.data)
                  return search(r.left,key);//l
              else
                  return search(r.right,key);//2
            }
        }
        else
            return false;
    }

    int getHeight(DNode r)
    {
        if(r==null)
            return 0;
        else
        {
            int right=getHeight(r.right);
            int left=getHeight(r.left);
            return Math.max(left, right)+1;
        }
    }
    boolean isBalanced(DNode r)
    {
        if(r==null)
            return true;
        else
        {
            int right=getHeight(r.right);
            int left=getHeight(r.left);
            if(Math.abs(left - right)<=1)//+1,0,-1
                return true;
            else
                return false;
            
        }
    }
    public static void main(String args[])
    {
        Tree_example obj=new Tree_example();
        obj.createtree();//root=null
        DNode n1=new DNode(50);
        obj.insert(obj.root, n1);
        DNode n2=new DNode(20);
        obj.insert(obj.root, n2);
        DNode n3=new DNode(60);
        obj.insert(obj.root, n3);
        DNode n4=new DNode(30);
        obj.insert(obj.root, n4);
        DNode n5=new DNode(40);
        obj.insert(obj.root, n5);
        /*DNode n6=new DNode(90);
        obj.insert(obj.root, n6);*/
        obj.inorder(obj.root);
        System.out.println("Height is:"+(obj.getHeight(obj.root)-1));
        System.out.println("is it balanced:"+obj.isBalanced(obj.root));
        System.out.println("find 200:"+obj.search(obj.root,200));
    }
}











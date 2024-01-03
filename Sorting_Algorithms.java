/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author amart
 */

public class Sorting_Algorithms 
{
    void print_array(int a[])
    {
         System.out.println("\narray has");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
    }
    void HeapSort(int a[])
    {
        int i,j,t,pc;//pc:parent and child ref
        boolean done;
        for(i=a.length-1;i>=0;i--)//bottom to top
        {
            for(j=0;j<=i;j++)//inbetween sort
            {
                pc=j;
                done=true;
                while(pc>=0 && pc/2>=0 && done!=false)//parent child compare for maxheap
                {
                    if(a[pc]>a[pc/2])//child is greater than parent swap
                    {
                        t=a[pc];
                        a[pc]=a[pc/2];
                        a[pc/2]=t;
                        pc=pc/2;//go to parent and compare with its parent
                    }
                    else
                        done=false;
                }
            }
          //swap root with last in the pass  
          t=a[i];
          a[i]=a[0];
          a[0]=t;
        }
    }
    void SelectionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)//passes
        {
            int min=a[i];
            int pos=i;
            for(int j=i+1;j<a.length;j++)//sort
                    {
                        if(a[j]<min)
                        {
                            min=a[j];
                            pos=j;
                        }
                    }
            a[pos]=a[i];
            a[i]=min;
        }
    }
    void InsertionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)//passes
        {
            int new_element=a[i+1];
            int j=i+1;
            while(j>0 && a[j-1]>new_element)
                    {
                        a[j]=a[j-1];
                        j--;
                    }
            a[j]=new_element;
        }
    }
    void BubbleSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)//passes
        {
            for(int j=0;j<a.length-1;j++)//sort
                    {
                        if(a[j]>a[j+1])
                        {
                            int t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t;
                        }
                    }
        }
    }
    void BubbleSort_V2(int a[])
    {
        for(int i=0;i<a.length-1;i++)//passes
        {
            for(int j=0;j<(a.length-1-i);j++)//sort
                    {
                        if(a[j]>a[j+1])
                        {
                            int t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t;
                        }
                    }
        }
    }
    void BubbleSort_V3(int a[])
    {
        boolean flag=true;
        for(int i=0;i<a.length-1;i++)//passes
        {
            flag=true;
            for(int j=0;j<(a.length-1-i);j++)//sort
                    {
                        if(a[j]>a[j+1])
                        {
                            flag=false;//means sorting needed
                            int t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t;
                        }
                    }//j loop
            if(flag==true)
            {
                 System.out.println("\nsorted and done ");
                 break;
            }
            else
            {
                 System.out.println("\npass:"+(i+1));
            }
        }
    }
    void QuickSort(int a[],int start,int end)
    {
        int i=start,j=end,pivot=end;
        if(i<=j)
        {
            while(i<j)
            {
                while(a[i]<a[pivot])
                    i++;
                while(a[j]>a[pivot])
                    j--;
                if(i<j)
                {
                    int temp=a[i];a[i]=a[j];a[j]=temp;}
                }
            }
        if(i<end)
            QuickSort(a,i+1,end);
        if(j>start)
            QuickSort(a,start,j-1);
    }
    void MergeSort(int a[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            MergeSort(a,start,mid);//div
            MergeSort(a,mid+1,end);//div
            Merger(a,start,mid,end);//conquer
        }
    }
    void Merger(int a[],int start,int mid,int end)
    {//sort and combine
        int temp[]=new int[a.length];
        int i,j,tindex;
        i=start;
        j=mid+1;
        tindex=start;
        while(i<=mid && j<=end)//compare and copy
        {
            if(a[i]<a[j])
                temp[tindex++]=a[i++];
            else
                temp[tindex++]=a[j++];
        }
        while(i<=mid)//copy leftover from i
             temp[tindex++]=a[i++];
        while(j<=end)//copy leftover from j
                temp[tindex++]=a[j++];
        for(i=start;i<=end;i++)
            a[i]=temp[i];
    }
    public static void main(String args[])
    {
        int a[]={66,11,33,99,88,22,44,55,77};
        int b[]={22,11,44,33,55,66,77,88,99};
        Sorting_Algorithms obj=new Sorting_Algorithms();
        obj.print_array(a);
        //obj.BubbleSort_V3(b);
       // obj.SelectionSort(a);
       // obj.QuickSort(a,0,a.length-1);
        //obj.MergeSort(a,0,a.length-1);
        obj.HeapSort(a);
        obj.print_array(a);
        
    }
}

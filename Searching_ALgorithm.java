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

public class Searching_ALgorithm 
{
    int sequentialSearch(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i])
                return(i);
        }
        return(-1);
    }
   int binarySearch(int a[],int key,int start,int end)
    {
        if(start<=end)
        {
            int mid=(start+end)/2;
            if(key==a[mid])
                return mid;
            else
            {
                if(key<a[mid])
                    return binarySearch(a,key,start,mid-1);
                else
                    return binarySearch(a,key,mid+1,end);
            }
        }
        else
            return(-1);
    }
   int binarySearch_V2(int a[],int key,int start,int end)
    {
        if(key<a[start] || key>a[end])
            return(-1);
        else
        {
        if(start<=end)
        {
            System.out.println("Pass");
            int mid=(start+end)/2;
            if(key==a[mid])
                return mid;
            else
            {
                if(key<a[mid])
                    return binarySearch(a,key,start,mid-1);
                else
                    return binarySearch(a,key,mid+1,end);
            }
        }
        else
            return(-1);
        }
    }
    public static void main(String args[])//main
    {
         //create array of 10 random numbers
        int a[]={22,11,55,77,33,99,1,45,67,98};
        int a2[]={11,22,33,44,55,66,77,88,99,111};
        Searching_ALgorithm object=new Searching_ALgorithm();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter key to serach:");
        int key=in.nextInt();
        
        //int result=object.sequentialSearch(a,key);
        //int result=object.binarySearch(a2,key,0,a2.length-1);
        int result=object.binarySearch_V2(a2,key,0,a2.length-1);
        if (result==-1)
            System.out.println(key+"Not Found");
        else
            System.out.println(key+" Found at "+result);
    }
   
    //pass array and element to search to method and will return -1 or i
    
}

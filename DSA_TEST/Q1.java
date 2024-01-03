package DSA_TEST;

import java.util.Scanner;

public class Q1 {

	int queue [];
	int MaxSize;
	int tos;
	int count;
	int front,rear;

	void Createqueue(int size )
	{
		MaxSize =size;
		queue = new int [size];
		tos++;
		front=0;
		rear=-1;
		count=0;
	}
	
	 void enqueue(int no)
	   {
	       rear=(rear+1)%MaxSize;
	       count++;
	       queue[rear]=no;
	   }
	 
	  int dequeue()
	   {
	      int temp=queue[front];
	      front=(front+1)%MaxSize;
	      count--;
	      return(temp);
	   }
	  
	  boolean is_full()
	   {
	       if(count==MaxSize)
	           return true;
	       else
	           return false;
	   }
	  
	  boolean is_empty()
	   {
	       if(count == 0)
	           return true;
	       else
	           return false;
	   }
	
	  void print()
	  {
		 int i=front;
		 int c=0;
		 while(c<count)
		 {
			 System.out.println(queue[i]);
			 i=(i+1)%MaxSize;
			 c++;
		 }
	  }
	  
	 
	    
	public static void main(String[] args) {
		
		int arr[], rear, front;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size :");
		
		int size = sc.nextInt();
		
		Q1 obj = new Q1();
		
		int ch ;
		
		do 
		{
		
		  System.out.println("1.Enqueue 2.deueue 3.print 4.Exit ");	
		  ch = sc.nextInt();
		  switch (ch)
		  {
			  case 1:
			  {
				  if(!obj.is_full())
				  {
					  System.out.println("Enter no :");
					  int no =sc.nextInt();
					  
					  obj.enqueue(no);
					  
					  System.out.println(" you Enter no "+ no);
				  }
				  else
				  
					System.out.println("Queue full");  
				  
				  break;
			  }  
				  case 2: 
				  {
					  if(!obj.is_empty())
					  {
						 
						  obj.dequeue();
						  
						  
					  }
					  else
					  
						System.out.println("Queue empty");
					  
					   break;
				  }
				  case 3:
	                    if(!obj.is_empty())
	                     {
	                       System.out.println("Elements in queue are");
	                       obj.print();
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

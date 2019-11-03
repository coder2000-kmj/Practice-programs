package practice;

import java.util.Scanner;

public class leakybucket {

	public static void main(String[] args) {
		int op;
		int remain=0,bktcap=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the bucket capacity");
		bktcap=s.nextInt();
		System.out.println("Enter the number of inputs");
		int n=s.nextInt();
		System.out.println("Enter the output datarate");
		int dr=s.nextInt();
		int pkt[]=new int[10];
		System.out.println("Enter the inputs");
		for(int i=0;i<n;i++) {
			pkt[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int total=pkt[i]+remain;
			if(total>bktcap)
			{
				if(pkt[i]>bktcap)
				{
					System.out.println("incoming packet size"+pkt[i]+"bytes");
					System.out.println("is exceeding bucket capacity"+bktcap+"bytes");
					System.out.println("its discarded");
				}
			}
			else
			{
				remain+=pkt[i];
				System.out.println("incoming packet size"+pkt[i]+"bytes");
				if(remain<=dr)
				{
					 op=remain;
					remain=0;
				}
				else
				{
					 op=dr;
					remain-=dr;
				}
				System.out.println("incoming packet size"+op+"is transmitted");
				System.out.println("remaining capacity is"+remain);
				System.out.println("");
			}
			
		}
		
	}

}

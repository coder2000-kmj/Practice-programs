package practice;

import java.util.*;

public class crc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of data bits");
		int n=s.nextInt();
		int data[]=new int[n];
		System.out.println("Enter the data bits");
		for(int i=0;i<data.length;i++) {
			data[i]=s.nextInt();
		}
		System.out.println("Enter the number of divisor bits");
		int m=s.nextInt();
		int divisor[]=new int[m];
		System.out.println("enter the divisor");
		for(int i=0;i<divisor.length;i++)
		{
			divisor[i]=s.nextInt();
		}
		int len=n+m-1;
		int div[]=new int[len],crc[]=new int[len];
		int[] rem=new int[len];
		for(int i=0;i<data.length;i++) {
			div[i]=data[i];
		}
			System.out.println("Dividend after appending zeroes");
			for(int i=0;i<div.length;i++) { 
				System.out.println(div[i]);
			}
		for(int i=0;i<div.length;i++)
		{
			rem[i]=div[i];
		}
		rem=divide(div,divisor,rem);
		for(int i=0;i<div.length;i++)
		{
			crc[i]=div[i]^rem[i];
		}
		System.out.println("The crc code");
		for(int i=0;i<crc.length;i++)
		{
			System.out.println(crc[i]);
		}
		System.out.println("The crc code of"+len+"bits");
		System.out.println("Enter the crc code");
		for(int i=0;i<crc.length;i++)
		{
			crc[i]=s.nextInt();
		}
		for(int j=0;j<rem.length;j++)
		{
			rem[j]=crc[j];
		}
		rem=divide(crc,divisor,rem);
		for(int i=0;i<rem.length;i++)
		{
			if(rem[i]!=0)
			{
				System.out.println("ERROR");
				break;
		}
			if(i==(rem.length -1))
			{
				System.out.println("No Error");
			}
		
		}
		}
	static int[] divide(int div[],int divisor[],int rem[])
	{
		int cur=0;
		while(true){
			for(int i=0;i<divisor.length;i++)
			{
				 rem[cur+i]=rem[cur+i]^div[i];
			}
			while(rem[cur]==0&&cur!=rem.length-1)
			{
				cur++;
			}
			if((rem.length-cur)<(divisor.length))
			{
				break;
			}
				
		}
		return rem;
	}
	

}

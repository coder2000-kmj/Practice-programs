package practice;

import java.util.Scanner;

public class fibpat
{
	static void fib(int f[],int N)
	{
		f[1]=1;
		f[2]=1;
		for(int i=3;i<N;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
	}
	static void fiboTriangle(int n)
	{	
		int N=n*(n+1)/2;//relation between n and N n-->height of the triangle
		int f[]=new int[N+1];
		fib(f,N);
		int fibNum=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(f[fibNum++]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		fiboTriangle(n);
	}
	
	
}
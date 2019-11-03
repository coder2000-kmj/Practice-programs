package practice;
import java.util.*;
public class bell4 {
	public static final int max=999;
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int k[]=new int[10];
	int a[][]=new int[30][30];
	System.out.println("Bellman ford algorithm");
	System.out.println("enter the no of nodes");
	int n=s.nextInt();
	System.out.println("enter the adjacent matrix");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
		a[i][j]=s.nextInt();
		  if(a[i][j]==0)
		  {
		  a[i][j]=max;
		  }
		}	
	}
	System.out.println("enterd matrix is: ");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.println(a[i][j]+" ");
		}
	}
	System.out.println("enter the destination vector");
	int d=s.nextInt();
	if(d<=n)
	{
	for(int v=1;v<=n;v++)
		k[v]=max;
	    k[d]=0;
	for(int v=1;v<=n-1;v++)
	{
		for(int x=1;x<=n;x++)
		{
			for(int y=1;y<=n;y++)
			{
				if(a[x][y]!=max)
				{
				if(k[y]>k[x]+a[x][y])
				k[y]=k[x]+a[x][y];
				}
			}
		}
	 }
	for(int x=1;x<=n;x++)
	{
		for(int y=1;y<=n;y++)
		{
			if(a[x][y]!=max)
			{
			if(k[y]>k[x]+a[x][y])
				System.out.println("Negative edge cycle");
		    }
	    }
	}
	for(int r=1;r<=n;r++)
	   {
		System.out.print("Minimum distance from node "+r+" to node");
		System.out.println(+d+" is "+k[r]);
	   }
          
	} 
	                              }
	
                        }

package practice;
import java.util.*;
public class rsa {
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the two prime numbers");
	int p=s.nextInt();
	int q=s.nextInt();
	int n=p*q;
	int z=(p-1)*(q-1);
	System.out.println("enter the value of E");
	int e=s.nextInt();
	while(true)
	{
		if(gcd(z,e)!=1)
		{
			System.out.println("enter the valid E");
			e=s.nextInt();
		}
		else
	    break;
	}
	int d=D(e,z);
	System.out.println("value of D is "+d);
	System.out.println("enter the plain text(number)");
	int m=s.nextInt();
	int c=(int)(Math.pow(m, e)%n);
	System.out.println("Ciper text is:"+c);
	int x=(int)(Math.pow(c, d)%n);
	System.out.println("the recived text is: "+x);
	if(x==m)
	{
		System.out.println("input matched");
	}
	else
	{
		System.out.println("input mismatched");
	}
	}
	static int D(int e,int z)
	{
		for(int i=1;i<=z;i++)
		{
		int b=(i*e)%z;
	    if(b==1)
	    	return i;
		}
		return 0;
	}
	static int gcd(int num1,int num2)
	{
	    if(num2==0)
	    {
	    	return num1;
		}
	 return gcd(num2,num1%num2);  
}
}

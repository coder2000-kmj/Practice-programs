package practice;
import java.util.*;
import java.io.*;
class crc1 {
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("enter the no of data bits");	
int n=s.nextInt();
int data[]=new int[n];
System.out.println("enter the data bits");
for(int i=0;i<n;i++)
data[i]=s.nextInt();
System.out.println("enter the no of division bits");
int m=s.nextInt();
int divisor[]=new int[m];
System.out.println("enter divisor bits");
for(int j=0;j<m;j++)
divisor[j]=s.nextInt();
int len=n+m-1;
int div[]=new int[len];
int rem[]=new int[len];
int crc[]=new int[len];
for(int i=0;i<data.length;i++)
	div[i]=data[i];
System.out.println("divide after appending zero");
for(int i=0;i<div.length;i++)
	System.out.println(div[i]);	
for(int j=0;j<div.length;j++)
	rem[j]=div[j];
rem=divide(div,divisor,rem);
for(int i=0;i<div.length;i++)
crc[i]=div[i]^rem[i];
System.out.println("crc code");
for(int i=0;i<crc.length;i++)
System.out.println(crc[i]);
System.out.println("the crc code of " + len + " bits");
System.out.println("enter the crc code");
for(int i=0;i<crc.length;i++)
	crc[i]=s.nextInt();
for(int j=0;j<crc.length;j++)
	rem[j]=crc[j];
	rem=divide(crc,divisor,rem);
	for(int i=0;i<rem.length;i++)
	{
		if(rem[i]!=0)
		{
			System.out.println("error!!!");
			break;
		}
		if(i==(rem.length-1))
			System.out.println("no error");	
	 }
}
static int[]divide(int div[],int divisor[],int rem[])
{
int cur=0;
while (true)
{
for(int i=0;i<divisor.length;i++)
rem[cur+i]=(rem[cur+i]^divisor[i]);
while(rem[cur]==0 && cur!=rem.length-1)
	cur++;
if((rem.length-cur)<divisor.length)
break;
}
return rem;
}
}

	
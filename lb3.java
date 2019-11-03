package practice;
import java.util.*;
public class lb3 {
	public static void main(String[] args) {
	int  op;
	Scanner s=new Scanner(System.in);
	int remain=0;
	int bktcap=0;
	System.out.println("enter the total capacity of the bucket");
	bktcap=s.nextInt();
	System.out.println("enter the number of inputs(value of n)");
	int n=s.nextInt();
	int pkt[]=new int[10];
	System.out.println("enter the output data rate");
	int dr=s.nextInt();
	System.out.println("enter the inputs");
	for (int i=0;i<n;i++)
	{
		pkt[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		int total=pkt[i]+remain;
		if(total>bktcap)
		{
			if(pkt[i]>bktcap)
			{
System.out.println("incoming packet size: "+pkt[i]+" bytes");
System.out.println("greater than the bucket capacity "+bktcap+" bytes");
System.out.println("bucket size exceded packet discarded");	
			}
		}
		else
		{
			remain+=pkt[i];
			System.out.println("\nincoming packet size is:"+pkt[i]);
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
			System.out.println("packet of size "+op+" is transmitted");
			System.out.println("remaining capacity is: "+remain);
			System.out.println("");
		}
	  }

	}

}

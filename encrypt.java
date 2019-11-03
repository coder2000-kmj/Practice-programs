package practice;
import java.util.*;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=s.next();
		int total=0;
		long product=1;
		for(int i=0;i<str.length();i++)
		{
			int a=-(64-(int)(str.charAt(i)));
			 total=total+a;
			 product=product*a;
		}
		System.out.println("Total and product is"+"\t"+total+"\t"+product);
		int div=(int)product/total;
		System.out.println("the divided value is"+div);
	
		}



}

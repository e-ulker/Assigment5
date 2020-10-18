package assigment_5;
import java.util.Scanner;
public class question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int a1=0,a2=1;
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			System.out.print(a1);
			sum=a1+a2;
			a1=a2;
			a2=sum;
			//System.out.print(sum);
		}
		
		
		
		
	}

}

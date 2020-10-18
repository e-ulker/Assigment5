package assigment_5;
import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		//istenilenden tam,Emin deðilim soracaðým ???????
		
		int product=0;
		int i=0;
		 while(i<100)
		 {
			 System.out.println("enter a  number please");
				int number=scan.nextInt();
				product=number*10;
			if(product<100) {
			 
			 System.out.println(product+" ");
			 }
			else {
				System.out.println("sory plese enter another number");
			}

			 i++;
		 }
		
		
		
		
		

	}
}

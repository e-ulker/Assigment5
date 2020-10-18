package assigment_5;
import java.util.Scanner;

public class question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        
        Scanner scan=new Scanner(System.in);
		
		System.out.println("enter upper bound");
		int upperbound=scan.nextInt();
		int a2,a=1,sum=0;
		while(a<=(upperbound))     
		{
			sum+=a;    
			if(a<upperbound) {
 			System.out.print(a+"+");   
			}else {
				System.out.print(a+"="+sum);
			}
			a++;                                            
		}		
        
        
        
        
		
	}

}

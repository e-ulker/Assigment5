package assigment_5;
import java.util.Scanner;
public class question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter end number: ");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.print(i);
				if (i<num-1) {
					System.out.print(", ");
			}
		}
		
		
		
		
	}
	}
}

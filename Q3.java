package Assignment_1;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int num;
	        int a=0;
	        num  = sc.nextInt();
	        int num2=num;
	        while(num2!=0) {
	            a++;
	            num2 = num2-num2%10;
	            num2 = num2/10;

	        }
	        int arr[] = new int[a];
	        for(int i=a-1; i>=0;i-- ) {
	            arr[i] = num%10;
	            num = num-arr[i];
	            num = num/10;

	        }
	        System.out.println("This is the number "+arr[1]);
		System.out.println("CLosing the scanner");
		sc.close();

	    }

}

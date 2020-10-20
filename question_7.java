package Assignment_1;
import java.util.*;

public class question_7 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the length of array");
		int b = sc.nextInt();
		int arr[] = new int [b];
		for(int i = 0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		int a; 
		int brr[] = new int [b];
		for(int j = 0;j<arr.length;j++ ) {
			a = arr[j];
			 int num= a;
				int sum = 0;
				int rem = 0;
				while(num>0) {
					rem = num%10;
					
					sum = sum+rem;
					num = num/10;
					brr[j] = sum;
					
				}
				
		}
		int max =brr[0];
		int count = 0;
		for(int k= 0; k<brr.length;k++) {
			if (arr[k]>max) {
			max = arr[k];
			count  = k;
		}
		}
		
		
		System.out.println("This is the number"+arr[count]);
		sc.close();
	}}
		//Authored by Nikhil Kutta


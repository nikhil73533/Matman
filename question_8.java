package Assignment_1;
import java.util.*;
public class question_8 {

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
		 
		int max = arr[0];
		for (int j = 0; j<arr.length;j++) {
			if(max<arr[j]) {
				max = arr[j];
				
				
			}
			
		}
		System.out.println(max);
		int delete = max;
		for(int k  = 0; k<arr.length;k++) {
			if(delete==arr[k]) {
				
				for(int l = k; l<arr.length-1;l++) {
					arr[l] = arr[l+1];
					
				}
				break;
			}
		}
		
		
		for(int u = 0; u<arr.length-1;u++) {
			System.out.print(arr[u]);
		}
		
		
		
		
		
	}
	

}

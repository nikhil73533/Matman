package Assignment_1;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class Q_11 {
	public static void main(String[]args) {
		int sumo = 0;
		Scanner sc  = new Scanner(System.in);
		int num1 = 0;
	System.out.println("Enter the length of array");
		int num  = sc.nextInt();
		int c = 0;
		int inc = 0;
		int sum = 0;
		int arr[] = new int[num];
		int brr[] = new int[num];
		for (int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			 num1 = arr[i];
			 while(num1!=0) { 
					num1 = num1-num1%10;
					num1 = num1/10;
					c++;
					
				}
			System.out.println(c);
			int g = c-1;
			double d = Math.pow(10.0, g);
			c = c*0;
			System.out.println(d);
			int e = (int)d;
			
			int div = arr[i]%e;
			sumo = sumo+div;
		}
		
		System.out.println(sumo);
}}

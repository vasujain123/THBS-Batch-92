import java.lang.*;
import java.util.*;


public class Demo1 {

	public static void main(String[] args) {

		int[] num={10,20,2,5,7,90,35};
		int[] num1= {20,30,40,5,60,35,80};

		int sum=0;
		int c=0;
		int max=num[0];
		int min=num[0];

		Scanner s=new Scanner(System.in);

		System.out.print("Enter the element you want to search:");
		int n=s.nextInt();

		// to search whether the element present in the array or not

		for(int i=0;i<num.length;i++) {

		if(num[i]==n) {
		System.out.println("Eelement Present");
		System.out.println("Index of the element:"+i);
		}
		else {
		System.out.println("Elemet not found");
		}
		// it will add each and every values to the sum variable and store the sum of the array values

		sum+=num[i];
		}

		System.out.println("Sum of the array values is:"+sum);

		System.out.println("Average of Array Elements:"+(sum/num.length));

		System.out.println("---------------------Minimum and Maximum element in the array ------------------------------");

		// find out the minimum and maximum element in the array

		for (int i=1 ;i<num.length;i++) {
		if(num[i]>max) {
		max=num[i];
		}
		else if(num[i]<min) {
		min=num[i];
		}
		}
		System.out.println("Maximum element in the array :"+max);
		System.out.println("Manimum element in the array :"+min);

		System.out.println("---------------------Original array------------------------------");
		for (int i=0;i<num.length;i++) {

		System.out.println(" "+num[i]+" ");
		}
		System.out.println("---------------------Reverse the array ------------------------------");
		for (int i=num.length-1;i>0;i--) {

		System.out.println(" "+num[i]+" ");
		}
		
		System.out.println("---------------------Comparing array size and elements are equal or not in two arrays -----------------------------");
		if(num.length==num1.length) {

		System.out.println("Size of the array is equal");

		for (int i=0;i<num.length;i++) {

		if(num[i]==num1[i]) {
		System.out.println("Two arrays are equal");
		}
		else {
		System.out.println("Arrays are not Equal");
		break;
		}
		}

		}
		System.out.println("----------------------To find common elements in two arrays------------------------- ");
		for (int i=0;i<num.length;i++) {
		for(int j=0;j<num1.length;j++) {
		if(num[i]==num1[j]) {
		System.out.print(" "+num[i]);
		}
		}
		}
		System.out.println("Merging two arrays");
	}

}

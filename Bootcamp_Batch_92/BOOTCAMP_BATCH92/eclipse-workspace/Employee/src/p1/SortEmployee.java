package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 25, "Shadab", 1000);
		Employee e2 = new Employee(2, 23, "Pritam", 1234);
		Employee e3 = new Employee(3, 26, "Madhu", 1200);
		Employee e4 = new Employee(4, 22, "Neha", 1500);

		Employee[] empArr = { e1, e2, e3, e4 };

		System.out.println("Before Sorting------------");
		System.out.println(Arrays.toString(empArr));

		/*Arrays.sort(empArr); // e1.compareTo(e2), e2.compareTo(e3),.......

		System.out.println(Arrays.toString(empArr));

	}

}*/
		
		
		System.out.println("After Sorting( Age wise)------------");
		Arrays.sort(empArr); // e1.compareTo(e2), e2.compareTo(e3),.......
		System.out.println(Arrays.toString(empArr));

		System.out.println("After Sorting( Name wise)------------");
		Arrays.sort(empArr, new NameComparator());
		System.out.println(Arrays.toString(empArr));

		System.out.println("After Sorting( Salary wise)------------");
		Arrays.sort(empArr, new SalaryComparator());
		System.out.println(Arrays.toString(empArr));

	}

}
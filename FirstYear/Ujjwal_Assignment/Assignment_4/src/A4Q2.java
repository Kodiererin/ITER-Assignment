//	Write a java program that uses a for loop. With the loop, make the variable x go from -2 to 2 counting by 0.5.
//	-2.0
//	-1.5
//	-1.0
//	-0.5
//	0.0
//	0.5
//	1.0
//	1.5
//	2.0
import java.util.*;
public class A4Q2 {

	public static void main(String[] args) 
	{
		for(double x = -2.0 ; x<=2.0 ; x+= 0.5)
		{
			System.out.println(x);
		}
	}

}

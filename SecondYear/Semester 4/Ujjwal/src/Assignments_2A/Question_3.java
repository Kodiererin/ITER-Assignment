package Assignments_2A;
//	Write a java program to convert a decimal to binary equivalent using
//	stack(Stack collection).
public class Question_3 {
	public static void main(String[] args) {
		System.out.println(decimalToBinary(8, ""));
	}
	public static String decimalToBinary(int x , String Binary) {
		if(x==0) {
			return Binary;
		}
		Binary = (x%2)+Binary;
		return decimalToBinary(x/2, Binary);
	}
}

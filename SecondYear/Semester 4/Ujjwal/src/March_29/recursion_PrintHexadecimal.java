package March_29;
//	WAP to Convert Decimal to Hexadecimal
public class recursion_PrintHexadecimal {
	public static void main(String[] args) {
		System.out.println(hexaDecimalConversion(100, ""));
	}
	public static String hexaDecimalConversion(int x,String hexa) {
		if(x==0) return hexa;
		int rem=x%16;
		switch(rem) {
			case 10 :{ 
				hexa='A'+hexa;
				break;
			}
			case 11 : {
				hexa='B'+hexa;
				break;
			}
			case 12 : {
				hexa='C'+hexa;
				break;
			}
			case 13 :{
				hexa='D'+hexa;
				break;
			}
			case 14 : {
				hexa='E'+hexa;
				break;
			}
			case 15 : {
				hexa='F'+hexa;
				break;
			}
			default : {
				hexa=rem+hexa;
			}
		}
		return hexaDecimalConversion(x/16, hexa);
	}
}
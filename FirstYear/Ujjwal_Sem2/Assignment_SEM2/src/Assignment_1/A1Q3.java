package Assignment_1;

public class A1Q3 {
	public static void main(String[] args) {
		char[] ch = new char[] { 'c', 'a', 'r', 'b', 'o', 'n' };
		int ctr = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < ch.length; k++) {
					for (int l = 0; l < ch.length; l++) {
						for (int m = 0; m < ch.length; m++) {
							for (int n = 0; n < ch.length; n++) {
								if (i != j && i != k && j != k && i != l && i != m && l != m && i != n && m != n
										&& j != n && k != n && l != n && k != l && k != m && j != l && j != m) {
									System.out.println(ch[i] + "" + ch[j] + "" + ch[l] + "" + ch[m] + "" + ch[n]);
									ctr++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("As by permutation also it is possible to get the combination without repeating 6! = 720");
		System.out.println(ctr);
	}
}

package Jan_07;

import java.util.Collections;
import java.util.Comparator;

class Account{
	int accNo;
	double balance;
	Account(int accNo , double balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	public boolean equalsTo(Account a , Account b) {
		return a.accNo==b.accNo;
	}
}
class CompareAccount implements Comparator<Account>{

	@Override
	public int compare(Account a , Account b) {
		if(a.accNo>b.accNo) return 1;
		else if(a.accNo<b.accNo) return -1;
		else return 0;
	}
	
}
public class AccountLinkedList {
	public static void main(String[] args) {
		java.util.LinkedList<Account> ll = new java.util.LinkedList<Account>();
//		Creating an Account
		ll.add(new Account(1231 , 100000));
		ll.add(new Account(12131 , 100000));
		ll.add(new Account(12331 , 10002.20));
		ll.add(new Account(12431 , 1000));
		ll.add(new Account(12361 , 10999));
		ll.add(new Account(12321 , 1003.440));
//		Adding Account to the Last
		ll.addLast(new Account(1121,999999));

		
//		Searching the account in the Binary Search
		System.out.println(Collections.binarySearch(ll, new Account(12331,10002.20), new CompareAccount()));
		
//		Sort the account in Reverse order according to the account no
		ll.sort(Collections.reverseOrder(new CompareAccount()));
		
		
//		Removing account Object
		ll.remove(new Account(12321,1003.440));
		
//		Display the List
		for(Account a : ll) {
			System.out.println(a.accNo+" "+a.balance);
		}
	}

}

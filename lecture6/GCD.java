public class GCD {
	public static int gcd(int n1, int n2) {	
		// Assume n1>0, n2>=0, and n1>=n2

		n1 = Math.abs(n1);     // this is not 
		n2 = Math.abs(n2);     // very good
		if (n1 < n2)
			return gcd(n2, n1);
		if (n2 == 0)
			return n1;
		return gcd(n2, n1 % n2);
	} 

	public static void main(String args[]){	
		System.out.println("GCD for 45 and 90 is " + gcd(45, 90));
	}	

}

package Apna_package;

public class ch {
	
	public static Boolean check_prime(int n, int i) {
		if (n <= 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else if (n % i == 0) {
			return false;
		}
		if (i * i > n) {
			return true;
		}
		return check_prime(n, i + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check_prime(7, 2));

	}

}

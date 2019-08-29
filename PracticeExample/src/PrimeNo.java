import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter NO");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeNo pm = new PrimeNo();
		boolean b = pm.chkNoisPrime(n);
		boolean p = pm.sumOfDigIsPrime(n);
		System.out.println(p + " and " + b);
		if (b && p) {
			System.out.println(" prime no");
		} else {
			System.out.println("not prime no");
		}
	}

	public boolean chkNoisPrime(int n) {
		double rotateNo = n;
		boolean flag = false;
		int Count = 0;

		while (n > 0) {
			n = n / 10;
			Count = Count + 1;
			//System.out.println("Count No:" + Count);

		}

		for (int k = 0; k < Count; k++) {
			//System.out.println("Rotation No:" + rotateNo);
			double r = rotateNo % 10;
			//System.out.println("Rem :" + r);
			double no = r * Math.pow(10, Count - 1);
			//System.out.println(" No:" + no);
			Double fNo = no + rotateNo / 10;
			int intNo = fNo.intValue();
			System.out.println("final No:" + intNo);
			rotateNo = intNo;

			for (int i = 2; i < intNo / 2; i++) {

				if (intNo % i == 0) {
					//System.out.println("flag is true");
					flag = true;
					break;

				} else {
					//System.out.println("flag is false");
					flag = false;

				}

			}

		}
		return flag;

	}

	public boolean sumOfDigIsPrime(Integer n) {
		int n1 = n;
		boolean flag = false;
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
			//System.out.println("sum" + sum);
		}
		for (int i = 2; i < n1 / 2; i++) {
			if (sum % i == 0) {
				System.out.println("sum flag true");
				flag = true;
				break;
			} else {
				System.out.println("sum flag false");
				flag = false;
			}
		}

		return flag;

	}

}

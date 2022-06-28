package practice;

public class Prime {
	int n,i;
public void a() {
	n=23;
	for( i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println("given number is not prime");
			break;
		}
	}
	if(i==n) {
		System.out.println("Given number is prime "+ n);
	}
}
public static void main(String[] args) {
	Prime z=new Prime();
	z.a();
}
}

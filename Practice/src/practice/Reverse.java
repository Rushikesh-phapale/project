package practice;

public class Reverse {
	int n,rem;
public void a() {
	n=340;
	while(n>0) {
		rem=n%10;
		System.out.print(rem);
		n=n/10;
	}
}
public static void main(String [] args) {
	Reverse z=new Reverse();
	z.a();
}
}

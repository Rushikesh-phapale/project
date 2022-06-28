package practice;

public class Addition {
	int a,b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
	}
public void a() {
	int c=a+b;
	System.out.println(c);
}
public static void main(String [] args) {
	Addition z=new Addition(10,20);
	z.a();
}
}

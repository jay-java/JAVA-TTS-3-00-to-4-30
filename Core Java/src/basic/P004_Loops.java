package basic;

public class P004_Loops {
	public static void main(String[] args) {
		System.out.println("for  loop");
		for(int i=10;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("while");
		int j =10;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while");
		int k = 10;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}

package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception-> abnormal situation occurs at runtime
//			-> two types 1.Checked (class directly inherit throwable)
//						2.Unchecked (class directly inherit runtime)
//						3. Error(As per oracle)
// 5 keyword to handle exception
// 1.Try 2.catch 3. finally 4.throw 5.throws
class Divide{//B
	Scanner sc = new Scanner(System.in);
	public void division() throws ArithmeticException,InputMismatchException{
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i/j;
		System.out.println(k);
	}
	public void input() {
		System.out.println("enter value = ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num);
		}
		else {
			throw new ArithmeticException("");
		}
	}
}
public class P016_Exception { //A
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
		}
		catch(InputMismatchException e) {
			
		}
		
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter i = ");
//			int i = sc.nextInt();
//			System.out.println("enter j = ");
//			int j = sc.nextInt();
//			int k = i/j;
//			System.out.println(k);
//			System.exit(0);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		}catch(InputMismatchException e) {
//			System.out.println("denominator shoud be numeric");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this msg will executes everytime");
//		}
	}
}

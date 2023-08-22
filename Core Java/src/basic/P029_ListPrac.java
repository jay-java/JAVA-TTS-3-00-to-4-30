package basic;

import java.util.ArrayList;
import java.util.List;

class StudentData{
	private int id;
	private String name;
	private double per;
	public StudentData(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}
public class P029_ListPrac {
	public static void main(String[] args) {
		StudentData s1=  new StudentData(1, "viraj", 65.6);
		StudentData s2=  new StudentData(2, "anvesh", 67.6);
		StudentData s3=  new StudentData(3, "divyang", 68.6);
		List<StudentData> list = new ArrayList<StudentData>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		for(StudentData s:list) {
			System.out.println(s);
		}
	}
}

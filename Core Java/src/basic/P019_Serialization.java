package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserData implements Serializable{
	private int id;
	private String name;
	private long contact;
	private String address;

	public UserData() {
		super();
	}

	public UserData(int id, String name, long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}

}

public class P019_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		UserData u1 = new UserData(1,"java",98765321,"ahmedabad");
//		FileOutputStream fos = new FileOutputStream("data.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(u1);
//		oos.flush();
//		oos.close();
//		System.out.println("object written successfully");
//		
		
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserData u = (UserData)ois.readObject();
		System.out.println(u);
	}
	
}

package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable //implements Externalizable 도 사용가능
{
	
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("스티즈잡스", "CEO");
		Person p2 = new Person("웬디우드", "해빗 저자");
		
		try( FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
	
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
	
			Person p3 = (Person)ois.readObject();
			Person p4 = (Person)ois.readObject();
			
			System.out.println(p3);
			System.out.println(p4);
			
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}
}

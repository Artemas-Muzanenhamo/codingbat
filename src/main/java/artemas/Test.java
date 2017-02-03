package artemas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream out = new FileOutputStream("test.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("James");
		list.add("Mary");
		list.add("Jane");
		
		objectOutputStream.writeObject(list);
		
		FileInputStream in = new FileInputStream("test.txt");
		ObjectInputStream obj = new ObjectInputStream(in);
		
		System.out.println(obj.readObject());
	}
	
}

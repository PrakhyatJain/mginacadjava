package main.java.com.academic.collections2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	String name, email, ph;
	void demoProperty() throws IOException{
		File f = new File("E:/bin/propertyfiles/propertyfile.properties");
		if(f.exists()){
			Properties pro = new Properties();
			FileInputStream fis = new FileInputStream(f);
			pro.load(fis);
			name = pro.getProperty("name");
			System.out.println("Name is     : "+name);
			email = pro.getProperty("email");
			System.out.println("Email id is : "+email);
			ph = pro.getProperty("ph");
			System.out.println("Phone No is : "+ph);
		}
		else{
			System.out.println("File not found! ");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertiesDemo p = new PropertiesDemo();
		p.demoProperty();
	}
}

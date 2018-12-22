import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingProperty {

	public static void main(String[] args) throws IOException {
		
		//creat an instance of class
		Properties prop= new Properties();
		
		//provede the path of the file to constructor of the class
		FileInputStream ip= new FileInputStream("C:\\Users\\binni\\Desktop\\Selenium\\testing-mavan\\Properties\\employee.properties");
		
		prop.load(ip);
		
		//retrieve those properties
		String name = prop.getProperty("name");
		System.out.println(name);
		
		System.out.println(prop.getProperty("age"));	
		
	}

}

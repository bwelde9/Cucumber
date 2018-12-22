package testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AppDataProvider {
	@Ignore
	@Test(dataProvider="getdata")
	public void loginTest(String username) {
		System.out.println(username);
		
	}
	
	@DataProvider
	public String[] getdata() {
		String[] data = new String[3];
		data[0]="Mike";
		data[1]="Smith";
		data[2]="Tommy";
		
		return data;
	}
	@Test(dataProvider="getdata2")
	public void logintest2(String username,String password,String phone,String browser) {
		
		System.out.println(username + "|" + password +"|" + phone + "|" + browser);
		
	}
	@DataProvider
	public Object[][] getdata2(){
		 Object[][] data = new Object[3][4];
		 
		 //first row
		 data[0][0]="username1";
		 data[0][1]="password1";
		 data[0][2]="phone1";
		 data[0][3]="browser1";
		//second row
		 data[1][0]="username2";
		 data[1][1]="password2";
		 data[1][2]="phone2";
		 data[1][3]="browser2";
		//third row
		 data[2][0]="username3";
		 data[2][1]="password3";
		 data[2][2]="phone3";
		 data[2][3]="browser3";
		
		 
		 return data;
	}

}

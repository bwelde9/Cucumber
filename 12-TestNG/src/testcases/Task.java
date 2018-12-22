package testcases;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Task {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("---Before Suit---");

	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("---After Suit---");
	}
	
	@Test(priority=1)
	public void register() {
		System.out.println("Register successfully complated");
	}
	@Test(priority=2,dependsOnMethods= {"register"})
	public void search() {
		System.out.println("Search successfully complated");
		throw new SkipException("error");
	}
	@Test(priority=3,dependsOnMethods= {"search"})
	public void buy() {
		System.out.println("Buy successfully complated ");
	}
	@Test(priority=4,dependsOnMethods= {"buy"})
	public void pay() {
		System.out.println("Pay successfully complated");
	}
	




}

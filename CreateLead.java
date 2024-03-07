package assignment10Dynamicparameter;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass {
	@DataProvider(name="data")
	public String[][] sentData(){
	String[][] details=new String[3][4];
	details[0][0]="testLeaf";
	details[0][1]="Aravind";
	details[0][2]="r";
	details[0][3]="99";
	
	details[1][0]="testleaf";
	details[1][1]="arun";
	details[1][2]="d";
	details[1][3]="98";
	
	details[2][0]="Testleaf";
	details[2][1]="Karthik";
	details[2][2]="J";
	details[2][3]="97";
	
	return details;
	}
	@Test(dataProvider="data")
	public void create(String cname, String name, String lname, String phnum) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}

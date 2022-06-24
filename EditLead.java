package selenumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\New folder\\geckodriver.exe");
	       WebDriver driver=new FirefoxDriver();
	       driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement usernameElement=driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement=driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		WebElement loginButton=driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaElement=driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		WebElement elementLeads=driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLeads=driver.findElement(By.linkText("Create Lead"));
		elementCreateLeads.click();
		WebElement elemententercompanyname=driver.findElement(By.id("createLeadForm_companyName"));
		elemententercompanyname.sendKeys("mark industries");
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("MARK");
		WebElement lastname=driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("INDUSTRIES");
		WebElement localname=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localname.sendKeys("markindustries");
		WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Testing");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("WELCOME TO MARK INDUSTRIES");
		WebElement email =driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("hi123@gmail.com");
		WebElement toname=driver.findElement(By.id("createLeadForm_generalToName"));
		toname.sendKeys("George");
		WebElement address=driver.findElement(By.id("createLeadForm_generalAddress1"));
		address.sendKeys("Central Park new york");
		WebElement city=driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("Newyork");
		WebElement postal=driver.findElement(By.id("createLeadForm_generalPostalCode"));
		postal.sendKeys("96701-3820");
		WebElement address2=driver.findElement(By.id("createLeadForm_generalAttnName"));
		address2.sendKeys("newyork");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.sendKeys("New York");
		WebElement submitbutton=driver.findElement(By.name("submitButton"));
		submitbutton.click();
		WebElement edit=driver.findElement(By.linkText("Edit"));
		edit.click();
		WebElement update=driver.findElement(By.id("updateLeadForm_description"));
		update.clear();
		WebElement note=driver.findElement(By.id("updateLeadForm_importantNote"));
		note.sendKeys("HI WELCOME TO MARK INDUSTRIES ");
		WebElement button=driver.findElement(By.className("smallSubmit"));
		button.click();
		

	}

}

package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pages {

	WebDriver driver;
		@Given("login and home page")
		public void login_and_home_page() throws InterruptedException {
			// Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver","C:\\Users\\KatakamVasuki\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
		}


		
		@When("click on admin and edit")
		public void click_on_admin_and_edit() {

			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("menu_admin_Organization")).click();
			driver.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();
			
		}
		@When("Do edit")
		public void do_edit_and_save() {
		    driver.findElement(By.id("btnSaveGenInfo")).click();
		    driver.findElement(By.id("organization_phone")).clear();
		    driver.findElement(By.id("organization_phone")).sendKeys("1234567891");
		    
		}
		@Then("Save")
		public void verify_edit() {
			driver.findElement(By.id("btnSaveGenInfo")).click();
			driver.close();
		}



}

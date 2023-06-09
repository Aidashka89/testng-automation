package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import utilities.Driver;

public class Google {

    public void search(){
        Faker faker = new Faker();
        String testData = faker.lorem().word();
        Driver.getDriver().get("https://google.com");
        Driver.quit();
    }
}

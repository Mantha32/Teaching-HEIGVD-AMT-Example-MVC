package ch.heigvd.amt.uat.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to test the "Beers List" page in the MVCDemo app.
 * Notice that in the constructor, we check if we are on the correct page
 * by checking the HTML title of the page. This is used to detect navigation
 * issues (for example, you expect to arrive on the Beers page, but the 
 * title of the actual page is "Login Page" because of some error.
 * 
 * @author Olivier Liechti
 */
public class ProfilePage extends AbstractMVCDemoPage {

  public ProfilePage(WebDriver driver) {
    super(driver);

    // Check that we're on the right page.
    if (!"Profile".equals(driver.getTitle())) {
      throw new IllegalStateException("This is not the correct page");
    }
  }
  
}

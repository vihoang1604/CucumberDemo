package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage {
    @FindBy(xpath = "//form/div[1]/input")
    WebElement firstName;
    @FindBy(xpath = "//form/div[2]/input")
    WebElement lastName;
    @FindBy(xpath = "//form/div[3]/input")
    WebElement postCode;
    @FindBy(xpath = "//form/div[3]/input")
    WebElement buttonAddCustomer;

    public void getInformationCustomer(String inputFirstName, String inputLastName, String inputPostCode) {
        this.firstName.clear();
        if (!inputFirstName.equals("null")) {
            this.firstName.sendKeys(inputFirstName);
        }
        this.lastName.clear();
        if (!inputLastName.equals("null")) {
            this.lastName.sendKeys(inputLastName);
        }
        this.postCode.clear();
        if (!inputPostCode.equals("null")) {
            this.postCode.sendKeys(inputPostCode);
        }
    }

    public void clickSummit() {
        this.buttonAddCustomer.click();
    }
}

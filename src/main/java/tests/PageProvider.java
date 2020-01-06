package tests;


import org.openqa.selenium.support.PageFactory;
import pages.AddCustomerPage;
import pages.CommonPage;
import runner.TestRunner;

public class PageProvider {
private static AddCustomerPage addCustomerPage;
private static CommonPage commonPage;


    static AddCustomerPage getAddCustomerPage() {
        if(addCustomerPage == null){
            addCustomerPage= PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
        }
        return addCustomerPage;
    }
    private static CommonPage getCommonPage(){
        if (commonPage==null){
            commonPage=PageFactory.initElements(TestRunner.driver,CommonPage.class);
        }
        return commonPage;
    }
}

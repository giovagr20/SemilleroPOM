package io.testim.demo.pruebas.steps;

import io.testim.demo.pruebas.pageobjects.TongliPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;

public class TongliSteps {

    private TongliPageObject tongliPOM = new TongliPageObject();
    private static final String TEXT = "Space Advisor";

    @Step
    public void openBrowser() {
        String url = "http://demo.testim.io/";
        tongliPOM.getDriver().get(url);
        tongliPOM.getDriver().manage().window().maximize();
    }

    @Step
    public void verifyTextSpaceAdvisor() {
        Assert.assertThat(
                tongliPOM.getDriver().findElement(tongliPOM.getLblSpaceAdvisor()).getText(),
                Matchers.is(TEXT));
    }

    @Step
    public void selectAdults(String numberAdults) {
        List<WebElement> selectorsInput= tongliPOM.getDriver().findElements(tongliPOM.getLstGeneric());
        selectorsInput.get(0).click();
        List<WebElement> selectorsUl = tongliPOM.getDriver().findElements(tongliPOM.getLstGenericUl());
        selectorsUl.get(2).click();

        //Select select = new Select(selectorsUl.get(0));
        //select.selectByVisibleText(numberAdults);

    }

    @Step
    public void selectChildren() {
        List<WebElement> selectorsInput= tongliPOM.getDriver().findElements(tongliPOM.getLstGeneric());
        selectorsInput.get(1).click();
        List<WebElement> selectorsUl = tongliPOM.getDriver().findElements(tongliPOM.getLstGenericUl());
        selectorsUl.get(5).click();
    }

}

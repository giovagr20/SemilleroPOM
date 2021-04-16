package io.testim.demo.pruebas.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.testim.io/")
public class TongliPageObject extends PageObject {
//(//ul[@class='theme__values___1jS4g WhiteDropDown__values___3lOeL'])[1]

    private By lblSpaceAdvisor = By.xpath("//h1[contains(.,'Space Advisor')]");
    private By lstGeneric = By.xpath("//input[@class='theme__inputElement___27dyY WhiteDropDown__inputInputElement___2wTPU theme__filled___1UI7Z']");
    private By lstAdults = By.xpath("//ul[@class='theme__values___1jS4g WhiteDropDown__values___3lOeL'])[1]");
    private By lstGenericUl = By.xpath("//ul[@class='theme__values___1jS4g WhiteDropDown__values___3lOeL']//li");
    private By lstChildren = By.xpath(" //ul[@class='theme__values___1jS4g WhiteDropDown__values___3lOeL'])[2]");


    public TongliPageObject(By lblSpaceAdvisor, By lstGeneric, By lstAdults, By lstGenericUl, By lstChildren) {
        this.lblSpaceAdvisor = lblSpaceAdvisor;
        this.lstGeneric = lstGeneric;
        this.lstAdults = lstAdults;
        this.lstGenericUl = lstGenericUl;
        this.lstChildren = lstChildren;
    }

    public TongliPageObject() {
        super();
    }

    public By getLstAdults() {
        return lstAdults;
    }

    public void setLstAdults(By lstAdults) {
        this.lstAdults = lstAdults;
    }

    public By getLstChildren() {
        return lstChildren;
    }

    public void setLstChildren(By lstChildren) {
        this.lstChildren = lstChildren;
    }

    public By getLblSpaceAdvisor() {
        return lblSpaceAdvisor;
    }

    public void setLblSpaceAdvisor(By lblSpaceAdvisor) {
        this.lblSpaceAdvisor = lblSpaceAdvisor;
    }

    public By getLstGeneric() {
        return lstGeneric;
    }

    public void setLstGeneric(By lstGeneric) {
        this.lstGeneric = lstGeneric;
    }

    public By getLstGenericUl() {
        return lstGenericUl;
    }

    public void setLstGenericUl(By lstGenericUl) {
        this.lstGenericUl = lstGenericUl;
    }
}

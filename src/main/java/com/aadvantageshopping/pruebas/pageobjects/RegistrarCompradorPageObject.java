package com.aadvantageshopping.pruebas.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.aadvantageeshopping.com/")
public class RegistrarCompradorPageObject extends PageObject {

    private By inpNumeroAadvantage = By.id("mn_memberId");
    private By inpEmail = By.id("mn_email");
    private By inpNombre = By.id("mn_firstName");
    private By inpApellidos = By.id("mn_lastName");
    private By inpCodigoPostal = By.id("mn_zipCode");
    private By inpClave = By.id("mn_password");
    private By lnkLogo = By.xpath("//*[@class ='mn_logo']");
    private By btnRegistrar = By.xpath("//input[contains(., ''Sign Up')]");
    private By txtMensajeValidacion = By.xpath("//h2[contains(.,'Welcome')]");

    public RegistrarCompradorPageObject() {
        super();
    }

    public RegistrarCompradorPageObject(By inpNumeroAadvantage, By inpEmail, By inpNombre, By inpApellidos, By inpCodigoPostal, By inpClave, By lnkLogo, By btnRegistrar, By txtMensajeValidacion) {
        this.inpNumeroAadvantage = inpNumeroAadvantage;
        this.inpEmail = inpEmail;
        this.inpNombre = inpNombre;
        this.inpApellidos = inpApellidos;
        this.inpCodigoPostal = inpCodigoPostal;
        this.inpClave = inpClave;
        this.lnkLogo = lnkLogo;
        this.btnRegistrar = btnRegistrar;
        this.txtMensajeValidacion = txtMensajeValidacion;
    }

    public By getInpNumeroAadvantage() {
        return inpNumeroAadvantage;
    }

    public void setInpNumeroAadvantage(By inpNumeroAadvantage) {
        this.inpNumeroAadvantage = inpNumeroAadvantage;
    }

    public By getInpEmail() {
        return inpEmail;
    }

    public void setInpEmail(By inpEmail) {
        this.inpEmail = inpEmail;
    }

    public By getInpNombre() {
        return inpNombre;
    }

    public void setInpNombre(By inpNombre) {
        this.inpNombre = inpNombre;
    }

    public By getInpApellidos() {
        return inpApellidos;
    }

    public void setInpApellidos(By inpApellidos) {
        this.inpApellidos = inpApellidos;
    }

    public By getInpCodigoPostal() {
        return inpCodigoPostal;
    }

    public void setInpCodigoPostal(By inpCodigoPostal) {
        this.inpCodigoPostal = inpCodigoPostal;
    }

    public By getInpClave() {
        return inpClave;
    }

    public void setInpClave(By inpClave) {
        this.inpClave = inpClave;
    }

    public By getLnkLogo() {
        return lnkLogo;
    }

    public void setLnkLogo(By lnkLogo) {
        this.lnkLogo = lnkLogo;
    }

    public By getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(By btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public By getTxtMensajeValidacion() {
        return txtMensajeValidacion;
    }

    public void setTxtMensajeValidacion(By txtMensajeValidacion) {
        this.txtMensajeValidacion = txtMensajeValidacion;
    }
}

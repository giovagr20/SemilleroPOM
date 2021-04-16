package com.aadvantageshopping.pruebas.steps;

import com.aadvantageshopping.pruebas.pageobjects.RegistrarCompradorPageObject;
import com.aadvantageshopping.pruebas.utils.ConexionInternet;
import com.aadvantageshopping.pruebas.utils.IConexionInternet;
import com.aadvantageshopping.pruebas.utils.LeerFicheros;
import cucumber.api.PendingException;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class RegistrarCompradorStep {

    private RegistrarCompradorPageObject registrarCompradorPOM = new RegistrarCompradorPageObject();
    private LeerFicheros lectura = new LeerFicheros();

    @Step
    public void abrirPaginaWeb(){
        ConexionInternet conexionInternet = new ConexionInternet() ;
        conexionInternet.validarConexion();
        registrarCompradorPOM.getDriver().get("https://www.aadvantageeshopping.com/");
        registrarCompradorPOM.getDriver().manage().window().maximize();
    }

    @Step
    public void verificarIngresoPagina(){
        if(!registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getLnkLogo()).isDisplayed()) {
            throw new PendingException("No estamos dentro de la pagina web");
        }
    }

    @Step
    public void ingresarCodigoAadvantage() throws IOException {
        String codAadvantage = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 0, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpNumeroAadvantage())
                .sendKeys(codAadvantage);
    }

    @Step
    public void ingresarEmail() throws IOException {
        String email = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 1, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpEmail())
                .sendKeys(email);
    }

    @Step
    public void ingresarNombre() throws IOException {
        String nombre = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 2, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpNombre())
                .sendKeys(nombre);
    }

    @Step
    public void ingresarApellido() throws IOException {
        String apellido = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 3, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpApellidos())
                .sendKeys(apellido);
    }

    @Step
    public void ingresarCodigoPostal() throws IOException {
        String codigoPostal = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 4, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpCodigoPostal())
                .sendKeys(codigoPostal);
    }

    @Step
    public void ingresarClave() throws IOException{
        String clave = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 5, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpClave())
                .sendKeys(clave);
    }

    @Step
    public void clickRegistrar() {
        ExpectedConditions.elementToBeClickable(registrarCompradorPOM.getInpClave());
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpClave()).click();
        if(!registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getTxtMensajeValidacion()).isDisplayed()) {
            throw new PendingException("Error: No encontrado Mensaje");
        };

    }

    @Step
    public void validarRegistro() throws IOException {
        String mensajeEsperado = lectura.leerDatoExcelCaracter("Sheet1",
                "AadvanteShoppingData.xlsx", 6, 1);
        String mensajeArrojado = registrarCompradorPOM.getDriver()
                .findElement(registrarCompradorPOM.getTxtMensajeValidacion()).getText();
        Assert.assertThat(
                mensajeArrojado, Matchers.is(mensajeEsperado));
    }
}

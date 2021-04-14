package com.aadvantageshopping.pruebas.steps;

import com.aadvantageshopping.pruebas.pageobjects.RegistrarCompradorPageObject;
import com.aadvantageshopping.pruebas.utils.ConexionInternet;
import com.aadvantageshopping.pruebas.utils.IConexionInternet;
import com.aadvantageshopping.pruebas.utils.LeerFicheros;
import cucumber.api.PendingException;
import net.thucydides.core.annotations.Step;

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
        double codAadvantage = lectura.leerDatoExcel("Sheet1",
                "AadvanteShoppingData.xlsx", 0, 1);
        registrarCompradorPOM.getDriver().findElement(registrarCompradorPOM.getInpNumeroAadvantage())
                .sendKeys(String.valueOf(codAadvantage));
    }
}

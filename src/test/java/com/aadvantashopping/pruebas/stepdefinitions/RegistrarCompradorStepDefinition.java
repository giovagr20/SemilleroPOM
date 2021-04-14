package com.aadvantashopping.pruebas.stepdefinitions;

import com.aadvantageshopping.pruebas.steps.RegistrarCompradorStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistrarCompradorStepDefinition {

    @Steps
    private RegistrarCompradorStep registrarCompradorStep;

    @Dado("^el usuario ingresa a la pagina web$")
    public void elUsuarioIngresaALaPaginaWeb() {
        registrarCompradorStep.abrirPaginaWeb();
        registrarCompradorStep.verificarIngresoPagina();
    }

    @Cuando("^el usuario ingresa los datos de registro$")
    public void elUsuarioIngresaLosDatosDeRegistro() throws IOException {
        registrarCompradorStep.ingresarCodigoAadvantage();
    }

    @Entonces("^el usuario valida el registro exitoso$")
    public void elUsuarioValidaElRegistroExitoso() {
    }

}

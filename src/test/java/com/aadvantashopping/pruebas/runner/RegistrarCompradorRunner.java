package com.aadvantashopping.pruebas.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src\\test\\resources\\com.aadavtageshopping.pruebas\\features\\registrar_comprador.feature"},
        glue = "com.aadvantashopping.pruebas.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegistrarCompradorRunner {
}

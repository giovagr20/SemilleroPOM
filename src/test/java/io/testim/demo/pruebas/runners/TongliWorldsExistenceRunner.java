package io.testim.demo.pruebas.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = {"src/test/resources/io.testim.demo.pruebas/features/tongli_world_existence.feature"},
        glue = "io.testim.demo.pruebas",
        snippets = SnippetType.CAMELCASE)
public class TongliWorldsExistenceRunner {
    private TongliWorldsExistenceRunner(){}}
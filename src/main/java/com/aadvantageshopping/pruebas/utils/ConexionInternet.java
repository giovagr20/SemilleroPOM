package com.aadvantageshopping.pruebas.utils;

import cucumber.api.PendingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

public class ConexionInternet implements IConexionInternet {

    private static final Logger LOGGER = LogManager.getLogger(ConexionInternet.class.getName());
    private final String URL = "https://www.aadvantageeshopping.com/";

    @Override
    public void validarConexion() {
        try {
            java.net.URL urlConnection = new URL(URL);
            HttpsURLConnection huc = (HttpsURLConnection) urlConnection.openConnection();
            huc.connect();
        } catch (Exception e) {
            LOGGER.error("Por favor, valide su conexión a internet y vuelva a ejecutar");
            throw new PendingException("Por favor, valide su conexión a internet y vuelva a ejecutar");
        }
    }
}

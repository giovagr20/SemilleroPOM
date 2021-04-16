package com.aadvantageshopping.pruebas.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheros {

    private XSSFWorkbook workbook;
    private FileInputStream campo;

    public LeerFicheros() {
    }

    public LeerFicheros(XSSFWorkbook workbook, FileInputStream campo) {
        this.workbook = workbook;
        this.campo = campo;
    }

    public double leerDatoExcelNumerico(String hoja, String ruta, int valorColumna, int valorFila) throws IOException {
        double value = 0;
        campo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(valorFila);
        Cell cell = row.getCell(valorColumna);
        value = cell.getNumericCellValue();
        return value;
    }

    public String leerDatoExcelCaracter(String hoja, String ruta, int valorColumna, int valorFila) throws IOException {
        campo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(valorFila);
        Cell cell = row.getCell(valorColumna);
        String value = cell.getStringCellValue();
        return value;
    }


}

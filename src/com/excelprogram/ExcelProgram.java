package com.excelprogram;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/*This program is to create an arraylist of properties*/
public class ExcelProgram {
    public static void main(String[] args) {
        ArrayList<property> propertyArrayList = new ArrayList<>();
        propertyArrayList = getProperties(propertyArrayList); //Fill the array list with properties from the excel file.

    }

    public static ArrayList<property> getProperties(ArrayList<property> a) {
        JFileChooser openFileChooser = new JFileChooser();
        openFileChooser.setDialogTitle("Open File");
        openFileChooser.removeChoosableFileFilter(openFileChooser.getFileFilter());

        if (openFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File inputFile = openFileChooser.getSelectedFile();//get the file selected.
            try (FileInputStream in = new FileInputStream(inputFile))//Begin the imput stream
            {
                XSSFWorkbook importedFile = new XSSFWorkbook(in);//create your workbook and populate it with the contents of "in".
                XSSFSheet sheet1 = importedFile.getSheetAt(0);//create the sheet for the workbook and assign the sheet
                XSSFRow row;
                Iterator<Row> rowIterator = sheet1.iterator();
                String testVariable;
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();
                }
                in.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {

            }
            throw new RuntimeException(e);
        }
        return a;
    }
}






//                    while (cellIterator.hasNext()) {
//                        Cell cell = cellIterator.next();
//                        if (row.getRowNum() == 0) {
//                            header.add(cell.getStringCellValue());
//                        } else {
//                            if (cell.getColumnIndex() == 0) {
//                                parcelNumber.add(cell.getStringCellValue());
//                            } else if (cell.getColumnIndex() == 1) {
//                                ownerName.add(cell.getStringCellValue());
//                            } else if (cell.getColumnIndex() == 2) {
//                                ownerName2.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 3) {
//                                mailingAddress.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 4) {
//                                mailingAddress2.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 5) {
//                                cityStateZip.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 6) {
//                                siteAddress.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 7) {
//                                saleDate.add((Date) cell.getDateCellValue());
//                            }else if (cell.getColumnIndex() == 8) {
//                                salePrice.add((int)cell.getNumericCellValue());
//                            }else if (cell.getColumnIndex() == 9) {
//                                acres.add((Double) cell.getNumericCellValue());
//                            }else if (cell.getColumnIndex() == 10) {
//                                buffer.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 11) {
//                                bookPage.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 12) {
//                                parcelArea.add((int)cell.getNumericCellValue());
//                            }else if (cell.getColumnIndex() == 13) {
//                                exlu.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 14) {
//                                existingLandUse.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 15) {
//                                flu.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 16) {
//                                futureLandUse.add(cell.getStringCellValue());
//                            }else if (cell.getColumnIndex() == 17) {
//                                builtSpace.add((int)cell.getNumericCellValue());
//                            }
//                        }
//                    }

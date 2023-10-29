package designpattern.structural.facade;

import java.sql.Connection;

public class ExcelReportImpl implements IExcelReport{
    @Override
    public void generateExcelReport(Connection conn, String table) {
        System.out.println("Will be generating the EXCEL Report !!!");
    }
}

package designpattern.structural.facade;

import java.net.ConnectException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        String table_name= "demo_table";
        ReportFacade reportFacade = new ReportFacade();
        reportFacade.generateExcelReport(conn, table_name);
        reportFacade.generateHtmlReport(conn, table_name);
        reportFacade.generatePdfReport(conn, table_name);
    }
}

package designpattern.structural.facade;

import java.sql.Connection;

public class PdfReportImpl implements IPdfReport{
    @Override
    public void generatePdfReport(Connection conn, String table) {
        System.out.println("Will be generating the PDF report !!!");
    }
}

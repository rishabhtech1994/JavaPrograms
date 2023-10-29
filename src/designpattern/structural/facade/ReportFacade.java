package designpattern.structural.facade;

import java.net.ConnectException;
import java.sql.Connection;

public class ReportFacade {
    private IPdfReport pdfReport;
    private IHtmlReport htmlReport;
    private IExcelReport excelReport;

    public ReportFacade(){
        pdfReport = new PdfReportImpl();
        htmlReport = new HtmlReportImpl();
        excelReport = new ExcelReportImpl();
    }

    public void generatePdfReport(Connection conn, String file){
        pdfReport.generatePdfReport(conn, file);
    }

    public void generateHtmlReport(Connection conn, String file){
        htmlReport.generateHtmlReport(conn, file);
    }

    public void generateExcelReport(Connection conn, String file){
        excelReport.generateExcelReport(conn, file);
    }


}

package designpattern.structural.facade;

import java.sql.Connection;

public interface IPdfReport {
    public void generatePdfReport(Connection conn, String table);
}

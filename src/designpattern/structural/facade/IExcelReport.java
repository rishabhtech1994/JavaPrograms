package designpattern.structural.facade;

import java.sql.Connection;

public interface IExcelReport {
    public void generateExcelReport(Connection conn, String table);
}

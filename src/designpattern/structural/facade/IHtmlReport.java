package designpattern.structural.facade;

import java.sql.Connection;

public interface IHtmlReport {
    public void generateHtmlReport(Connection conn, String table);
}

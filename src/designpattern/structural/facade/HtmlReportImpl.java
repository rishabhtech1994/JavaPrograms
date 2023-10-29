package designpattern.structural.facade;

import java.sql.Connection;

public class HtmlReportImpl implements IHtmlReport{
    @Override
    public void generateHtmlReport(Connection conn, String table) {
        System.out.println("Will be generating the HTML report !!!");
    }
}

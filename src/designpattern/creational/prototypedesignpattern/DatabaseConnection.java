package designpattern.creational.prototypedesignpattern;

public class DatabaseConnection implements Cloneable{
    public String databasePort;
    public String fetchedData;

    public String getDatabasePort() {
        return databasePort;
    }

    public void setDatabasePort(String databasePort) {
        this.databasePort = databasePort;
    }

    public String getFetchedData() {
        return fetchedData;
    }

    public void setFetchedData(String fetchedData) {
        this.fetchedData = fetchedData;
    }

    public void fetchVeryLargeData() throws InterruptedException {
        this.fetchedData = "Fetching very very large data";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.databasePort+" : "+ this.fetchedData;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
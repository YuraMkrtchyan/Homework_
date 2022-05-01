package com.company.singleton;

public class Connection {
    private static Connection connection;
    private Connection(){}

    public static Connection getConnection() {
        if (connection == null){
            return new Connection();
        }
        return connection;
    }
}

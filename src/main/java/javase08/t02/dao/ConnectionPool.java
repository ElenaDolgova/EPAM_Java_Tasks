package javase08.t02.dao;

import java.sql.Connection;

public interface ConnectionPool extends AutoCloseable {
    Connection getConnection() throws InterruptedException;
}

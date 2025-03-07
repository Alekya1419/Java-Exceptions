package Exceptions;
import java.sql.*;

class GenerateSQLException {
    public static void main(String[] args) throws SQLException {
        throw new SQLException("Database connection error");
    }
}


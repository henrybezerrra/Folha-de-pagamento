
package pacoteprincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://18.231.2.118/folhadepagamento", "root", "nossocariri123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

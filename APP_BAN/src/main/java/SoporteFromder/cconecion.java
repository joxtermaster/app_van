package SoporteFromder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cconecion{
    private static String cadena;
    private static Connection constar = null;
    private static String usuario = "root";
    private static String contrase = "josue19";
    private static String bd = "vehiculo";
    private static String host = "localhost";
    private static String puerto = "3307";

    public static Connection establecer() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cadena = "jdbc:mysql://" + host + ":" + puerto + "/" + bd + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            constar = DriverManager.getConnection(cadena, usuario, contrase);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
        return constar;
    }
}

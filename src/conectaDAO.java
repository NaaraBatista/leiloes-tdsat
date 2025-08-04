import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    private final String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false";
    private final String user = "root";
    private final String password = "20092007";

    public Connection connectDB() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco: " + erro.getMessage());
            return null;
        }
    }
}
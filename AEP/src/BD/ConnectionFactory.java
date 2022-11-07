
package BD;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String username = "root";
    private static final String senha = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbaep?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    public static Connection criarConexaoMySQL() throws Exception{
        Connection conn = DriverManager.getConnection(url, username, senha);
        
        return conn;
    }
    
    public static void main(String[] args) throws Exception{
        Connection con = criarConexaoMySQL();
        if(con != null)
        {
            System.out.println("Conexão top mykinha");
        }
    }
}

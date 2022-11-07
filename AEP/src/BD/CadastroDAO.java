
package BD;

import aep.Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import aep.Classes.Endereco;
import aep.Classes.Documento;
import java.io.FileInputStream;

public class CadastroDAO {
    public void cadastrarUsuario(Usuario us) {
        String sql = "INSERT INTO usuario(cpf, nome, email, senha, telefone, dtNascimento, verificado)";
        sql += "VALUES (?,?,?,?,?,?,?)";
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        try{
            con = ConnectionFactory.criarConexaoMySQL();
            pstm = con.prepareStatement(sql);
            pstm.setString(1, us.getCpf());
            pstm.setString(2, us.getNomeUsuario());
            pstm.setString(3, us.getEmail());
            pstm.setString(4, us.getSenha());
            pstm.setString(5, us.getTelefone());
            pstm.setString(6, us.getDtNascimento());
            pstm.setBoolean(7, false);
            
            pstm.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro CadastroDAO salvar:" + e);
        }
        finally{
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro CadastroDAO encerrar conexoes:" + e);
            }
        }
    }
    
    public void cadastrarEndereco(Endereco en) {
        String sql = "INSERT INTO endereco(id_usuario, cep, rua, numero, bairro, complemento, cidade, estado)";
        sql += "VALUES (?,?,?,?,?,?,?,?)";
        
        Connection con = null;
        PreparedStatement pstm = null;
       

        try{
            con = ConnectionFactory.criarConexaoMySQL();
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2, en.getCep());
            pstm.setString(3, en.getRua());
            pstm.setString(4, en.getNumero());
            pstm.setString(5, en.getBairro());
            pstm.setString(6, en.getComplemento());
            pstm.setString(7, en.getCidade());
            pstm.setString(8, en.getEstado());
            
            pstm.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro CadastroDAO salvar:" + e);
        }
        finally{
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro CadastroDAO encerrar conexoes:" + e);
            }
        }
    }
    
     public void cadastrarDocumento(Documento doc) {
         String sql = "INSERT INTO documento(id_usuario, fotoDocFrente, fotoDocVerso, fotoCompResidencia)";
        sql += "VALUES (?,?,?,?)";
        
        Connection con = null;
        PreparedStatement pstm = null;
       

        try{
            con = ConnectionFactory.criarConexaoMySQL();
            pstm = con.prepareStatement(sql);
            
            FileInputStream docF = new FileInputStream(doc.getFotoDocFrente());           
            FileInputStream docV = new FileInputStream(doc.getFotoDocVerso());                 
            FileInputStream compR = new FileInputStream(doc.getFotoCompResidencia());
            
            pstm.setInt(1, 1);
            pstm.setBinaryStream(2, docF);
            pstm.setBinaryStream(3, docV);
            pstm.setBinaryStream(4, compR);
            
            pstm.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro CadastroDAO salvar:" + e);
        }
        finally{
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro CadastroDAO encerrar conexoes:" + e);
            }
        }
     }
    
    
}


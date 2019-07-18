/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Camisaa;
/**
 *
 * @author Clovis
 */
public class CamisaaDao {
    public static boolean inserir(Camisaa objeto) {
        String sql = "INSERT INTO camisaa (cor, tamanho) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getCor());
            ps.setString(2, objeto.getTamanho());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    public static void main(String[] args) {
        Camisaa objeto = new Camisaa();
        objeto.setCor("Azul");
        objeto.setTamanho("P");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}

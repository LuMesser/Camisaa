/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.CamisaaDao;
import javax.swing.JOptionPane;
import modelo.Camisaa;
import tela.manutencao.ManutencaoCamisaa;



/**
 *
 * @author Clovis
 */
public class ControladorCamisaa {

    public static void inserir(ManutencaoCamisaa man){
        Camisaa objeto = new Camisaa();
        objeto.setCor(man.jtfCor.getText());
        objeto.setTamanho(man.jtfTamanho.getText());
        
        boolean resultado = CamisaaDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    
}

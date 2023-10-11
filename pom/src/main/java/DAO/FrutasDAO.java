package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import DTO.FrutasDTO;

public class FrutasDAO {
	 Connection conn;
     
     PreparedStatement pstm;
     
     ResultSet rs ;
 public void cadastrarFrutas(FrutasDTO objfrutasDTO){
  
     String sql = "insert into frutas (nome,descricao,preco,quantidade) values(?,?,?,?)";
     
     conn = new ConnectionDAO().conectaBd();
     
     try {
         pstm = conn.prepareStatement(sql);
         pstm.setString(1, objfrutasDTO.getNome());
         pstm.setString(2, objfrutasDTO.getDescricao());
         pstm.setString(3, objfrutasDTO.getPreco());
         pstm.setString(4, objfrutasDTO.getQuantidade());
         
         pstm.execute();
         pstm.close();
         
         JOptionPane.showMessageDialog(null, "A Fruta Foi Cadastrada!");
     } catch (Exception erro) {
         JOptionPane.showMessageDialog(null, "Classe FrutasDAO" + erro);
     }
     
 }
 
 
 
 
 public void DeleteFrutas(String id){
	  
	 
     String sql = "delete from frutas where idFrutas =" + id + ";";
     
     conn = new ConnectionDAO().conectaBd();
     
     try {
         pstm = conn.prepareStatement(sql);
         pstm.execute();
         pstm.close();
         JOptionPane.showMessageDialog(null, "A fruta foi deletada!");
     } catch (Exception erro) {
         JOptionPane.showMessageDialog(null, "Classe FrutasDAO" + erro);
     }
     
 }
 
 
 
public void alterarFrutas(String id, FrutasDTO objfrutasDTO){
	  
	 
     String sql = "update frutas SET nome = ?, descricao = ?, preco = ?, quantidade = ? where idFrutas =" + id + ";";
     
     conn = new ConnectionDAO().conectaBd();
     
     try {
         pstm = conn.prepareStatement(sql);
         pstm.setString(1, objfrutasDTO.getNome());
         pstm.setString(2, objfrutasDTO.getDescricao());
         pstm.setString(3, objfrutasDTO.getPreco());
         pstm.setString(4, objfrutasDTO.getQuantidade());
         
         pstm.execute();
         pstm.close();
         JOptionPane.showMessageDialog(null, "A fruta foi alterada!");
     } catch (Exception erro) {
         JOptionPane.showMessageDialog(null, "Classe FrutasDAO" + erro);
     }
     
 }


    
}


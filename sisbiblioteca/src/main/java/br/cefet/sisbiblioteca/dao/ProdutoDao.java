package br.cefet.sisbiblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cefet.sisbiblioteca.model.Produto;

public class ProdutoDao {
		Connection con = null;
	
	public ProdutoDao() {
		con = ConnectionFactory.getConnection();
	}
	
	public void adicionar(Produto produto) throws SQLException {
		String sql = "insert into produto(nome,valor,idcategoria) values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, produto.getNome());
		stmt.setFloat(2, produto.getValor());
		stmt.setInt(3, produto.getCategoria().getId());
		stmt.execute();
		stmt.close();
		con.close();
	}
	
}

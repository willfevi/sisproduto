package br.cefet.sisbiblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cefet.sisbiblioteca.model.Categoria;

public class CategoriaDao {
	private Connection con;	
	
	// Primeiro: Pegar uma conexão
	public CategoriaDao() {
		con = ConnectionFactory.getConnection();
	}

	public void adicionar(Categoria cat) throws SQLException {
		String sql = "insert into categoria(nome) values (?)";
		//Segundo: Preparar a declaração de SQL
		PreparedStatement stmt = con.prepareStatement(sql);
		// Injetar o valor do nome no SQL
		stmt.setString(1, cat.getNome());
		stmt.execute();
		stmt.close();
		con.close();
		
	}
	
	public void apagar(int id) throws SQLException {
		String sql = "delete from categoria where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
		con.close();		
	}

	public void alterar(Categoria cat) throws SQLException {
		String sql = "update categoria set nome = ? where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, cat.getNome());
		stmt.setInt(2, cat.getId());
		stmt.execute();
		stmt.close();
		con.close();		
	}
	
	public Categoria buscarUm(int id) throws SQLException {
		String sql = "select id, nome from categoria where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		Categoria categoria = null;
		ResultSet rs = stmt.executeQuery();	
		if (rs.next()) {
			categoria = new Categoria();
			categoria.setId(rs.getInt("id"));
			categoria.setNome(rs.getString("nome"));
		}
		stmt.close();
		con.close();
		return categoria;
	}
	
	
	public List<Categoria> listarTodos() throws SQLException {
		String sql = "select id, nome from categoria";
		PreparedStatement stmt = con.prepareStatement(sql);
		Categoria categoria = null;
		List<Categoria> categorias = new ArrayList<Categoria>();
		ResultSet rs = stmt.executeQuery();	
		while (rs.next()) {
			categoria = new Categoria();
			categoria.setId(rs.getInt("id"));
			categoria.setNome(rs.getString("nome"));
			categorias.add(categoria);
		}
		stmt.close();
		con.close();
		return categorias;
	}
	
	}

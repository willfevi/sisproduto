package br.cefet.sisbiblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.cefet.sisbiblioteca.model.Usuario;

public class UsuarioDao {
	private Connection con;	
	
	public UsuarioDao() {
			con = ConnectionFactory.getConnection();
		}

		public void adicionar(Usuario usuario) throws SQLException {
			String sql = "insert into usuario (nome,email,cpf) "
					+ " values (?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getCpf());

			

			stmt.execute();
			stmt.close();
			con.close();
			
		}

}

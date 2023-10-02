package br.cefet.sisbiblioteca.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import br.cefet.sisbiblioteca.dao.CategoriaDao;
import br.cefet.sisbiblioteca.dao.ProdutoDao;
import br.cefet.sisbiblioteca.model.Categoria;
import br.cefet.sisbiblioteca.model.Produto;

/**
 * Servlet implementation class ProdutoAdd
 */
public class ProdutoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Extraindo os valores
		String nome = request.getParameter("nome");
		float valor = Float.valueOf(request.getParameter("valor"));
		int idCategoria = Integer.valueOf(request.getParameter("idCategoria"));
		
		//Buscando a categoria
		CategoriaDao catDao = new CategoriaDao();
		Categoria categoria = null;
		try {
			categoria = catDao.buscarUm(idCategoria);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Instanciando o produto
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setValor(valor);
		produto.setCategoria(categoria);

		//Persistindo o produto
		ProdutoDao pDao = new ProdutoDao();
		try {
			pDao.adicionar(produto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

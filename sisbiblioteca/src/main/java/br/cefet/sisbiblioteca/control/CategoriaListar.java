package br.cefet.sisbiblioteca.control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.cefet.sisbiblioteca.dao.CategoriaDao;
import br.cefet.sisbiblioteca.model.Categoria;

/**
 * Servlet implementation class CategoriaListar
 */
public class CategoriaListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoriaListar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String next = request.getParameter("next");
		String msg;
		CategoriaDao catDao = new CategoriaDao();
		List<Categoria> categorias = null;
		try {
			categorias = catDao.listarTodos();
		} catch (SQLException e) {
			next = "msg.jsp";
			msg = "Erro inesperado ao listar as cats.";
			request.setAttribute("msg", msg);
		}
		request.setAttribute("categorias", categorias);
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

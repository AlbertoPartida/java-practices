package es.curso.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorVideojuegos;

/**
 * Servlet implementation class VideojuegosControlador
 */
@WebServlet("/VideojuegosControlador")
public class VideojuegosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideojuegosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorVideojuegos gv = new GestorVideojuegos();
		
		String idVideojuego = request.getParameter("id");
		
		Videojuego juego = gv.buscar(idVideojuego);

		if(juego != null) {
			request.setAttribute("errorVideojuego", null);
			request.setAttribute("juego", juego);
			request.getRequestDispatcher("videojuegoDetalle.jsp").forward(request, response);	
			
		}else {
			request.setAttribute("errorVideojuego", "El id del videojuego no existe.");
			request.getRequestDispatcher("listaVideojuegos.jsp").forward(request, response);	
	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

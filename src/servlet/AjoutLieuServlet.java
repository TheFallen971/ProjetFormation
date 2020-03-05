package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDao;
import dao.IFormationDao;
import dao.ILieuDao;
import dao.LieuDao;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

/**
 * Servlet implementation class AjoutLieuServlet
 */
@WebServlet("/ajoutlieu")
public class AjoutLieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutLieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/enregistrementLieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lieu l1 = new Lieu();
		l1.setIdLieu(Integer.parseInt(request.getParameter("idLieu")));
		ILieuDao dao= new LieuDao();
		dao.createLieu(l1);
		
		this.getServletContext().getRequestDispatcher("/listes").forward(request, response);
	}

}

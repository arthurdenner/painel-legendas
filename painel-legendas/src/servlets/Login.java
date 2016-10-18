package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsuarioDAO;
import model.Usuario;

@WebServlet(name = "login", urlPatterns = "/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		
		System.out.println(nick);
		 
		 UsuarioDAO dao = new UsuarioDAO();
		 
		 try {
			 System.out.println(dao.isExistePesquisa("nick", nick));
			 if(dao.isExistePesquisa("nick", nick)) {
				 dao.logar(nick, password, session);
				 RequestDispatcher rs = request.getRequestDispatcher("/Pages/main.jsp");
				 rs.forward(request, response);
			 } else {
				 RequestDispatcher rs = request.getRequestDispatcher("/Pages/error.jsp");
				 rs.forward(request, response);
			 }
		 } catch (Exception e) {}
	        
        /*RequestDispatcher rs = request.getRequestDispatcher("/Pages/main.jsp");
        rs.forward(request, response);*/
	}
}

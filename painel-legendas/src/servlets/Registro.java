package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

@WebServlet(name = "register", urlPatterns = "/register")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		 
		 String nick = request.getParameter("nick");
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 
		 UsuarioDAO dao = new UsuarioDAO();
		 
		 try {
			 if(!dao.isExistePesquisa("nick", nick)) {
				 Usuario novoUsuario = new Usuario();
				 novoUsuario.setNick(nick);
				 novoUsuario.setEmail(email);
				 novoUsuario.setSenha(password);
				 
				 dao.insert(novoUsuario);
				 
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

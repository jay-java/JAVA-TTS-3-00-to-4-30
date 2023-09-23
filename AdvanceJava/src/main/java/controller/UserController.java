package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/MyController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			User u =new User();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			System.out.println(u);
			boolean flag = UserDao.checkEmail(email);
			System.out.println(flag);
			if(flag == true) {
				request.setAttribute("msg", "email already exist");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			else {
				UserDao.insertUser(u);
				response.sendRedirect("login.jsp");
			}
		}
		else if(action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			boolean flag = UserDao.checkEmail(email);
			if(flag == true) {
				User u = UserDao.userLogin(email, pass);
				HttpSession session = request.getSession();
				session.setAttribute("data", u);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "account is not registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		
		
	}

}

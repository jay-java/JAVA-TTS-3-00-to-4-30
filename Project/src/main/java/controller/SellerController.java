package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SellerDao;
import model.Seller;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SellerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Seller s = new Seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			System.out.println(s);
			SellerDao.insertSeller(s);
			request.setAttribute("msg", "Account created Successfully");
			request.getRequestDispatcher("seller-login.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			boolean flag = SellerDao.checkEmail(email);
			System.out.println(flag);
			if (flag == true) {
				Seller u = SellerDao.userLogin(email, pass);
				System.out.println(u);
				if (u != null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", u);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("seller-login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "account is not registered");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			Seller s = new Seller();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			System.out.println(s);
			SellerDao.updateSellerProfile(s);
			HttpSession session = request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("change password")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = SellerDao.checkOldPassword(id, op);
			System.out.println(flag);
			if(flag == true) {
				if(np.equals(cnp)) {
					SellerDao.updatePassword(id, np);
					response.sendRedirect("seller-home.jsp");
				}
				else {
					request.setAttribute("msg", "New password and confirm new password not matched");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("opm", "old password incorrect");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("getotp")) {
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if(flag == true) {
				
			}
			else {
				request.setAttribute("msg", "email not registered");
				request.getRequestDispatcher("seller-forgot-password.jsp").forward(request, response);
			}
		}
	}

}

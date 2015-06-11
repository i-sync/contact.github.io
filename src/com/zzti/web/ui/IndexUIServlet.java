package com.zzti.web.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.zzti.bean.Contact;
import com.zzti.bean.TResult;
import com.zzti.common.HttpBaseServlet;

/**
 * Servlet implementation class IndexUIServlet
 */
@WebServlet("/IndexUIServlet")
public class IndexUIServlet extends HttpBaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexUIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doDeal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Object obj = request.getSession().getAttribute("id");
		int id = Integer.parseInt(obj.toString());
		Contact user = new Contact();
		user.setId(id);
		TResult<Contact> result  = new com.zzti.business.ContactBusiness().getModel(user);
		request.setAttribute("user", result.getT());
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}
}

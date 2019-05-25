package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.regrasdenegocio.Regra;

@SuppressWarnings("serial")
@WebServlet("/mvc")
public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramview = req.getParameter("regra");
		String nomeDaAction = "mvc.regrasdenegocio." +paramview;
		
		try {
			Class<?> classe = Class.forName(nomeDaAction);
			Regra logica = (Regra) classe.newInstance();
			String page = logica.execute(req,resp);
			req.getRequestDispatcher(page).forward(req, resp);	
					
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}
		
		//super.service(req, resp);
	}
}

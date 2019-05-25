package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/rnservletadiciona2")
public class RNServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter out = resp.getWriter();
		
		String action = req.getParameter("regra");
		ClienteDao dao = new ClienteDao();

		if(action.equals("InsertCliente")) {
			//implementação da regra de negocio para inserir cliente
			Cliente cliente = new Cliente();
			
			cliente.setNome(req.getParameter("nome"));
			cliente.setEndereco(req.getParameter("endereco"));
			cliente.setEmail(req.getParameter("email"));
			
			dao.inserir(cliente);

			RequestDispatcher rd = req.getRequestDispatcher("insertclienteok.jsp");
			rd.forward(req, resp);
			
		} else if (action.equals("GetCliente")) {
			//implementação da para listagem de clientes
			
		} else if (action.equals("DeleteCliente")) {
			//implementação para excluir um cliente
			
		}
		
		//codigo fazendo extract class
//		if(action.equals("InsertCliente")) {
//			new InsertCliente().execute(req, resp);
//		} else if (action.equals("GetClientes")) {
//		new GetClientes().execute(req, resp);	
//		} else if (action.equals("DeleteCliente")) {
//		new DeleteCliente().execute(req, resp);		
//		}

	}
}
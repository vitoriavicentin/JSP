import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcSer
 */
@WebServlet("/CalcSer")
public class CalcSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int num1, num2;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try (PrintWriter out = response.getWriter()){
			String btnSubmit = request.getParameter("btnsubmit");
			switch (btnSubmit) {
				case "+":
					num1 = Integer.parseInt(request.getParameter("txtnum1"));
					response.sendRedirect("index.jsp?q1="+num1);
					break;
				case "=":
					int num3 = num1+Integer.parseInt(request.getParameter("txtnum1"));
					response.sendRedirect("index.jsp?q="+num3);
					break;
				default:
					if(request.getParameter("txtnum1")!=null)
						response.sendRedirect("index.jsp?q="+(request.getParameter("txtnum1")+btnSubmit));
					else
						response.sendRedirect("index.jsp?q="+btnSubmit);
					break;
			}
		}
	}

}
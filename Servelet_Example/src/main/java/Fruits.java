
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Fruits
 */
public class Fruits extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter(); // Generate variables and write a HTML page
		response.setContentType("text/html");
		String[] values = request.getParameterValues("fruits");// Get all fruits for html page
		printWriter.println("Fruits selected");

		for (int i = 0; i < values.length; i++) {
			printWriter.print("<li>" + values[i] + "</li>");
		}

		printWriter.close();// Always close the writer and connection

	}

}

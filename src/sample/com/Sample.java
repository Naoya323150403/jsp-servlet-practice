package sample.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample
 */
@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String survey = request.getParameter("survey");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=tuf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=utf-8>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>結果</h1>");
		out.println("<p>送信しました</p>");
		out.println("<p><a href='Sample.html'>戻る</a></p>");
		out.println("</body>");
		out.println("</html>");

	}

}

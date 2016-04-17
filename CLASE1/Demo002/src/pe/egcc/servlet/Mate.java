package pe.egcc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/Sumar","/Restar","/Multiplicar"})
public class Mate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String path =request.getServletPath();
	if(path.equals("/Sumar")){
		sumar(request,response);
	}

	if(path.equals("/Restar")){
		restar(request,response);
	}

	if(path.equals("/Multiplicar")){
		multiplicar(request,response);
	}
	}
	protected void sumar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Datos
		int num1=Integer.parseInt(request.getParameter("n1"));
		int num2=Integer.parseInt(request.getParameter("n2"));
		//proceso
		int suma=num1+num2;
		
		//reporte
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>SUMAR</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>SUMAR</h1>");
		out.println("<p>N�mero 1:"+num1+"</p>");
		out.println("<p>N�mero 2:"+num2+"</p>");
		out.println("<p>Suma:"+suma+"</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
protected void restar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Datos
		int num1=Integer.parseInt(request.getParameter("n1"));
		int num2=Integer.parseInt(request.getParameter("n2"));
		//proceso
		int resta=num1-num2;
		
		//reporte
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>RESTAR</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>RESTAR</h1>");
		out.println("<p>N�mero 1:"+num1+"</p>");
		out.println("<p>N�mero 2:"+num2+"</p>");
		out.println("<p>Resta:"+resta+"</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
protected void multiplicar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// Datos
	int num1=Integer.parseInt(request.getParameter("n1"));
	int num2=Integer.parseInt(request.getParameter("n2"));
	//proceso
	int Producto=num1*num2;
	
	//reporte
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title>MULTIPLICAR</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>MULTIPLICAR</h1>");
	out.println("<p>N�mero 1:"+num1+"</p>");
	out.println("<p>N�mero 2:"+num2+"</p>");
	out.println("<p>Producto:"+Producto+"</p>");
	out.println("</body>");
	out.println("</html>");
	
	
}


}

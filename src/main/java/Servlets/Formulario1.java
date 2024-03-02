package Servlets;

import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Formulario1
 */
public class Formulario1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Date date = new Date();
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		char letra = apellido.charAt(0);
		
		Random r = new Random();
		
		String[] frases = {"el rocio de la manana", "el cantar de los pajaros", "el calor de un abrazo", 
				"el olor a jazmin", "la paz de las olas del mar"};
		
		int e = r.nextInt(frases.length);
		
		Random r2 = new Random();
		
		String[] frases2 = {"perseverante", "empatico", "espiritual", "amable", "energetico"};
		
		int e2 = r2.nextInt(frases2.length);
		
		out.println("<HTML><HEAD><TITLE>Primer formulario</TITLE></HEAD>");
		out.println("<BODY BGCOLOR=\"#000000\">");
		out.println("<H1 style=\" text-align:center; color:#FFFFFF\">TEST DE PERSONALIDAD</H1><P>");
		out.println("<BR>");
		out.println("<BR>");
		
		out.println("<p style=\"color:#FFFFFF\">La fecha y la hora actual es: " + date + "</p><br>");
		out.println("<p style=\"color:#FFFFFF\">" + nombre + " hoy la luna esta  alineada con los astros eso es buena senal" + "</p> <BR>");
		out.println("<p style=\"color:#FFFFFF\">Ademas te apellidas "  + apellido + ",es perfecto. La letra " +letra+ " simboliza " + frases[e] +". Por lo que eres " + frases2[e2] + ". </p> <BR>");
		out.println("<p style=\"color:#FFFFFF\">Ahora que las estrellas del horizonte estan alineadas, podemos comenzar. Respira hondo e imagina un lugar magico.</p> <BR><BR>");
		out.println("<p style=\"color:#FFFFFF\"> Piensa en la risa de un armario y elige un color: </p>");
		out.println("<form NAME=\"Formulario2\" METHOD=\"POST\" ACTION=\"Formulario2\">");
		out.println("<select name=\"color\">");
		out.println("<option value=\"azul\">AZUL</option>");
		out.println("<option value=\"rojo\">ROJO</option>");
		out.println("<option value=\"verde\">VERDE</option>");
		out.println("</select></br>"
				+ "<INPUT style=\"align:center; margin-left:48%\" type=\"SUBMIT\" VALUE=\"Continuar\"></form>");
		out.println("</BODY></HTML>");
		out.close();
		
	}

}

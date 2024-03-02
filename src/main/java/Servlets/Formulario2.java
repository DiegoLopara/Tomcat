package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Servlet implementation class Formulario2
 */
public class Formulario2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario2() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String color = request.getParameter("color");
		
		Random r = new Random();

	    String[] frases = {"el rocio de la manana","el cantar de los pajaros","el calor de una abrazo","el olor a jazmin","la paz de las olas del mar"};

	    int e = r.nextInt(frases.length);
	    
	    Random r2 = new Random();

	    String[] frases2 = {"perseverante","empatico","espiritual","amable","energetico"};

	    int e2 = r2.nextInt(frases.length);
	    
	    Random r3 = new Random();
	    
	    String[] frases3 = {"Mercurio", "Venus", "Marte", "Jupiter", "Saturno"};
	    
	    int e3 = r3.nextInt(frases3.length);
	    
	    Random r4 = new Random();
	    
	    String[] frases4 = {"Sirius", "Canaria", "Canis minor", "Canis major", "Canopus"};
	    
	    int e4 = r4.nextInt(frases4.length);
	    
	    out.println("<HTML><HEAD><TITLE>Segundo formulario</TITLE></HEAD>");
	    
		out.println("<BODY BGCOLOR=\"#000000\">");
		
		
		out.println("<H1 style=\" text-align:center; color:#FFFFFF\">TEST DE PERSONALIDAD </H1><P>");
		out.println("<BR>");
		out.println("<p style=\"color:#FFFFFF\">Vaya el color "+ color + ", es perfecto. Simboliza " + frases[e] + ". Por lo que eres "+ frases2[e2]+ ".</p><br>");
		out.println("<p style=\"color:#FFFFFF\">Aprovechando que "+ frases3[e3]+ " pasa por " + frases4[e4] + ", vamos con la siguiente pregunta.");
		out.println("<p style=\"color:#FFFFFF\">Visualiza el color de las manzanas asadas en invierno.<p></br>");
		out.println("<p style=\"color:#FFFFFF\">Ahora elige una de las siguientes flores.<p></br>");
		out.println("<form NAME=\"Formulario3\" METHOD=\"POST\" ACTION=\"Formulario3\">");
		out.println("<input type=\"radio\"  name=\"flor\" value=\"flor que no conozco\" checked>");
		out.println("<img src=\"img/flor1.jpg\">");
		out.println("<input type=\"radio\" name=\"flor\" value=\"margarita\">");
		out.println("<img src=\"img/flor2.jpg\">");
		out.println("<input type=\"radio\" name=\"flor\" value=\"flor del paraiso\">");
		out.println("<img style=\"width:300px; height: 300px\" src=\"img/flor3.jpg\"></br>");
		out.println("<INPUT style=\"align:center; margin-left:48%\" type=\"SUBMIT\" VALUE=\"Continuar\"></form>");
		out.println("</BODY></HTML>");
		out.close();
	}

}

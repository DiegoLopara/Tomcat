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
 * Servlet implementation class Formulario3
 */
public class Formulario3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario3() {
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
		String flor = request.getParameter("flor");
		 String color = request.getParameter("color");
		 
		Random r = new Random();

	    String[] frases = {"el rocio de la manana","el cantar de los pajaros","el calor de una abrazo","el olor a jazmin","la paz de las olas del mar"};

	    int e = r.nextInt(frases.length);
	    
	    Random r2 = new Random();

	    String[] frases2 = {"perseverante","empatico","espiritual","amable","energetico"};

	    int e2 = r2.nextInt(frases.length);
	    
	    Random r3 = new Random();

	    String[] frases3 = {"Mercurio","Venus","Marte","Jupiter","Saturno"};

	    int e3 = r3.nextInt(frases.length);
	    
	    Random r4 = new Random();

	    String[] frases4 = {"Sirius","Carina","Canis minor","Canis major","Canopus"};

	    int e4 = r4.nextInt(frases.length);
		
		out.println("<HTML><HEAD><TITLE>Segundo formulario</TITLE></HEAD>");
		out.println("<BODY BGCOLOR=\"#000000\">");
		
		
		out.println("<H1 style=\" text-align:center; color:#FFFFFF\">TEST DE PERSONALIDAD </H1><P>");
		out.println("<BR>");
		out.println("<p style=\"color:#FFFFFF\">!Que maravilla! La " + flor + ", es perfecto. Simboliza " + frases[e] + ". Por lo que eres " + frases2[e2] + ".</p><br>");
		out.println("<p style=\"color:#FFFFFF\">Mas aun, teniendo en cuenta que hace un minuto "+ frases3[e3] +" pasa por " + frases4[e4] + ".</p><br>");
		out.println("<p style=\"color:#FFFFFF\">Ahora, date un momento y respira profundamente sintiendo la energ a del universo por todos tus poros. Ya puedes pulsar finalizar para volver al inicio.</p><br>");

		out.println("<INPUT style=\"align:center; margin-left:48%\" type=\"SUBMIT\" VALUE=\"Finalizar\">");
				
		out.println("</BODY></HTML>");
		out.close();

	}

}

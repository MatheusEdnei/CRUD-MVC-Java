package br.com.coren_ba.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("Executando a logica...");
		
		System.out.println("Retornando o nome da p�gina JSP...");
		return "/WEB-INF/jsp/primeira-logica.jsp";
	}
	
}

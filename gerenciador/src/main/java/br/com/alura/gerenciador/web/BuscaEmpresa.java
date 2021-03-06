package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.*;

public class BuscaEmpresa implements Tarefa{
	

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		EmpresaDAO dao = new EmpresaDAO();
		String filtro = request.getParameter("filtro");
		Collection<Empresa> empresas = dao.buscaPorSimilaridade(filtro);
		
		request.setAttribute("empresas", empresas);
		
		return "/WEB-INF/Paginas/buscaEmpresa.jsp";
		
	}
}

package br.com.ifood;

import br.com.ifood.dao.RestauranteDAO;
import br.com.ifood.entities.Restaurante;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "RestauranteServlet", value = "/RestauranteServlet")
public class RestauranteServlet extends HttpServlet {

    RestauranteDAO restauranteDAO = new RestauranteDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        restauranteDAO.getAll();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Restaurante restaurante = new Restaurante();

        restaurante.setCNPJ(request.getParameter("cnpj"));
        restaurante.setRazaoSocial(request.getParameter("razaoSocial"));
        restaurante.setNomeRestaurante(request.getParameter("nomeRestaurante"));
        restaurante.setTelefone(request.getParameter("telefoneRestaurante"));
        restaurante.setNomeEspecialidade(request.getParameter("especialidade"));
        restaurante.setEmail(request.getParameter("email"));
        restaurante.setCelular(request.getParameter("celular"));
        restaurante.setNomeCompleto(request.getParameter("nomeCompleto"));
        restaurante.setCPF(request.getParameter("CPF"));
        restaurante.setRG(request.getParameter("RG"));

        restauranteDAO.insert(restaurante);
    }

    public void destroy() {

    }

}

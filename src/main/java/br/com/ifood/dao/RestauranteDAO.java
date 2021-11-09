package br.com.ifood.dao;

import br.com.ifood.entities.Restaurante;
import br.com.ifood.infra.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {

    public List<Restaurante> getAll() {
        List<Restaurante> restaurantes = new ArrayList<Restaurante>();

        String sql = "SELECT * FROM TB_RESTAURANTE";

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int restauranteID = rs.getInt("CD_RESTAURANTE");
                String CNPJ = rs.getString("NR_CNPJ");
                String razaoSocial = rs.getString("NM_RAZAO_SOCIAL");
                String nomeRestaurante = rs.getString("NM_RESTAURANTE");
                String telefone = rs.getString("NR_TELEFONE");
                String especialidade = rs.getString("NM_ESPECIALIDADE");
                String email = rs.getString("DS_EMAIL");
                String celular = rs.getString("NR_CELULAR");
                String nm_completo = rs.getString("NM_COMPLETO");
                String cpf = rs.getString("NR_CPF");
                String rg = rs.getString("NR_RG");
                Restaurante restaurante = new Restaurante(restauranteID, CNPJ, razaoSocial, nomeRestaurante, telefone, especialidade, email, celular, nm_completo, cpf, rg);
                System.out.println(restaurante.toString());
                restaurantes.add(restaurante);
            }

            return restaurantes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void insert(Restaurante restaurante) {
        String sql = "INSERT INTO TB_RESTAURANTE(NR_CNPJ, NM_RAZAO_SOCIAL, NM_RESTAURANTE, NR_TELEFONE, NM_ESPECIALIDADE, " +
                "DS_EMAIL, NR_CELULAR, NM_COMPLETO, NR_CPF, NR_RG) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,? ,?)";

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, restaurante.getCNPJ());
            statement.setString(2, restaurante.getRazaoSocial());
            statement.setString(3, restaurante.getNomeRestaurante());
            statement.setString(4, restaurante.getTelefone());
            statement.setString(5, restaurante.getNomeEspecialidade());
            statement.setString(6, restaurante.getEmail());
            statement.setString(7, restaurante.getCelular());
            statement.setString(8, restaurante.getNomeCompleto());
            statement.setString(9, restaurante.getCPF());
            statement.setString(10, restaurante.getRG());

            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

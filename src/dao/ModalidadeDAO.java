package dao;

import connections.JDBCConnection;
import domain.Modalidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModalidadeDAO implements DAO<Modalidade> {


    @Override
    public void salvar(Modalidade domain) {
        try {
            //modo seguro para evitar SQL INJECTION

            Connection conexao = JDBCConnection.getConnection();
            String sql = "INSERT INTO modalidade(nome) VALUES (?);";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, domain.getNome());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void atualizar(Modalidade domain) {
        try {
            Connection conexao = JDBCConnection.getConnection();
            String sql = "UPDATE modalidade SET nome = ? WHERE id_modalidade = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, domain.getNome());
            ps.setInt(2, domain.getIdModalidade());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deletar(Modalidade domain) {
        try {
            Connection conexao = JDBCConnection.getConnection();
            String sql = "DELETE FROM modalidade WHERE id_modalidade = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, domain.getIdModalidade());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Modalidade> listarTodos() {
        List<Modalidade> modalidades = new ArrayList<>();
        try {
            Connection conexao = JDBCConnection.getConnection();
            String sql = "SELECT * FROM modalidade";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Modalidade modalidade = new Modalidade();
                modalidade.setIdModalidade(resultSet.getInt("id_modalidade"));
                modalidade.setNome(resultSet.getString("nome"));
                modalidades.add(modalidade);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            return modalidades;
    }
}

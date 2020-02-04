package dao;

import connections.JDBCConnection;
import domain.Passeios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PasseiosDAO implements DAO<Passeios> {


    @Override
    public void salvar(Passeios domain) {
        try{
            Connection conexao = JDBCConnection.getConnection();
            String sql = "INSERT INTO tipo_passeio(nome_passeio, descricao_passeio) VALUES (?, ?);";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, domain.getNomePasseio());
            ps.setString(2, domain.getDescricaoPasseio());
            ps.execute();
        } catch(SQLException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void atualizar(Passeios domain) {
        try {
            Connection conexao = JDBCConnection.getConnection();
            String sql = "UPDATE tipo_passeio SET nome_passeio = ?,  descricao_passeio = ?,  WHERE id_tipo_passeio = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,domain.getNomePasseio());
            ps.setString(2,domain.getDescricaoPasseio());
            ps.setInt(3,domain.getIdPasseio());
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deletar(Passeios domain) {

    }

    @Override
    public List<Passeios> listarTodos() {
        return null;
    }
}

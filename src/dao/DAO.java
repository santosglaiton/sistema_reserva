package dao;

import java.util.List;

public interface DAO <T> {

    public void salvar(T domain);
    public void atualizar(T domain);
    public void deletar(T domain);
    public List<T> listarTodos();




}

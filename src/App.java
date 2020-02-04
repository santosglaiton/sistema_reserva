import connections.JDBCConnection;
import dao.ModalidadeDAO;
import dao.PasseiosDAO;
import domain.Modalidade;
import domain.Passeios;

public class App {
    public static void main(String[] args) {
        System.out.println(JDBCConnection.getConnection());

        //Passeios passeios = new Passeios();
        //passeios.setNomePasseio("Dupla");
        //passeios.setDescricaoPasseio("Duas pessoas acompanhadas.");
        //new PasseiosDAO().salvar(passeios);

        Passeios passeios = new Passeios();
        passeios.setNomePasseio("Trio");
        passeios.setDescricaoPasseio("Passeios com 3 pessoas");
        passeios.setIdPasseio(4);
        new PasseiosDAO().atualizar(passeios);

        //Modalidade modalidade = new Modalidade();
        //modalidade.setNome("Caminhada tirando fotos");
        //new ModalidadeDAO().salvar(modalidade);

        //modalidade.setNome("Pescaria");
        //modalidade.setIdModalidade(8);
        //new ModalidadeDAO().atualizar(modalidade);

        //modalidade.setIdModalidade(8);
        //new ModalidadeDAO().deletar(modalidade);
       // for (Modalidade modalidade : new ModalidadeDAO().listarTodos()) {
           // System.out.println( modalidade.getNome() + "/" + modalidade.getIdModalidade());

        }
    }

package domain;

public class Passeios {

    private Integer idTipoPasseio;
    private String nomePasseio;
    private String descricaoPasseio;

    public Integer getIdPasseio() {
        return idTipoPasseio;
    }

    public void setIdPasseio(Integer idPasseio) {
        this.idTipoPasseio = idPasseio;
    }

    public String getNomePasseio() {
        return nomePasseio;
    }

    public void setNomePasseio(String nomePasseio) {
        this.nomePasseio = nomePasseio;
    }

    public String getDescricaoPasseio() {
        return descricaoPasseio;
    }

    public void setDescricaoPasseio(String descricaoPasseio) {
        this.descricaoPasseio = descricaoPasseio;
    }
}

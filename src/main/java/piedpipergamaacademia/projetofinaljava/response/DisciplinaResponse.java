package piedpipergamaacademia.projetofinaljava.response;

public class DisciplinaResponse {

    //TODO definir quais dados vão ser retornado na resposta

    private String id;
    private String nome;
    private String conceito;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConceito() {
        return conceito;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }
}

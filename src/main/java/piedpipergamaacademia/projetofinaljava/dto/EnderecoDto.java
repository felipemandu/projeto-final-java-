package piedpipergamaacademia.projetofinaljava.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EnderecoDto {

	@NotEmpty
	@Min(5)
    private String rua;
	
	@NotEmpty
    private String numero;

	@NotEmpty
	@Min(3)
    private String cidade;

    private String complemento;

    @Pattern(regexp = "[A-Z]{2}")
    private String uf;

    @Pattern(regexp = "[0-9]{5}-[0-9]{3}")
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

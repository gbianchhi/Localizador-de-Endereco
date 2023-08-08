import com.google.gson.annotations.SerializedName;

public class Endereco {

    @SerializedName("cep")
    private String CEP;
    @SerializedName("logradouro")
    private String rua;
    @SerializedName("localidade")
    private String cidade;
    @SerializedName("uf")
    private String estado;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco: \nCEP= " + CEP + "\nrua= " + rua + "\ncidade= " + cidade + "\nestado= " + estado;
    }

}

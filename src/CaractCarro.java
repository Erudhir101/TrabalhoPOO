public class CaractCarro {

    private String modelo;
    private String cor;
    private String ano;
    private String descricao;
    private float valor;

    public CaractCarro(String modelo, String cor, String ano, String descricao, float valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}

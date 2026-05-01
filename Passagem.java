package passagemarea;

public abstract class Passagem {
    private String codigo ;
    private double precoBase;
    private String origem;
    private String destino;

    public Passagem(String codigo , double precoBase , String origem , String destino) {
        this.codigo = codigo;
        this.precoBase = precoBase;
        this.origem = origem;
        this.destino = destino;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0){
            this.precoBase = 0 ;
        } else {
            this.precoBase = precoBase;
        }
        this.precoBase = precoBase;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public abstract double calcularPrecoFinal();



}

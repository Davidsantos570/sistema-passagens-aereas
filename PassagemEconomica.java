package passagemarea;

public class PassagemEconomica extends Passagem {

    public PassagemEconomica(String codigo, double precoBase, String origem, String destino) {
        super(codigo, precoBase, origem, destino);
    }
    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (getPrecoBase() * 0.10);
    }



}



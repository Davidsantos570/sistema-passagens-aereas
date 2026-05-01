package passagemarea;

public class PassagemExecutiva extends Passagem {

    private boolean servicoBordadoEspecial;

    public PassagemExecutiva(String codigo, double precoBase, String origem, String destino, boolean servicoBordoEspecial) {
        super(codigo, precoBase, origem, destino);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (getPrecoBase() * 0.25);
    }
}

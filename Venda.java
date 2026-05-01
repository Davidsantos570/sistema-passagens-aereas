package passagemarea;

public class Venda {

    private Cliente cliente;
    private Passagem passagem;

    public Venda(Cliente cliente, Passagem passagem) {
        this.cliente = cliente;
        this.passagem = passagem;
    }

    public void finalizarVenda() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Passagem: " + passagem.getCodigo());
        System.out.println("Preço final: " + passagem.calcularPrecoFinal());
    }
}



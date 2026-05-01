package passagemarea;

public class Main {
    public static void main(String[] args) {

        Passagem p1 = new PassagemEconomica("001", 1000, "SP", "RJ");
        Passagem p2 = new PassagemExecutiva("002", 1000, "SP", "RJ", true);

        Cliente cliente = new Cliente("David", "123456789");

        Venda v1 = new Venda(cliente, p1);
        Venda v2 = new Venda(cliente, p2);

        v1.finalizarVenda();
        System.out.println("--------");
        v2.finalizarVenda();
    }
}







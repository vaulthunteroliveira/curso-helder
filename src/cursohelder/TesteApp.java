package cursohelder;

public class TesteApp {

    public static void main(String[] args) {
        
        
        
        Cliente cli1 = new Cliente(1, "Maria", null);
        Cliente cli2 = new Cliente(2, "João", null);
        Cliente cli3 = new Cliente(3, "José", null);
        
        ColecaoImpl colecao = new ColecaoImpl();
        
        colecao.addCliente(cli1);
        colecao.addCliente(cli2);
        colecao.addCliente(cli3);
        
        colecao.exibirClientes();
        
        colecao.removerCliente(1);
        
        colecao.exibirClientes();

    }

}

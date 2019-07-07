package cursohelder;

import java.util.ArrayList;
import java.util.Iterator;

public class ColecaoImpl implements Colecao {

    private ArrayList<Cliente> clientes = null;

    public ColecaoImpl() {
        clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cli) {
        clientes.add(cli);
    }

    @Override
    public void removerCliente(int id) {
        
        for(Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();){
            Cliente cli = iterator.next();
            if (cli.getId() == id) {
                iterator.remove();
                System.out.println("Cliente " + cli.getNome()+", id "+cli.getId()+", foi removido!! \n");
            }
        }
    }

    @Override
    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());

        }
    }

}

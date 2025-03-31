// Serviço para exibir pedidos no console
// Princípio da Responsabilidade Única (SRP) - Responsável apenas por exibir pedidos no console
import java.util.List;

public class MostrarPedidos {
    public void mostrarPedidos(List<IPedido> pedidos) {
        for (int i = 1; i < pedidos.size(); i++) {
            IPedido pedido = pedidos.get(i);
            System.out.println(i + ". [" + (pedido.isConcluido() ? "X" : " ") + "] " + pedido.getNomeProduto() + " (Prioridade: " + pedido.getPrioridade() + ")");
        }
    }
}



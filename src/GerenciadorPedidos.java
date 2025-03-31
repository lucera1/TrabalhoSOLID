import java.util.ArrayList;
import java.util.List;

// Gerenciador de pedidos do estoque
// Princípio da Responsabilidade Única (SRP) - Responsável apenas por gerenciar pedidos

public class GerenciadorPedidos {
    private List<IPedido> pedidos = new ArrayList<>();

    public void adicionarPedido(IPedido pedido) {
        pedidos.add(pedido);
    }

    public List<IPedido> listarPedidos() {
        return pedidos;
    }
}

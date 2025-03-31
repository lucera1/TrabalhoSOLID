import java.util.List;
import java.util.stream.Collectors;


// Serviço de filtragem de pedidos
// Princípio da Responsabilidade Única (SRP) - Responsável apenas por filtrar pedidos
// Princípio Aberto/Fechado (OCP) - Podemos adicionar novos filtros sem modificar a classe

public class FiltroPedido {
    public List<IPedido> filtrarPorPrioridade(List<IPedido> pedidos, String prioridade) {
        return pedidos.stream()
                .filter(pedido -> pedido.getPrioridade().equalsIgnoreCase(prioridade))
                .collect(Collectors.toList());
    }
}

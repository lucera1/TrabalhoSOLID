// Interface para representar um pedido genérico
// Princípio da Segregação de Interfaces (ISP) - Interface pequena e específica para pedidos

public interface IPedido {
    String getNomeProduto();
    String getPrioridade();
    boolean isConcluido();
    void marcarComoConcluido();
}
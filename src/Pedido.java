// Implementação do pedido no contexto de um controle de estoque
// Princípio da Responsabilidade Única (SRP):
// Esta classe tem a única responsabilidade de representar um pedido.

public class Pedido implements IPedido {
    private String nomeProduto;
    private String prioridade;
    private boolean concluido;

    public Pedido(String nomeProduto, String prioridade) {
        this.nomeProduto = nomeProduto;
        this.prioridade = prioridade;
        this.concluido = false;
    }

    @Override
    public String getNomeProduto() {
        return nomeProduto;
    }

    @Override
    public String getPrioridade() {
        return prioridade;
    }

    @Override
    public void marcarComoConcluido() {
        this.concluido = true;
    }

    @Override
    public boolean isConcluido() {
        return concluido;
    }
}

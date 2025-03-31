// Classe principal utilizando injeção de dependência
// Princípio da Inversão de Dependência (DIP) - Depende de abstrações e não de implementações concretas
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorPedidos gerenciador = new GerenciadorPedidos();
        MostrarPedidos mostrador = new MostrarPedidos();
        FiltroPedido filtroPedidos = new FiltroPedido();

        while (true) {
            System.out.println("\n--- Controle de Pedidos ---");
            System.out.println("1. Criar novo pedido");
            System.out.println("2. Listar pedidos");
            System.out.println("3. Marcar pedido como concluído");
            System.out.println("4. Filtrar por prioridade");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir \n
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Prioridade (Alta, Média, Baixa): ");
                    String prioridade = scanner.nextLine();
                    gerenciador.adicionarPedido(new Pedido(produto, prioridade));
                    break;
                case 2:
                    mostrador.mostrarPedidos(gerenciador.listarPedidos());
                    break;
                case 3:
                    mostrador.mostrarPedidos(gerenciador.listarPedidos());
                    System.out.print("Número do pedido para marcar como concluído: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < gerenciador.listarPedidos().size()) {
                        gerenciador.listarPedidos().get(index).marcarComoConcluido();
                        System.out.println("Pedido marcado como concluído!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 4:
                    System.out.print("Prioridade para filtrar: ");
                    String filtro = scanner.nextLine();
                    mostrador.mostrarPedidos(filtroPedidos.filtrarPorPrioridade(gerenciador.listarPedidos(), filtro));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
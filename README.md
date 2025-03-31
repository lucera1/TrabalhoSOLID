# TrabalhoSOLID
Trabalho em trios aplicando os princípios do SOLID à um projeto de Gerenciamento de Estoque

TRABALHO DE SOLID
ALUNOS: Guilherme, Ícaro e Mateus Duran

No nosso projeto de Controle de Estoque, a gente aplicou os princípios SOLID para deixar o código mais organizado, fácil de entender e de manter. Aqui está como cada princípio foi usado:

1. Responsabilidade Única (SRP)
Cada classe tem uma única função no sistema:

Pedido só representa os pedidos.

GerenciadorPedidos cuida da lista de pedidos.

FiltroPedidos só faz a filtragem.

MostrarPedidos exibe os pedidos no console.

Main gerencia a interação com o usuário.

Isso evita que uma classe fique sobrecarregada com muitas responsabilidades.

2. Aberto/Fechado (OCP)
A gente pode adicionar novos filtros ou formatos de exibição sem precisar alterar o código original. Por exemplo:

Se quisermos um novo critério de filtragem, é só criar um novo método dentro de FiltroPedidos.

Se quisermos exibir pedidos em um arquivo em vez do console, podemos criar outra classe sem mudar MostrarPedidos.

3. Substituição de Liskov (LSP)
A classe Pedido segue a interface IPedido, então qualquer outra classe que implemente essa interface pode ser usada no lugar sem quebrar o sistema. Isso significa que, se no futuro quisermos criar um tipo diferente de pedido, ele vai funcionar normalmente sem mudar o código existente.

4. Segregação de Interfaces (ISP)
Criamos a interface IPedido bem estruturada, só com os métodos que realmente são necessários. Assim, qualquer classe que implementar essa interface só precisa se preocupar com funções relevantes para pedidos, sem ter que lidar com métodos desnecessários.

5. Inversão de Dependência (DIP)
Em vez de depender de classes concretas, nosso código trabalha com abstrações (IPedido). Isso deixa o sistema mais flexível, porque podemos trocar a implementação dos pedidos sem alterar quem usa essas classes.

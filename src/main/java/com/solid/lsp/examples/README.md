LSP:

**Subclasses devem ser substituíveis por suas classes bases sem alterar o comportamento. Ou seja, objetos de uma classe derivada devem ser substituíveis por objetos da classe base sem alterar o comportamento correto do programa.**

Exemplos:

-------------------------------------
V1:
Esse exemplo mostra como o princípio de Liskov é violado quando uma subclasse (CEO) lança uma exceção ao tentar se comportar como a classe base (Funcionário). Na versão refatorada, cada cargo (CEO, Gerente, Analista) estende uma classe abstrata "Cargo" e implementa seu próprio comportamento, respeitando o princípio.
-------------------------------------

-------------------------------------
V2:
-------------------------------------
Esse exemplo demonstra a aplicação do Princípio de Substituição de Liskov (LSP), parte dos princípios SOLID, em um sistema de pagamentos com diferentes métodos: Pix, Cartão de Crédito e Boleto. A ideia central é garantir que qualquer subclasse — como MetodoPix, MetodoCartaoCredito e MetodoBoleto — possa ser usada no lugar da classe base Pagamento sem quebrar o comportamento esperado do sistema. Cada método de pagamento adiciona sua própria lógica específica (como a taxa de 5% no cartão ou a geração do boleto), mas mantém a assinatura do método pagar() intacta, permitindo que o código funcione de forma polimórfica e extensível. Essa abordagem melhora a manutenção e facilita a adição de novos métodos de pagamento sem modificar o código existente.

-------------------------------------


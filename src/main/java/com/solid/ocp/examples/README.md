SRP:

**Você deve ser capaz de estender um comportamento de uma classe sem a necessidade de modificá-lo**


Isso significa que ao adicionarmos novos comportamentos devemos evitar modificar classes já existentes, optando por extensão via herança ou composição.

Exemplos:

-------------------------------------
V1: 
-------------------------------------
Exemplo do artigo:
https://medium.com/@tbaragao/solid-ocp-open-closed-principle-600be0382244
-------------------------------------
**Before:**
Uma classe que envia email para diversos tipos, como: html, texto ou criptografado. Caso haja a necessidade de 
incluir um novo tipo será necessário adicionar mais um IF ao codigo, que vai contra o principio de que as 
classes devem estar abertas para extensão e fechadas para alteração. Nesse caso adicionando o if iria modificar 
uma classe, o correto seria estender uma classe abstrata para adicionar um novo tipo. 

**After:**
Agora existe uma classe abstrata que é herdadas por classes que implementar o enviar e-mail. Cada 
implementação faz o seu papel sem depender uma da outra e o mais importante, quando for necessário 
adicionar um novo tipo de e-mail basta criar uma classe e estender a classe abstrata.

Destá forma o código fica dentro do segundo princípio do SOLID, o OCP.

-------------------------------------
V2:
-------------------------------------
Temos um sistema que calcula o desconto de produtos com base em seu tipo. O problema é que, sempre que precisarmos adicionar um novo tipo de produto, teremos que modificar a classe DescontoService, violando o OCP.

❌ Problemas deste código

1. Violação do OCP: Se quisermos adicionar um novo tipo de produto (ex: "ROUPA"), precisaremos modificar a classe DescontoService, aumentando o risco de bugs.
2. Código difícil de manter: Cada nova regra exige mais if-else, tornando o código mais complexo.
3. Baixa reutilização: A lógica de desconto está acoplada à classe DescontoService, dificultando a reutilização.

✅ Depois da Aplicação do OCP (Código Correto)

A solução é usar polimorfismo para permitir a extensão sem modificar a classe principal. Criamos uma interface para calcular descontos e implementamos classes específicas para cada tipo de produto.

✅ Vantagens da Nova Implementação

✔ Aberto para extensão: Para adicionar um novo desconto, basta criar uma nova classe implementando Desconto.

✔ Fechado para modificação: A classe Produto não precisa ser alterada quando um novo tipo de desconto é adicionado.

✔ Código mais organizado e reutilizável: Cada regra de desconto está isolada em sua própria classe.

Agora, se precisarmos adicionar um novo tipo de desconto, basta criar uma nova classe, sem modificar o código existente!

----------------------------------------------------------------------------------------------------------------------------------------------------


Single Responsability Principle (SRP)

**Uma classe deve ter um, e somente um, motivo para ser modificada**

Exemplos:

-------------------------------------
V1: 
-------------------------------------
**Before:**
Classe [GerarNotaFiscal.java] contém muitas responsábilidades, quebrando o princípio de responsábilidade única. 
A mesma classe tem as responsábilidades:
Validar Dados do Cliente, Gerar Imposto Fiscal, Salvar Nota Fiscal, Imprimir Cupom Fiscal,Enviar Cupom por Email

**After:**
Foi refatorado o código para atender ao SRP, transferindo cada responsábilidade para uma classe específica. 

As classes foram dividas dessa forma, onde cada uma contém a sua responsábilidade. 
ComunicacaoCupomFiscal -> enviarPorEmail
DadosDoCliente -> validar
EmissaoCupomFiscal -> imprimir
ImpostosCupomFiscal -> gerarImpostos 
PersistenciaCupomFiscal -> salvar

Destá forma o código fica dentro do primeiro princípio do SOLID, o SRP.

-------------------------------------
V2:
-------------------------------------
Vamos trabalhar com um cenário realista: um sistema de pedidos de e-commerce.

🚫 Código antes da refatoração (violando SRP)
A classe OrderService está fazendo muitas coisas ao mesmo tempo:

✅ Criando pedidos

✅ Calculando o total

✅ Aplicando desconto

✅ Salvando no banco

✅ Enviando e-mails de confirmação

🚨 Problemas

🔴 A classe OrderService tem múltiplas responsabilidades.

🔴 Se quisermos alterar a lógica de e-mail ou banco de dados, precisaremos modificar essa classe.

🔴 Testar essa classe é difícil porque ela tem muitas dependências.


✅ Código após refatoração (Respeitando SRP)
Agora, separamos as responsabilidades em classes distintas:

📌 Solução

Order → Representa o pedido.

DiscountService → Responsável pelo cálculo de desconto.

OrderRepository → Lida com o armazenamento no banco.

EmailService → Responsável por enviar e-mails.

OrderService → Apenas orquestra os serviços.

-------------------------------------


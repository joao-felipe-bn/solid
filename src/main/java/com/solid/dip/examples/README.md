DIP: Interface Segregation Principle

**Dependency Inversion Principle**

Exemplos:

-------------------------------------
V1: 
-------------------------------------
No exemplo 1 no before a classe EmailService depende de uma implementação de Notification, isso
viola o princípio DIP do SOLID pois implementações causam muitas dependencias. 
Na refatoração a classe EmailService implementa uma interface MessageService, e a classe Notification
depende dessa interface para enviar email, isso é o correto no DIP pois classes devem depender
de abstrações nunca de implementações. 

-------------------------------------
V2:
-------------------------------------
No exemplo 2 temos uma classe concreta que tem a responsabilidade de processar pagamento via Paypal. 
A classe se chama PaypalPaymentProcessor. 
Uma service PaymentService que faz a injeção de dependencia da classe concreta PaypalPaymentProcessor,
isso é um grande problema pois PaymentService está acoplado diretamente ao PaypalPaymentProcessor.
Depois da aplicação do DIP foi criado uma interface PaymentProcessor que foi implementada pela 
classe PaypalPaymentProcessor. Já a classe PaymentService fez a injeção de dependencia pela interface
PaymentProcessor, dependendo assim de uma abstração e não de uma implementação. 

-------------------------------------

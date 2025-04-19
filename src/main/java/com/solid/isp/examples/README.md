ISP: Interface Segregation Principle

**Classes não devem ser forçados a depender de interfaces que eles não usam.**

Exemplos:

-------------------------------------
V1: 
-------------------------------------

A Interface Printer é responsável por três métodos, printarDocumento, escanearDocumento, faxDocumento. 
A classe SimplePrinter implementa da interface Printer, porém ela só utiliza um método, que é o printarDocumento. 
Os demais métodos não são usados na classe, isso quebra o principio de segregação de interfaces pois a 
classe está implementando um método que não usa. 
Para deixar o código aderente ao principio de segregação de interface se faz necessário Segregar a interface
em três, sendo: Fax, Printer e Scanner. A cada com seu método. A classe SimplePrinter continua implementando
de Printer, porém ela agora só tem um método, que é o printarDocumento. Já a classe MultifuncionalPrinter
implementa de três interfaces Fax, Printer e Scanner. E utiliza todos os métodos. 
Dessa forma o código fica aderente ao principio de segregação de interfaces. 

-------------------------------------
V2:
-------------------------------------
A interface Telefone tem os métodos tocar, discar e tirar todo. Existem 2 classes que implementam de 
Telefone, a TelefoneCelular e TelefoneComum. O problema aqui é que TelefoneComum não tira foto, 
então esse método fica sem implementação ou é lançado uma exceção. Isso fere o principio de 
segregação de interface, pois a classe TelefoneComum não está utilizando todos os métodos da 
interface Telefone.

Para ajustar esse cenário e deixar aderente ao principio de segregação de interface se faz 
necessário segregar as interfaces, ou seja teríamos uma interface para TelefoneCelular e 
outra para TelefoneComum e cada classe que implementa dessas interfaces irá utilizar todos os métodos,
deixando assim o código aderente ao principio de segregação de interface.

-------------------------------------

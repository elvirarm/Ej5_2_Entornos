# Ej5_2_Entornos

a) Los elementos que te has encontrado en UML y que tienen mapeo sobre conceptos orientados a objetos.

- Clases

  En POO, estas clases representarían entidades del sistema con atributos y métodos.


- Atributos y Métodos:
  
  Se han definido atributos con su tipo (String, Int, Double, List).
  Se han definido métodos como realizarPedido(), calcularCoste(), consultarStock(), lo cual es una representación de la encapsulación en POO.

- Enumeraciones (Enums):
  
  EstadoPedido y métodoPago representan valores predefinidos, lo que en POO se traduce a enumeracione.

- Herencia:
  
  Cheque, Card y Cash heredan de métodoPago. Esto se traduce a herencia en POO, permitiendo polimorfismo.


- Asociaciones y Cardinalidad:
  
  La relación entre Cliente y Pedido (1..1 a 1..*) indica que un cliente puede tener varios pedidos.
  La relación Pedido → Producto (0..1 a 1..*) sugiere que un pedido puede contener varios productos, reflejando una relación de composición en POO.


b) Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.

  He utilizado Draw.io, al inicio empecé utilizando Lucidchart, pero se me acabó la versión de prueba.

  Draw.io tiene como ventaja que es gratuito y tiene muchas funcionalidades.

  - Es gratuito y no requiere instalación
  - Se puede exportar en varios tipos de archivo y se puede vincular con servicios en la nube, como Google Drive.

    A la hora de manipular los elementos me gusta menos, pero al haberseme acabo la versión de prueba, me quedo con esta siendo una muy buena opción.

c) Explicación sobre la conversión del diagrama UML al código, explicando las decisiones que has tomado. No tiene porque ser el codigo completo, pero si un esquema de lo que podría llegar a ser.

  He desarrollado las clases Cliente, Pedido y Producto.
  He utilizado enum para representar los estados del pedido y las formas de pago.
  He incorporado de métodos para que, por ejemplo, el cliente pueda generar un pedido y almacenarlo en su lista de pedidos.
  
  Definición de relaciones:
  
  - Cliente contará con una lista de pedidos como atributo.
  - Pedido incluirá una colección de productos y un campo para el método de pago.
  - Pedido permitirá registrar pagos y calcular el precio total del pedido.



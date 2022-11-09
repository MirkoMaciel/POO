
public class Mains {

}


/*Reglas prácticas de herencia en Java
1. El mecanismo que permite extender la definición de una clase sin hacerle cambios 
físicos es la herencia; la cual implica una relación es-un. Por ejemplo: un empleado 
es una persona, un programador es un empleado, un triángulo es una figura 
geométrica, un rectángulo es otra figura y un círculo también lo es.
2. La herencia permite crear nuevas clases a partir de las existentes; cualquier nueva 
clase que se crea se denomina subclase, clase derivada o clase hija; las clases existentes se denominan superclases, clases base o clases padre.
3. La relación de herencia permite que una subclase herede características de su superclase y añada otras; por consiguiente, en lugar de crear clases totalmente nuevas se puede aprovechar la ventaja de la herencia para disminuir la complejidad 
del software.
4. En las subclases se pueden utilizar los miembros de la superclase o bien, anularlos 
o redefinirlos; también se pueden definir sus propios miembros.
5. Cada subclase se puede convertir en una superclase; la herencia puede ser simple 
o múltiple; en la primera, la subclase se deriva de una única superclase; en la segunda, la subclase se deriva de más de una superclase. Java no soporta herencia 
múltiple; es decir, en Java una clase puede extender la definición a sólo una subclase.



Herencia: clases derivadas
Como ya se comentó, la herencia es la manifestación más clara de la relación de generalización/especialización, una de las propiedades más importantes de la orientación 
a objetos y, posiblemente, su característica más conocida y sobresaliente. Todos los 
lenguajes de programación orientados a objetos soportan directamente en su propio lenguaje construcciones que implementan de modo directo la relación entre clases derivadas.
La herencia es la relación entre dos clases, en la que una, denominada derivada, se 
crea a partir de otra ya existente, llamada base; este concepto nace de la necesidad de 
construir una nueva clase de otra que ya existe y representa un concepto más general; 



7.2 Clases
Una clase es una plantilla, modelo o plano a partir de la cual se crean objetos; los que se 
derivan de la misma clase tienen características o propiedades similares; cuando se construye un objeto de una clase, se dice que se ha creado una instancia, ejemplar o copia 
de ésta.
Como ya se señaló, todo el código escrito en Java está dentro de una clase; la biblioteca estándar de Java contiene centenares o miles de clases que sirven para diversos 
propósitos, como diseño de interfaces de usuario, cálculos matemáticos, cálculo de 
fechas y calendarios, programación de redes y aplicaciones diversas de toda índole. Sin 
embargo, cuando desarrolle un programa, además de las clases de las bibliotecas, necesitará crear las propias que describan los objetos del dominio del problema de sus 
aplicaciones.
Los programadores de Java se deben centrar en la creación de clases; cada una contiene campos de instancia y datos de un objeto; los procedimientos o funciones que 
operan sobre los datos se llaman métodos. Un objeto específico que es instancia de una 
clase tendrá valores específicos para sus campos de instancia; como veremos más adelante, el conjunto de esos valores constituye el estado del objeto. Siempre que se invoque o 
llame un método de un objeto, los programas deben interactuar con 
los datos sólo a través de los métodos.
En los lenguajes de programación procedimentales como C, la 
unidad de programación equivalente a un método es la función y, en 
otros lenguajes como Pascal, las unidades se denominan procedimientos o funciones


7.1.4 Polimorfi smo
El polimorfismo es la propiedad que le permite a una operación o función tener el mismo nombre en clases diferentes y actuar de modo distinto en cada una de ellas; por 
ejemplo: se puede abrir una puerta, una ventana, un libro, un periódico, una cuenta en 
un banco, una conversación, un congreso; en cada caso se realiza una acción diferente. 
En orientación a objetos, cada clase “conoce” cómo realizar esa operación.
En la práctica, polimorfismo implica la capacidad de una operación de ser interpretada sólo por el propio objeto que lo invoca; desde un punto de vista práctico de ejecución del programa, el polimorfismo se realiza en tiempo de ejecución, ya que durante 
la compilación no se conoce qué tipo de objeto y por consiguiente cuál operación fue 
invocada.
En la vida diaria hay numerosos ejemplos de polimorfismo: en un taller de reparaciones de automóviles existen diferentes marcas, modelos, potencias, carburantes, etcétera, 
que constituyen una clase o colección heterogénea. Supongamos que se ha de realizar 
una operación típica como cambiar los frenos; ésta es la misma, los principios de trabajo 
son iguales, sin embargo, dependiendo del auto en particular, la operación cambiará e 
incluirá diferentes acciones.
El polimorfismo es importante en el modelado de sistemas porque el uso de palabras iguales tiene comportamientos distintos, según el problema a resolver; y también 
es importante en el desarrollo de software pues toma ventaja de la propiedad de la herencia



7.1.2 Encapsulamiento y ocultación de datos
Encapsulación o encapsulamiento significa reunir en cierta estructura todos los elementos que, a determinado nivel de abstracción, se pueden considerar de una misma 
entidad, y es el proceso de agrupamiento de datos y operaciones relacionadas bajo una 
misma unidad de programación, lo que aumenta la cohesión de los componentes del 
sistema.
En este caso, los objetos que poseen las mismas características y comportamiento se 
agrupan en clases que son unidades de programación que encapsulan datos y operaciones; la encapsulación oculta lo que hace un objeto de lo que hacen otros objetos del 
mundo exterior, por lo que se denomina también ocultación de datos.
Un objeto tiene que presentar una “cara” al mundo exterior, de modo que pueda 
iniciar operaciones; la televisión tiene un conjunto de botones, bien en ella misma o 
incorporados en un control remoto. Una máquina lavadora tiene un conjunto de mandos e indicadores que establecen la temperatura y el nivel del agua. Los botones de la TV 
y los mandos de la lavadora constituyen la comunicación con el mundo exterior, las 
interfaces.
En esencia, la interfaz de una clase representa un contrato de prestación de servicios 
entre ella y los demás componentes del sistema; de este modo, los clientes de un componente sólo necesitan conocer los servicios que éste ofrece y no cómo están implementados internamente. Por consiguiente, se puede modificar la implementación de una clase 
sin afectar a las restantes relacionadas con ella. Existe una separación entre la interfaz y 
la implementación: la primera establece qué se puede hacer con el 
objeto; de hecho, la clase actúa como una caja negra; es estable, la implementación se puede modificar.
Otro ejemplo lo encontramos en los automóviles: no se necesita 
conocer el funcionamiento de la caja de cambios, el sistema de frenos o 
la climatización para que el conductor utilice todos estos dispositivos.




7.1.1 Abstracción
Es la propiedad que considera los aspectos más significativos o notables de un problema 
y expresa una solución en esos términos. En computación, es la etapa crucial de representación de la información en relación con la interfaz y el usuario; se representa con un 
tipo definido por el usuario, con el diseño de una clase que implementa la interfaz correspondiente. Una clase es un elemento en C++ o en Java que traduce una abstracción 
a un tipo definido por el usuario y combina representaciones de datos y métodos para 
manipular esa información en un paquete


























*/
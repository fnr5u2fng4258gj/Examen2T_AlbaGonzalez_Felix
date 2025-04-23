# Examen2T_AlbaGonzalez_Felix
Pruebas de valores Limite: Para estas pruebas puse a prueba los limites de entre el presupuesto y el mondo en los métodos procesarPedido y realizar pedido, en donde en los dos metodos me salia como true si el presupuesto era mayor al mondo y false si era el mondo el que era superior.

Pruebas de Cobertura de Decisiones: En estas pruebas comprobe que cada rama(if,else, switch)  funcionara correctamente, cuando las hice vi que procesarPedido me devolvia false cuando el mondo superaba al presupuesto y true cuando el presupuesto era el mayor, y en realizarPedido vi que si no se encontraba el deparatamento dentro de la array de instituto y si lo encontraba llamaba a procesarPedido.

Pruebas de Cobertura de Caminos Independientes:En estas pruebas busque cada camino logico que pudiera tener el codigo, al no haber nada muy especifico, son realmente parecidas a las pruebas de cobertura de decisiones.

Pruebas de integración: En ella puse a prueba todo el conjunto del código en donde con Instituto creé una array con tres dpeartamento usando el metodo agregar departamento y luego realice pedidos con cada uno ellos para ver si el codigo los encontraba dentro de la array y en el caso de encontrarlos llamar al metodo procesarPedido para ver si tiene el suficiente presupuesto.

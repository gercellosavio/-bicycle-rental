import java.util.Random;
public class Test{

	
  

	//metodo test 
	public void Test(){
	Rental renta = new Rental(); // creacion de objeto rental
	Random rn = new Random(); // creacion de objeto random el cual se encarga de generar valores aleatorios para las pruebas 
    double valor_esperado; // valor esperado  o referencia de comparacion con el valor generado por calse renta 
   int con_aciertos=0; //contador de aciertos entre valor esperado y el valor generado 
   int con_fallos=0;//contador de falla  entre valor esperado y el valor generado
   
	for(int i =0; i < 100; i++) // ciclo desde hasta de 100 repeticiones para calcular 100 distintos alquileres y comparar con los valores esperados 
	{
   	    int opcion = rn.nextInt(3) + 0; // variable opcion encargada de saber si es hora, dia, semana se carga automaticamente con la funcion de randon
   	    int cantidad_bicycle = rn.nextInt(10) + 1;// variable cantidad_bicycle encargada de saber la cantida de bicicletas alquiladas se carga automaticamente con la funcion de randon
        double  valor_de_pago = 1.0 + ( 10.0 - 1.0 ) * rn.nextDouble(); // variable  valor_de_pago encargada de saber la cantidad de  hora, dia, semana de alquiler  se carga automaticamente con la funcion de randon
        renta.setopcion(opcion); //se envia el valor generado aleatoriamente al metodo de renta para cargar opcion 
        renta.setcantidad_bicycle(cantidad_bicycle); //se envia el valor generado aleatoriamente al metodo de renta para cargar cantidad_bicycle
        renta.setvalor_de_pago(valor_de_pago); //se envia el valor generado aleatoriamente al metodo de renta para cargar valor_de_pago
        renta.Calcular_precio();//se calcula el precio de la renta en la clase rental
   	    valor_esperado=CalcularValorEsperado(opcion,valor_de_pago,cantidad_bicycle);//se envia al metodo CalcularValorEsperado()->opcion,valor_de_pago,cantidad_bicycle para generar un valor esperado para compara todo esto en la clase test 
        double valor_pago=renta.gettotal_a_pagar();// solicito a la clase rental el valor generado de valor de pago para comparar posteriormente con un valor esperado de la clase test 
        if (valor_pago==valor_esperado) {// condicion para comparar entre valor real con valor esperado
        	 System.out.println("valor esperado->"+valor_esperado+"    valor genreado->"+valor_pago);//impresion de los dos valores 
             con_aciertos++;//cantidad de aciertos 
	    }else{
	    	con_fallos++;//cantidad de fallas
	    }
       }
    	
System.out.println("porcentaje de aciertos:"+con_aciertos+"% y fallos:"+con_fallos+"%");// impresion de porcentaje de acierto y fallos 



	}

	private double CalcularValorEsperado(int opcion,double valor_de_pago,int cantidad_bicycle){
 
                                     
  
  double total_a_pagar=0.00;//valor a pagar por el cliente 
  double descuento;
    // condicion para calcular el monto a pagar por hora sin descuento
 	if (opcion==0 && (cantidad_bicycle<3 || cantidad_bicycle>5)) {
	  total_a_pagar=valor_de_pago*5;
	 
 	}
 	 // condicion para calcular el monto a pagar por dia sin descuento
 	if (opcion==1 && (cantidad_bicycle<3 || cantidad_bicycle>5)) {
 		total_a_pagar=valor_de_pago*20;
 		
 	}
    // condicion para calcular el monto a pagar por semana sin descuento
 	if (opcion==2 && (cantidad_bicycle<3 || cantidad_bicycle>5)) {
 		total_a_pagar=valor_de_pago*60;
 		
 	}
 	 // condicion para calcular el monto a pagar con el descuento del 30% de descuento
 	if  (cantidad_bicycle>=3 || cantidad_bicycle<=5) {
 		   // condicion para calcular el monto a pagar por hora con descuento
 		if (opcion==0 ) {
	    total_a_pagar=valor_de_pago*5;
	    descuento=valor_de_pago*5*0.3;
	    total_a_pagar=total_a_pagar-descuento;
	  }
 	     // condicion para calcular el monto a pagar por dia con descuento
 	    if (opcion==1 ) {
 		total_a_pagar=valor_de_pago*20;
 		descuento=valor_de_pago*20*0.3;
 		total_a_pagar=total_a_pagar-descuento;
 	  }
         // condicion para calcular el monto a pagar por semana con descuento
 	if (opcion==2 ) {
 		total_a_pagar=valor_de_pago*60;
 		descuento=valor_de_pago*60*0.3;
 		total_a_pagar=total_a_pagar-descuento;
 	  }
 	}
     
     return total_a_pagar;
	}
}
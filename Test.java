import java.util.Random;
public class Test{

	
  

	//metodo test 
	public void Test(){
	Rental renta = new Rental();
	Random rn = new Random();
    double valor_esperado;
   
   
	for(int i =0; i < 100; i++)
	{
   	    int opcion = rn.nextInt(3) + 0;
   	    int cantidad_bicycle = rn.nextInt(10) + 1;
        double  valor_de_pago = 1.0 + ( 10.0 - 1.0 ) * rn.nextDouble();
         renta.setopcion(opcion);
    renta.setcantidad_bicycle(cantidad_bicycle);
    renta.setvalor_de_pago(valor_de_pago);
    renta.Calcular_precio();
   	    valor_esperado=CalcularValorEsperado(opcion,valor_de_pago,cantidad_bicycle);
        double valor_pago=renta.gettotal_a_pagar();
    	 System.out.println(valor_esperado+"---"+valor_pago);
	}




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
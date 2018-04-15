public class Rental{
	//ATRIBUTOS 
 private int opcion; // saber si es hora=(0),dia=(1),semana=(2)
 private double total_a_pagar=0.00;//valor a pagar por el cliente 
 private int cantidad_bicycle;
 private double valor_de_pago=0.00;
   //METODOS
 public void setopcion(int opcion){
    this.opcion=opcion;
 }

 public int getopcion(){
 	return this.opcion;
 }

 public double gettotal_a_pagar(){
 	return this.total_a_pagar;
 }

 public void setcantidad_bicycle(int cantidad_bicycle){
 	this.cantidad_bicycle=cantidad_bicycle;
 }

 public int getcantidad_bicycle(){
 	return this.cantidad_bicycle;
 }

 public void setvalor_de_pago(double valor_de_pago){
 	this.valor_de_pago=valor_de_pago;
 }

public double getvalor_de_pago(){
	return this.valor_de_pago;
}

 public void Calcular_precio(){    //metodo para calcular el precio a pagar por el cliente 
 	 double descuento;
    // condicion para calcular el monto a pagar por hora sin descuento
 	if (this.opcion==0 && (this.cantidad_bicycle<3 || this.cantidad_bicycle>5)) {
	  this.total_a_pagar=this.valor_de_pago*5;
	 
 	}
 	 // condicion para calcular el monto a pagar por dia sin descuento
 	if (this.opcion==1 && (this.cantidad_bicycle<3 || this.cantidad_bicycle>5)) {
 		this.total_a_pagar=this.valor_de_pago*20;
 		
 	}
    // condicion para calcular el monto a pagar por semana sin descuento
 	if (this.opcion==2 && (this.cantidad_bicycle<3 || this.cantidad_bicycle>5)) {
 		this.total_a_pagar=this.valor_de_pago*60;
 		
 	}
 	 // condicion para calcular el monto a pagar con el descuento del 30% de descuento
 	if  (this.cantidad_bicycle>=3 || this.cantidad_bicycle<=5) {
 		   // condicion para calcular el monto a pagar por hora con descuento
 		if (this.opcion==0 ) {
	    this.total_a_pagar=this.valor_de_pago*5;
	    descuento=this.valor_de_pago*5*0.3;
	    this.total_a_pagar=this.total_a_pagar-descuento;
	  }
 	     // condicion para calcular el monto a pagar por dia con descuento
 	    if (this.opcion==1 ) {
 		this.total_a_pagar=this.valor_de_pago*20;
 		descuento=this.valor_de_pago*20*0.3;
 		this.total_a_pagar=this.total_a_pagar-descuento;
 	  }
         // condicion para calcular el monto a pagar por semana con descuento
 	if (this.opcion==2 ) {
 		this.total_a_pagar=this.valor_de_pago*60;
 		descuento=this.valor_de_pago*60*0.3;
 		this.total_a_pagar=this.total_a_pagar-descuento;
 	  }


 		
 	}
  }
}
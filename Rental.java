public class Rental{
	//ATRIBUTOS 
 private int opcion; // saber si es hora,dia,semana
 private double total_a_pagar=0.00;//valor a pagar por el cliente 
 private double valor_de_pago;//cantida de horas ,dia, semanas
 private int cantidad_bicycle;//cantidad de bicicletas rentadas 
   //METODOS
 public double Calcular_precio(int opcion,double valor_de_pago,int cantidad_bicycle){    //metodo para calcular el precio a pagar por el cliente 
 	 
    // condicion para calcular el monto a pagar por hora sin descuento
 	if (opcion==0 && (cantidad_bicycle<3 || cantidad_bicycle>5)) {
	  this.total_a_pagar=valor_de_pago*5;
	 
 	}
    return this.total_a_pagar;
  }
}
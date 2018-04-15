public class Package{
 public static void main(String args[]){
 
  double valor_pago;
  Rental renta = new Rental();
  renta.setopcion(1);
  renta.setcantidad_bicycle(4);
  renta.setvalor_de_pago(4.00);
  renta.Calcular_precio();

  valor_pago=renta.gettotal_a_pagar();
    System.out.println("Valor a Pagar:"+valor_pago+"$");
 }
}
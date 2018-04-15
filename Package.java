public class Package{
 public static void main(String args[]){
 
  double valor_pago;
  Rental renta = new Rental();
  valor_pago=renta.Calcular_precio(0,4.00,1);
    System.out.println("Valor a Pagar:"+valor_pago+"$");
 }
}
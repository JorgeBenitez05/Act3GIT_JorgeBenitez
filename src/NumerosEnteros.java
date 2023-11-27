import java.util.Scanner;

public class NumerosEnteros {

  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    int primerNumero;
    int segundoNumero;
    
    do {
      System.out.print("Introduzca el primer número: ");
      primerNumero = Integer.parseInt(scan.nextLine());
      System.out.print("Introduzca el segundo número distinto al anterior: ");
      segundoNumero = Integer.parseInt(scan.nextLine());
      
      if(primerNumero == segundoNumero) {
        System.out.print("ERROR. Los números introducidos son iguales");
      }
    } while (primerNumero == segundoNumero);
    
    if (primerNumero > segundoNumero) {
      int num = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = num;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.println(i);
    }
  }
}
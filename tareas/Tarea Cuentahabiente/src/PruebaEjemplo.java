//@author ricar
public class PruebaEjemplo {

   public static void main(String[] args) {
        System.out.println("----Cuenta Habientes----");
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0]= new Cuentahabiente("56729", "Arturo",20000.30f);
        lista[1]= new Cuentahabiente("89163", "Benito",52314.80f);
        lista[2]= new Cuentahabiente("79192", "Cristiano",92777.77f);
        lista[3]= new Cuentahabiente("61830", "Danna",49999.37f);
        lista[4]= new Cuentahabiente("37292", "Frida",40625.50f);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
            
       
        }
    }
}

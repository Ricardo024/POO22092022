public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
   public void retirarDinero( float monto ){
            //restar monto al balance
            balance -= monto;
            System.out.println("El saldo restante es: " + balance);
   }        
            
    public String evaluarNivelCliente(){
            /*De acuerdo al balance se debe regresar un String con alguna de las dos opciones, cilente regular o premium   
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
            if (balance <= 50000) {
                return "Cliente regular";
                
        } else {
                return "Cliente Premium";                
        }
       
    }
}
public class operacionBancaria{
public interface operacionBancaria{
    void transferir(double monto, String destino);
    void retirar(double monto);
    void pagarFactura(double monto, String factura); 
}
// interfaces especificas
public interface transferencia{
    void transferir(double monto, String destino);
}
public interface retiro{
    void retirar(double monto);
}
public interface pagoFactura{
    void pagarFactura(double monto, String factura);
}
public class operacionBancaria implements transferencia, retiro, pagoFactura{- double saldo;

// implementaciones
public void transferir(double monto, String destino){
        System.out.println("transferencia de dinero"); 
    }
}
public void retirar(double monto){
        System.out.println("retiro dedinero");
}

public void pagarFactura(double monto, String factura){
        System.out.println("pago de factura"+ factura + "por el valor de" + monto);
}

}

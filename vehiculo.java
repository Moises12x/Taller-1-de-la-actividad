public interface Vehiculo{
void conducir();
void cargarMercancia(double peso);
}
public interface conduccion{
    void conducir();
}

public interface transportedeMercancia{
    void cargarMercancia(double peso);
}
public class Camion implements Conduccion, TransporteMercancia {
    - double capacidadCarga;
    - double cargaActual;
    public Camion(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0;
    }
}
// implementaciones
public void conducir(){
    System.out.println("el camion esta en movimiento")
}
public void cargarMercancia(double peso){
    if (cargaActual + peso <= capacidadCarga){
        cargaActual += peso;
        System.out.println("cargando" + peso + "kg de mercancia. la carga total es:" + cargaActual + "kg") 
    }
}


public interface Main {
    // interfaz general de mantenimiento 
    public interface Mantenimiento{
        void reparar(); 
        void limpiar();
    }
    // refactorización:
    // interfaz de reparaciones
    public interface reparacion{
        void reparar();
    }
    // intrfaz de limpieza 
    public interface limpieza{
        void limpiar();
    }
    public class reparacionNevera implements reparacion{
        void reparar(){
            System.out.println(Reparando la nevera);
        }
        public class limpiarNevera implements limpieza{
            void limpiar(){
                System.out.println(Limpiando la nevera);
            }

        }
    }
}

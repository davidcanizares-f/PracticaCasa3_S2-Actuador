package negocio;

public class Actuador {
    public String codigo;
    public String tipo;
    double posicion;
    boolean activo;

    public void activar(){
        if(!activo){
            activo=true;
            System.out.println("[!] El actuador " + codigo + " ha sido activado.");
        } else {
            System.out.println("[!] El actuador " + codigo + " ya ha sido activado.");
        }
    }

    public void cambiarPosicion(double nuevaPosicion){
        posicion = nuevaPosicion;
        System.out.println("[!] El actuador " + codigo + " se movió a la posición " + posicion + " mm.");
    }

    void desactivar(){
        if(activo){
            activo = false;
            System.out.println("[!] El actuador " + codigo + " fue desactivado");
        } else {
            System.out.println("[!] El actuador " + codigo + " ya fue desactivado");
        }
    }

    void mostrarInformacion(){
        System.out.println("Actuador (Código): " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Posición: " + posicion + " mm");
        System.out.println(activo ? "Estado: Activo" : "Estado: Desactivado");
        System.out.println("-----------------------------------");
    }



}

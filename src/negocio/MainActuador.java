package negocio;

public class MainActuador {
    public static void main() {
        Actuador actuador1 = new Actuador();
        actuador1.codigo = "ACT-001";
        actuador1.tipo = "Lineal";
        actuador1.posicion = 0;
        actuador1.activo = false;

        Actuador actuador2 = new Actuador();
        actuador2.codigo = "ACT-002";
        actuador2.tipo = "Neumático";
        actuador2.posicion = 10;
        actuador2.activo = false;

        Actuador actuador3 = new Actuador();
        actuador3.codigo = "ACT-003";
        actuador3.tipo = "Hidráulico";
        actuador3.posicion = 25;
        actuador3.activo = false;

        System.out.println("====== INFORMACIÓN INICIAL ======");
        actuador1.mostrarInformacion();
        actuador2.mostrarInformacion();
        actuador3.mostrarInformacion();

        System.out.println("===== Activar y Mover Actuadores =====");
        actuador1.activar();
        actuador1.activar();
        actuador1.cambiarPosicion(15);
        System.out.println("-------------------------------");
        actuador1.mostrarInformacion();
        actuador1.desactivar();
        actuador1.mostrarInformacion();



    }
}

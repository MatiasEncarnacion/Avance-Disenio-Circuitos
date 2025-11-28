import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Autor Grupo3
 */
public class CircuitoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Simulador de Circuitos");
        System.out.println("Seleccione el valor de la fuente de voltaje");
        Componente fuente = new Fuente();
        fuente.setVoltaje(sc.nextFloat());
        List<Componente> componentes = new ArrayList<>();
        componentes.add(fuente);
        System.out.println("Lista de componentes: "+componentes);
        int opcion;
        int opcion2;
        int posicion;
        float nuevovalor;
        while(true){
            System.out.println("1. Añadir componente");
            System.out.println("2. Modificar valores de componente");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("1. Resistencia");
                    System.out.println("2. Capacitor");
                    System.out.println("3. Switch");
                    opcion2 = sc.nextInt();
                    switch(opcion2){
                        case 1:
                            Resistencia resistencia = new Resistencia();
                            System.out.println("Ingrese el valor de resistencia");
                            resistencia.setResistencia(sc.nextInt());
                            resistencia.setVoltaje(fuente.getVoltaje());
                            resistencia.calcularCorriente(resistencia.getVoltaje(), resistencia.getResistencia());
                            resistencia.calcularPotencia((double)resistencia.getVoltaje(), resistencia.getResistencia());
                            System.out.println("Resistencia: "+resistencia);
                            componentes.add(resistencia);
                            break;
                        case 2:
                            Capacitor capacitor = new Capacitor();
                            System.out.println("Ingrese el valor de capacitancia");
                            capacitor.setCapacitancia(sc.nextFloat());
                            capacitor.setVoltaje(fuente.getVoltaje());
                            capacitor.calcularCargaElectrica(capacitor.getCapacitancia(), capacitor.getVoltaje());
                            componentes.add(capacitor);
                            break;
                        case 3:
                            Switch switchh = new Switch();
                            System.out.println("Encendido o apagado? (true o false)");
                            switchh.setEstado(sc.nextBoolean());
                            componentes.add(switchh);
                            break;
                    }
                    break;
                    case 2:
                        System.out.println("Ingrese la posicion del elemento a modificar");
                        posicion = sc.nextInt();
                        System.out.println("Componente seleccionado: ");
                        componentes.get(posicion).toString();
                        System.out.println("Que valor desea modificar?");
                        System.out.println("1. Voltaje");
                        System.out.println("2. Resistencia");
                        System.out.println("3. Corriente");
                        opcion2 = sc.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.println("Ingrese el nuevo valor");
                                nuevovalor = sc.nextFloat();
                                componentes.get(posicion).setVoltaje(nuevovalor);
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo valor");
                                nuevovalor = sc.nextFloat();
                                componentes.get(posicion).setResistencia((int)nuevovalor);
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo valor");
                                nuevovalor = sc.nextFloat();
                                componentes.get(posicion).setCorriente(nuevovalor);
                                break;
                        }
                        break;
            }
            System.out.println(componentes);
        }
    }
}

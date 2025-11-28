/**
 * @Autor Grupo3
 */
public class Capacitor extends Componente{
    private float capacitancia;
    private float cargaElectrica;

    public Capacitor(){

    }
    public Capacitor(float voltaje, float corriente, float potencia, TipoMedida medida, int reactanciaCapacitiva) {
        super(voltaje, corriente, potencia, TipoMedida.FARADS);
        this.capacitancia = reactanciaCapacitiva;
    }

    public void calcularCargaElectrica(float capacitancia, float voltaje){
        float cargaElectrica = capacitancia * voltaje;
        this.cargaElectrica = cargaElectrica;
    }

    public float getCapacitancia() {
        return capacitancia;
    }

    public void setCapacitancia(float capacitancia) {
        this.capacitancia = capacitancia;
    }

    public float getCargaElectrica() {
        return cargaElectrica;
    }

    public void setCargaElectrica(float cargaElectrica) {
        this.cargaElectrica = cargaElectrica;
    }

    @Override
    public String toString() {
        return "Capacitor{"+
                "capacitancia = " + capacitancia +
                ", carga electrica = " + cargaElectrica+
                '}';
    }
}

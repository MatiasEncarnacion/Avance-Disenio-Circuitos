/**
 * @Autor Grupo3
 */
public class Resistencia extends Componente {
    private static int nResistencia = 0;

    public Resistencia(){
        nResistencia++;
        this.setMedida(TipoMedida.OHM);
    }

    public Resistencia(float voltaje, float corriente, int resistencia, float potencia, TipoMedida medida) {
        super(voltaje, corriente, resistencia, potencia, TipoMedida.OHM);
        nResistencia++;
    }

    @Override
    public void setVoltaje(float voltaje) {
        super.setVoltaje(voltaje/this.nResistencia);
    }

    @Override
    public String toString() {
        return "Resistencia{resistencia = "+this.getResistencia()+
                " voltaje =" +this.getVoltaje()+
                " corriente = "+this.getCorriente()+
                " potencia = "+this.getPotencia()+
                " Numero resistencias = "+nResistencia+"}";
    }
}


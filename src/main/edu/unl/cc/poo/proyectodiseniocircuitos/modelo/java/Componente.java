import java.util.Objects;
/**
 * @Autor Grupo3
 */
public abstract class Componente {
    private float voltaje;
    private float corriente;
    private int resistencia;
    private float potencia;
    private TipoMedida medida;

    public Componente() {
    }

    public Componente(float voltaje, float corriente, int resistencia, float potencia, TipoMedida medida) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.resistencia = resistencia;
        this.potencia = potencia;
        this.medida = medida;
    }

    public Componente(float voltaje, float corriente, float potencia, TipoMedida medida) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.potencia = potencia;
        this.medida = medida;
    }

    public void calcularVoltaje(float corriente, int resistencia) {
        float voltaje = corriente*resistencia;
        this.voltaje = voltaje;
    }

    public void calcularCorriente(float voltaje, int resistencia) {
        float corriente = 0;
        try {
            corriente = voltaje / resistencia;

        } catch (ArithmeticException e) {
            System.out.println("Resistencia no puede ser igual a 0, "+e.getMessage());
        }
        this.corriente = corriente;
    }

    public void calcularResistencia(float corriente, float voltaje){
        int resistencia = 0;
        try{
            resistencia = (int) (voltaje/corriente);
        } catch (ArithmeticException e) {
            System.out.println("Corriente no puede ser igual a 0, "+e.getMessage());
        }
        this.resistencia = resistencia;
    }

    public void calcularPotencia(float voltaje, float corriente){
        float potencia = voltaje*corriente;
        this.potencia = potencia;
    }

    public void calcularPotencia(double corriente, int resistencia){
        float potencia = (float)Math.sqrt(corriente)*resistencia;
        this.potencia = potencia;
    }

    public void calcularPotencia(double voltaje, float resistencia){
        float potencia = 0;
        try {
            potencia = (float)Math.sqrt(voltaje)/resistencia;
        } catch (IllegalArgumentException e) {
            System.out.println("Resistencia no puede ser igual a 0, "+e.getMessage());
        }
        this.potencia = potencia;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }

    public float getCorriente() {
        return corriente;
    }

    public void setCorriente(float corriente) {
        this.corriente = corriente;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public TipoMedida getMedida() {
        return medida;
    }

    public void setMedida(TipoMedida medida) {
        this.medida = medida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Float.compare(voltaje, that.voltaje) == 0 && Float.compare(corriente, that.corriente) == 0 && resistencia == that.resistencia && Float.compare(potencia, that.potencia) == 0 && medida == that.medida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(voltaje, corriente, resistencia, potencia, medida);
    }

    @Override
    public String toString() {
        return "Componente{" +
                "voltaje=" + voltaje +
                ", corriente=" + corriente +
                ", resistencia=" + resistencia +
                ", potencia=" + potencia +
                ", medida=" + medida +
                '}';
    }
}

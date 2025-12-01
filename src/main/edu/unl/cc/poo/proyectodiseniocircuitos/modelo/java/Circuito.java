import java.util.ArrayList;
import java.util.List;
/**
 * @Autor Grupo3
 */
public class Circuito {
    private List<Componente> componentes;

    public Circuito() {
    }

    public void agregar(Componente componente) {
        if (this.componentes == null) {
            this.componentes = new ArrayList<>();
        }
        if (!this.componentes.contains(componente)) {
            this.componentes.add(componente);
        }
    }

    public void agregar(Componente... componentes) {
        for (Componente componente : componentes) {
            agregar(componente);
        }
    }

    public void remover(Componente componente) {
        if (this.componentes.contains(componente)) {
            this.componentes.remove(componente);
        }
    }

    public int lenght() {
        return this.componentes.size();
    }

    public Componente getComponente(int posicion) {
        return componentes.get(posicion);
    }

    public Componente setComponente(int posicion, Componente componente) {
        return componentes.set(posicion, componente);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "componentes=" + componentes +
                '}';
    }
}

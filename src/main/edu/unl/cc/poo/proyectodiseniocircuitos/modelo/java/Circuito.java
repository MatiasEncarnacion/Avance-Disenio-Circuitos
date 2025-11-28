import java.util.ArrayList;
import java.util.List;
/**
 * @Autor Grupo3
 */
public class Circuito {
    private List<Componente> componentes;

    public Circuito() {
    }

    public void agregar(Componente componente){
        if(this.componentes == null){
            this.componentes = new ArrayList<>();
        }
        if(!this.componentes.contains(componente)){
            this.componentes.add(componente);
        }
    }

    public void agregar(Componente... componentes){
        for(Componente componente: componentes){
            agregar(componente);
        }
    }

    public void remover(Componente componente){
        if(this.componentes.contains(componente)){
            this.componentes.remove(componente);
        }
    }


}

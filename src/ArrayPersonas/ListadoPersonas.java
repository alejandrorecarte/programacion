package ArrayPersonas;

import java.util.ArrayList;
import java.util.Comparator;

public class ListadoPersonas {

    private ArrayList<Persona> listado = new ArrayList<Persona>();

    public ListadoPersonas(ArrayList<Persona> listado) {
        this.listado = listado;
    }

    public ListadoPersonas(){}

    public void add (Persona persona){
        listado.add(persona);
    }

    public Persona dniSearch (String dni){
        for(Persona p:listado){
            if(p.getDni().equals(dni)){
                return p;
            }
        }
        return null;
    }

    public void remove (String dni){
        listado.remove(dniSearch(dni));
    }

    public void orderByLastName (){
        listado.sort(Comparator.comparing(Persona::getApellidos));
    }

    public void orderBySex (){
        listado.sort(Comparator.comparing(Persona::getSexo));
    }

    @Override
    public String toString() {
        return "ListadoPersonas{" +
                "listado=" + listado +
                '}';
    }
}

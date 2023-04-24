package SimulacroExamen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Filtrados {

    public static ArrayList<Persona> lista = new ArrayList<Persona>();
    public static ArrayList<Persona> lista_filtrada = new ArrayList<Persona>();

    public static void add (Persona p){
        lista.add(p);
    }

    public static ArrayList<Persona> filteredByIMCHigher(double imc){
        lista_filtrada.clear();
        for (Persona p:lista){
            if (p.getImc()> imc){
                lista_filtrada.add(p);
            }
        }
        return lista_filtrada;
    }

    public static ArrayList<Persona> filterByGenderIMCLower (double imc, char c){
        String sexo = new String();
        if(c == 'M'){
            sexo = ("MUJER");
        }else if (c == 'H'){
            sexo = ("HOMBRE");
        }
        lista_filtrada.clear();
        for (Persona p:lista){
            if (p.getImc() > imc && p.getClass().getName().equals(sexo)){
            }
        }
        return lista_filtrada;
    }

    public static void orderByLowerToHigherIMC (){
        lista.sort(Comparator.comparing(Persona::getImc));
        printArray(lista);
    }

    public static void oriderByHigherToLowerIMC (){
        lista.sort(Comparator.comparing(Persona::getImc).reversed());
        printArray(lista);
    }

    public static void printArray (ArrayList<Persona> listado){
        Iterator<Persona> itr = listado.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}

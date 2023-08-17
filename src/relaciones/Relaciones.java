
package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {


    public static void main(String[] args) {
        
        
        //creacion de objeto auto vacio.
        Auto auto = new Auto();
        
        //le asigne sus datos
        auto.setId(1L);
        auto.setMarca("Renault");
        auto.setModelo("Duster");
        
        //creacion de lista de propietarios para 1 a n vacia:
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();        
        
        //cree 2 propietarios vacios
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();
        
        
        //===asigne sus datos de los propietarios===
        //Declaramos valores para el propietario 1
        prop1.setId(35L);
        prop1.setNombre("Nicolas");
        prop1.setApellido("Pozzer");
        //Declaramos valores para el propietario 2
        prop2.setId(23L);        
        prop2.setNombre("Tuma");
        prop2.setApellido("Hernia");
        //Declaramos valores para el propietario 3
        prop3.setId(66L);        
        prop3.setNombre("Magda");
        prop3.setApellido("Matija");
        
        //Insertamos los 3 propietarios a la lista
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        listaPropietarios.add(prop3);
        
        //Por ultimo seteamos la lista de propietarios a mi objeto auto
        auto.setListaPropietarios(listaPropietarios);
        
        
        
        
        //prueba
        System.out.println("El auto "+ auto.getMarca()+" "+auto.getModelo()+" "
                + " Tiene como propietarios a: "+ auto.getListaPropietarios().toString());
        
        
    }
    
}

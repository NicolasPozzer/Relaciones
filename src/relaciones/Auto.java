
package relaciones;

import java.util.List;

public class Auto {
    
    private Long id;
    private String marca;
    private String modelo;
    
    /*=============================================
    =================Relacion 1 a 1================
    ===============================================
    
    //Creacion de objeto propietario para una relacion 1 a 1.
    //y tambien se agrega su contructor y getter and S..
    private Propietario prop;
    ================================================*/
    
    
    
    /*=============================================
    =================Relacion 1 a n================
    ===============================================*/
    
    //Generando 1 a n ejemplo: 1 auto tiene una lista de propietarios.
    //Agregar constructor y Getter and S..
    private List<Propietario> listaPropietarios;
    /*================================================*/



    
    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    
    
    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios + '}';
    }
    
    
}
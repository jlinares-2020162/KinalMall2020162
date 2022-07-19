package org.javierlinares.bean;


public class TipoCliente {
    //Atributos
    private int codigoTipoCliente;
    private String descripcion;
    
    //Constructores
    public TipoCliente(){
    }
    
    public TipoCliente(int codigoTipoCliente, String descripcion){
        this.codigoTipoCliente = codigoTipoCliente;
        this.descripcion = descripcion;
    }
    
    //Metodo de Acceso

    public int getCodigoTipoCliente() {
        return codigoTipoCliente;
    }

    public void setCodigoTipoCliente(int codigoTipoCliente) {
        this.codigoTipoCliente = codigoTipoCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

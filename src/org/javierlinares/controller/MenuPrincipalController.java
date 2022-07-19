package org.javierlinares.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.javierlinares.system.Principal;

public class MenuPrincipalController implements Initializable {
    private Principal escenarioPrincipal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void ventanaProgramador(){
        escenarioPrincipal.ventanaProgramador();
    }
    
    public void ventanaAdministracion(){
        escenarioPrincipal.ventanaAdministracion();
    }
    
    public void ventanaCliente(){
        escenarioPrincipal.ventanaCliente();
    }
    
    public void ventanaTipoCliente(){
        escenarioPrincipal.ventanaTipoCliente();
    }
    
    public void ventanaLocales(){
        escenarioPrincipal.ventanaLocales();
    }
    
    public void ventanaDepartamentos(){
        escenarioPrincipal.ventanaDepartamentos();
    }
    
    public void ventanaProveedores(){
        escenarioPrincipal.ventanaProveedores();
    }
    
    public void ventanaCuentasPorPagar(){
        escenarioPrincipal.ventanaCuentasPorPagar();
    }
    
    public void ventanaHorarios(){
        escenarioPrincipal.ventanaHorarios();
    }
    
    public void ventanaEmpleados(){
        escenarioPrincipal.ventanaEmpleados();
    }
    
    public void ventanCuentasPorCobrar(){
        escenarioPrincipal.ventanaCuentasPorCobrar();
    }
    
    public void ventanaCargos(){
        escenarioPrincipal.ventanaCargos();
    }
    
    public void ventanaUsuarios(){
        escenarioPrincipal.ventanaUsuarios();
    }
    
    public void ventanaLogin(){
        escenarioPrincipal.ventanaLogin();
    }
}

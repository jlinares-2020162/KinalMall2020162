package org.javierlinares.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.javierlinares.system.Principal;


public class ProgramadorController implements Initializable{
    private Principal escenarioPrincipal;
    @FXML Button btnProgramador;
    @FXML Button btnKinal;
    @FXML Label lblNombres;
    @FXML Label lblApellidos;
    @FXML Label lblTitulo;
    
    @Override
    public void initialize(URL location, ResourceBundle resources){
         
    }
        
    @FXML
    private void opciones (ActionEvent event){
        if (event.getSource() == btnProgramador){
            lblNombres.setText("Javier Alexander");
            lblApellidos.setText("Linares Chang");
            lblTitulo.setText("Programador");  
        }else if (event.getSource() == btnKinal){
            lblNombres.setText("Fundación");
            lblApellidos.setText("®KINAL");
            lblTitulo.setText("2021");
        }
    }
    
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void menuPrincipal(){
        escenarioPrincipal.menuPrincipal();
    }

}


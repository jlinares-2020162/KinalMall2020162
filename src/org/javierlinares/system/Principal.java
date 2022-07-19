package org.javierlinares.system;

import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.javierlinares.controller.AdministracionController;
import org.javierlinares.controller.CargoController;
import org.javierlinares.controller.ClienteController;
import org.javierlinares.controller.CuentaPorCobrarController;
import org.javierlinares.controller.CuentaPorPagarController;
import org.javierlinares.controller.DepartamentosController;
import org.javierlinares.controller.EmpleadoController;
import org.javierlinares.controller.HorarioController;
import org.javierlinares.controller.LocalesController;
import org.javierlinares.controller.LoginController;
import org.javierlinares.controller.MenuPrincipalController;
import org.javierlinares.controller.ProgramadorController;
import org.javierlinares.controller.ProveedorController;
import org.javierlinares.controller.TipoClienteController;
import org.javierlinares.controller.UsuarioController;

/**
 * Programador: Javier Linares
 * Fecha creacion:
 *      05/05/2021
 * Fecha de modificacion:
 *      06/05/2021
 *      12/05/2021
 *      13/05/2021
 */
public class Principal extends Application {
    
    private final String PAQUETE_VISTA = "/org/javierlinares/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    
    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("Kinal Mall 2021");
//        Parent root = FXMLLoader.load(getClass().getResource("/org/javierlinares/view/MenuPrincipalView.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("/org/javierlinares/view/ProgramadorView.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("/org/javierlinares/view/AdministracionView.fxml"));
//        Scene escena = new Scene(root);
//        escenarioPrincipal.setScene(escena);
//        menuPrincipal();
        ventanaLogin();
        escenarioPrincipal.show();
    }

    public void menuPrincipal(){
        try{
            MenuPrincipalController menuPrincipal = (MenuPrincipalController)cambiarEscena("MenuPrincipalView.fxml", 600, 400);
            menuPrincipal.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();                            
        }
    }
    
    public void ventanaProgramador(){
        try{
            ProgramadorController programador = (ProgramadorController)cambiarEscena("ProgramadorView.fxml",600,400);
            programador.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaAdministracion(){
        try{
            AdministracionController admin = (AdministracionController)cambiarEscena("AdministracionView.fxml",810,400);
            admin.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    
    public void ventanaCliente(){
        try{
            ClienteController cliente =  (ClienteController)cambiarEscena("ClienteView.fxml",1200,400);
            cliente.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    public void ventanaTipoCliente(){
        try{
            TipoClienteController tipoCliente = (TipoClienteController)cambiarEscena("TipoClienteView.fxml",810,400);
            tipoCliente.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaLocales(){
        try{
            LocalesController locales = (LocalesController)cambiarEscena("LocalesView.fxml",955,400);
            locales.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaDepartamentos(){
        try{
            DepartamentosController departamento = (DepartamentosController)cambiarEscena("DepartamentosView.fxml",810,400);
            departamento.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
                                        
    public void ventanaProveedores(){
        try{
            ProveedorController proveedor = (ProveedorController)cambiarEscena("ProveedorView.fxml",1200,400);
            proveedor.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaCuentasPorPagar(){
        try{
            CuentaPorPagarController cuentasPagar = (CuentaPorPagarController)cambiarEscena("CuentasPorPagarView.fxml",1200,400);
            cuentasPagar.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaHorarios(){
        try{
            HorarioController Horario = (HorarioController)cambiarEscena("HorarioView.fxml",955,400);
            Horario.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaEmpleados(){
        try{
            EmpleadoController empleado = (EmpleadoController)cambiarEscena("EmpleadosView.fxml",1200,400);
            empleado.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaUsuarios(){
        try{
            UsuarioController usuario = (UsuarioController)cambiarEscena("UsuarioView.fxml",600,400);
            usuario.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaLogin(){
        try{
            LoginController loginController = (LoginController)cambiarEscena("LoginView.fxml",600,400);
            loginController.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    public void ventanaCuentasPorCobrar(){
        try{
            CuentaPorCobrarController cuentaPorCobrar = (CuentaPorCobrarController)cambiarEscena("CuentasPorCobrarView.fxml",1200,400);
            cuentaPorCobrar.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaCargos(){
        try{
            CargoController cargos = (CargoController)cambiarEscena("CargosView.fxml",600,400);
            cargos.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public Initializable cambiarEscena(String fxml,int ancho,int alto) throws IOException{
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA+fxml);
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA+fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    } 
}

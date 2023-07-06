/* Documentacion
Nombre Completo: Yohan Andres Rodas Macal
Codigo Tecnico:IN5AM
Carne:2018481
Fecha Creacion:26/03/2022
Fecha Modificaciones:31/03/2022
*/
package org.YohanRodas.system;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

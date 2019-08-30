package projetotcc;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Alexandre/Elias/Elzio/Julio  
 */

public class ProjetoTcc extends Application {
    private static Scene fxmlCadastro;
    private static Scene main;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        primaryStage.setTitle("Cadastro");
        
        Parent fxmlCadastro = FXMLLoader.load(this.getClass().getResource("/Views/Login/ViewLogin.fxml")); 
        primaryStage.setScene(new Scene(fxmlCadastro, 1300, 680));
        
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

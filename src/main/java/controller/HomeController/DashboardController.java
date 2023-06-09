/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller.HomeController;

import com.mycompany.emsa.App;
import com.mycompany.emsa.Context;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class DashboardController implements Initializable {
    @FXML
    public GridPane dashboard;

    @FXML
    public ImageView events;

    @FXML
    public Button logout;

    @FXML
    public ImageView menu;

    @FXML
    public ImageView responsibles;

    @FXML
    public ImageView seating;

    @FXML
    public ImageView tickets;

    @FXML
    public Label user;

    @FXML
    public ImageView users;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
       if (Context.isIsLogIn()) {
            user.setText(Context.getUser().getNombre());
        }
        
        logout.setOnMouseClicked(event -> {
            Context.LogOut();
        });
        
        menu.setOnMouseClicked(event -> {
            App.setRoot("Home");
        });
        
        responsibles.setOnMouseClicked(event -> {
            App.setRoot("Responsable");
        });
        
        events.setOnMouseClicked(event -> {
            App.setRoot("Eventos");
        });
        
        users.setOnMouseClicked(event -> {
            App.setRoot("Usuarios");
        });        
        
        seating.setOnMouseClicked(event -> {
            App.setRoot("Asientos");
        });
    }  


// TODO
    }    
    

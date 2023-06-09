/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller.ResponsableController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class IndexController implements Initializable {

    @FXML
    public TableColumn<?, ?> acciones;

    @FXML
    public Button botoncrearresponsable;

    @FXML
    public TableColumn<?, ?> id;

    @FXML
    public TableColumn<?, ?> nombre;

    @FXML
    public TableView<?> tablaResponsables;

    @FXML
    public TableColumn<?, ?> tipo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

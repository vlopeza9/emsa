/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller.EventosController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import models.eventos;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class IndexController implements Initializable {

    @FXML
    public Button CrearEvento;

    @FXML
    public TableColumn<eventos, Button> acciones;

    @FXML
    public TableColumn<eventos, String> fecha;

    @FXML
    public TableColumn<eventos,Integer> id;

    @FXML
    public TableColumn<eventos,String> nombre;

    @FXML
    public TableColumn<eventos, String> responsable;

    @FXML
    public TableColumn<eventos, String> sinopsis;

    @FXML
    public TableView<eventos> tablaEventos;

    @FXML
    void irACreate(MouseEvent event) {

    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

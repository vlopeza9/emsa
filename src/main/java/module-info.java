module com.mycompany.emsa {
    requires javafx.controls;
    requires java.base;
    requires javafx.fxml;
    exports controller.HomeController;
    exports controller.AuthController;
    exports controller.AsientosController;
    exports controller.EventosController;
    exports controller.PagosController;
    exports controller.UserController;
    exports controller.ResponsableController;
    exports models;
    requires java.sql;
    
    
  
    
    
            
    exports com.mycompany.emsa;
}

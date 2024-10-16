
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yashpatel
 */
public class Controller {
        @FXML
        TextField NameTextField;
    public void submit(ActionEvent event) {
       
        System.out.println("Submitted");
        String name = NameTextField.getText();
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank you");
        alert.setContentText("Submitted"+ name);
        alert.showAndWait();
    }
}

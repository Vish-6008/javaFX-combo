package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable {
	@FXML
	public Label myLabel;
	@FXML
	public ComboBox<String> combobox;
	ObservableList<String> list=FXCollections.observableArrayList("Abhishek","Sanjay","Vijay","Rushab");
	 
	

	@Override
	
	public void initialize(URL location, ResourceBundle resources) {
		combobox.setItems(list);
		// TODO Auto-generated method stub
		
	}
	public void comboChanged(ActionEvent event) {
		//myLabel.setText(combobox.getValue());			//get all existing names or data by clicking combochanged
		
		combobox.getItems().addAll("manju","vishal"); 
	}
	
	public void buttonAction(ActionEvent event) {
		//myLabel.setText(combobox.getValue());			//get all existing names or data
		
		combobox.getItems().addAll("manju","vishal");	//get new list or data by clicking buttonAction
	}


}

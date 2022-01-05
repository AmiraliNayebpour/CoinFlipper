package com.example.coinflipper;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {

    Random random = new Random();

    @FXML
    private TextField FirstPersonSelection;

    @FXML
    private TextField SecondPersonSelection;

    @FXML
    private Button ResultBTN;

    @FXML
    private Label ResultTXT;

    @FXML
    void ResultButton(ActionEvent event) {
        String[] upORdown = {"UP" , "DOWN"};
        int ComSel = random.nextInt(upORdown.length);
        String comSels = upORdown[ComSel];
        String FirstPer = FirstPersonSelection.getText();
        String SecondPer = SecondPersonSelection.getText();
        if (comSels.equalsIgnoreCase(FirstPer)){
            ResultTXT.setText("FirstPersonWin");
        }else if (comSels.equalsIgnoreCase(SecondPer)){
            ResultTXT.setText("SecondPersonWin");
        }

    }

}

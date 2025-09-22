/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 6321596
 */
public class Lab4 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        stage.setTitle("Total Travel Expenses");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        TextField textField8 = new TextField();
        Label label1 = new Label("Number of days on the trip: ");
        Label label2 = new Label("Amount of airfare (if any): ");
        Label label3 = new Label("Amount of car rental fees (if any): ");
        Label label4 = new Label("Number of miles driven (if a private vehicle was used): ");
        Label label5 = new Label("Amount of parking fees (if any): ");
        Label label6 = new Label("Amount of taxi charges (if any): ");
        Label label7 = new Label("Conference or seminar registration fees (if any): ");
        Label label8 = new Label("Lodging charges, per night: "); 
        Label error = new Label("");
        GridPane gp = new GridPane();
        gp.add(label1, 0, 0);
        gp.add(label2, 0, 1);
        gp.add(label3, 0, 2);
        gp.add(label4, 0, 3);
        gp.add(label5, 0, 4);
        gp.add(label6, 0, 5);
        gp.add(label7, 0, 6);
        gp.add(label8, 0, 7);
        gp.add(textField1, 1, 0);
        gp.add(textField2, 1, 1);
        gp.add(textField3, 1, 2);
        gp.add(textField4, 1, 3);
        gp.add(textField5, 1, 4);
        gp.add(textField6, 1, 5);
        gp.add(textField7, 1, 6);
        gp.add(textField8, 1, 7);
        gp.setVgap(10);
        Button clear = new Button("Clear");
        Button enter = new Button("Enter");
        clear.setId("button-clear");
        enter.setId("button-enter");
        enter.setDisable(true);
        textField1.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField2.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField3.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField4.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField5.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField6.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField7.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        textField8.setOnKeyTyped(event -> {
            if (!(textField1.getText().equals("")) && !(textField2.getText().equals("")) && !(textField3.getText().equals("")) && !(textField4.getText().equals("")) && !(textField5.getText().equals("")) && !(textField6.getText().equals("")) && !(textField7.getText().equals("")) && !(textField8.getText().equals(""))) {
                enter.setDisable(false);
            }
            
            else {
                enter.setDisable(true);
            }
            
            
            
        });
        
        enter.setOnKeyTyped(event -> {
            if(check(textField1.getText())) {
                error.setText("Days cannot have letters or spaces.");
                return;
            }
            if(check(textField2.getText())) {
                error.setText("Amount of airfare cannot have letters or spaces.");
                return;
            }
            if(check(textField3.getText())) {
                error.setText("Amount of car rental fees cannot have letters or spaces.");
                return;
            }
            if(check(textField4.getText())) {
                error.setText("Number of miles driven cannot have letters or spaces. ");
                return;
            }
            if(check(textField5.getText())) {
                error.setText("Amount of parking fees cannot have letters or spaces.");
                return;
            }
            if(check(textField6.getText())) {
                error.setText("Amount of taxi charges cannot have letters or spaces.");
                return;
            }
            if(check(textField7.getText())) {
                error.setText("Conference or seminar registration fees cannot have letters or spaces.");
                return;
            }
            if(check(textField8.getText())) {
                error.setText("Lodging charges cannot have letters or spaces.");
                return;
            }
        });
        clear.setOnMouseClicked(event -> {
            textField1.clear();
            textField2.clear();
            textField3.clear();
            textField4.clear();
            textField5.clear();
            textField6.clear();
            textField7.clear();
            textField8.clear();
        });
        VBox vbox = new VBox(gp);
        HBox hbox = new HBox(10, clear, enter);
        VBox vbox1 = new VBox(10, vbox, hbox);
        
        
       Scene scene = new Scene(vbox1, 500, 400);
       scene.getStylesheets().add("style_1.css");
        stage.setScene(scene);
        stage.show();
    }
    
    public static boolean check(String text) {
        if(text.contains(" ")) {
            return true;
        }
        for (int i = 0; i < text.length(); i++) {
            if (('a' <= text.charAt(i) && text.charAt(i) <= 'z') || ('A' <= text.charAt(i) && text.charAt(i) <= 'Z')) {
                return true;
            }
        }
        return false;
    }

}

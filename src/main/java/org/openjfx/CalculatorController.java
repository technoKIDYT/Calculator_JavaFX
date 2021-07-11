package org.openjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    Button btnClear, btnPer, btnDivide, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnThreeZero, btnEquals, btnMultiply, btnPlus, btnMinus;

    @FXML
    Label lblExpr, lblFinalOut;

    private double first;
    private double finalSum;
    private String operator;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblExpr.setText("0");
        lblFinalOut.setText("0");
    }

    public void handleAllOperations(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(btnPlus)) {
            operator = "+";
            first = Float.parseFloat(lblFinalOut.getText());
            lblFinalOut.setText("");
            lblExpr.setText(lblExpr.getText() + operator + Math.round(first));
        } else if (actionEvent.getSource().equals(btnMultiply)) {
            operator = "*";
            first = Float.parseFloat(lblFinalOut.getText());
            lblFinalOut.setText("");
            lblExpr.setText(lblExpr.getText() + operator + Math.round(first));
        } else if (actionEvent.getSource().equals(btnDivide)) {
            operator = "/";
            first = Float.parseFloat(lblFinalOut.getText());
            lblFinalOut.setText("");
            lblExpr.setText(lblExpr.getText() + operator + Math.round(first));
        } else if (actionEvent.getSource().equals(btnMinus)) {
            operator = "-";
            first = Float.parseFloat(lblFinalOut.getText());
            lblFinalOut.setText("");
            lblExpr.setText(lblExpr.getText() + operator + Math.round(first));
        } else if (actionEvent.getSource().equals(btnPer)) {
            first = Float.parseFloat(lblFinalOut.getText());
            operator = "%";
        } else if (actionEvent.getSource().equals(btnOne)) {
            lblFinalOut.setText(lblFinalOut.getText() + "1");
        } else if (actionEvent.getSource().equals(btnTwo)) {
            lblFinalOut.setText(lblFinalOut.getText() + "2");
        } else if (actionEvent.getSource().equals(btnThree)) {
            lblFinalOut.setText(lblFinalOut.getText() + "3");
        } else if (actionEvent.getSource().equals(btnFour)) {
            lblFinalOut.setText(lblFinalOut.getText() + "4");
        } else if (actionEvent.getSource().equals(btnFive)) {
            lblFinalOut.setText(lblFinalOut.getText() + "5");
        } else if (actionEvent.getSource().equals(btnSix)) {
            lblFinalOut.setText(lblFinalOut.getText() + "6");
        } else if (actionEvent.getSource().equals(btnSeven)) {
            lblFinalOut.setText(lblFinalOut.getText() + "7");
        } else if (actionEvent.getSource().equals(btnEight)) {
            lblFinalOut.setText(lblFinalOut.getText() + "8");
        } else if (actionEvent.getSource().equals(btnNine)) {
            lblFinalOut.setText(lblFinalOut.getText() + "9");
        } else if (actionEvent.getSource().equals(btnZero)) {
            lblFinalOut.setText(lblFinalOut.getText() + "0");
        } else if (actionEvent.getSource().equals(btnThreeZero)) {
            lblFinalOut.setText(lblFinalOut.getText() + "000");
        } else if (actionEvent.getSource().equals(btnEquals)) {
            Double second = Double.parseDouble(lblFinalOut.getText());
            switch (operator) {
                case "+":
                    Double finalSum = first + second;
                    lblFinalOut.setText("" + Math.round(finalSum));
                    break;
                case "/":
                    try {
                        finalSum = first / second;
                        lblFinalOut.setText("" + Math.round(finalSum));
                    } catch (Exception exception) {
                        lblFinalOut.setText(exception.getMessage());
                    }
                    break;
                case "*":
                    finalSum = first * second;
                    lblFinalOut.setText("" + Math.round(finalSum));
                    break;
                case "-":
                    finalSum = first - second;
                    lblFinalOut.setText("" + Math.round(finalSum));
                    break;
                case "%":
                    break;
            }
            System.out.println("First Number->" + first + " Second Number ->" + second);
            System.out.println("Final Sum->" + finalSum);
        } else if (actionEvent.getSource().equals(btnClear)) {
            lblExpr.setText("");
            lblFinalOut.setText("0");
            finalSum = 0;
            first = 0;
        }
    }


}

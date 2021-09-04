/*
 * Created by Para_Bellum 2021-06-17.
 * Version 0.11
 * https://www.cbr-xml-daily.ru/ - Курсы валют, API
 */

package sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/* TODO: 1. Закрепить значения валют в кнопках
    2. Значения должны быть взяты по API из https://www.cbr-xml-daily.ru/
 */


public class Controller {
    @FXML
    static String json;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField amount;

    @FXML
    private RadioButton btnUSD;

    @FXML
    private ToggleGroup chooseCurrency;

    @FXML
    private RadioButton btnYEN;

    @FXML
    private Label result;

    @FXML
    private Button convert;

    @FXML
    void initialize() {

        //Сюда записать данные, которые надо взять с сайта и вставить в каждую кнопку нужное значение

        convert.setOnAction(event -> {
                    result.setText("" + (Float.parseFloat(amount.getText()) * (float) (btnUSD.isSelected() ? 76.0 : 0.66)));
                    System.out.println(result);
                    System.out.println(btnUSD);
                    System.out.println(btnYEN);
                    System.out.println(json);
                }
        );
    }
}
/*
 * Created by Para_Bellum 2021-06-12.
 * Version 0.11
 */

package sample;

import com.jayway.jsonpath.JsonPath;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Main extends Application {

   @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Конвертер валют");
        stage.setScene(new Scene(root, 400, 420));
        stage.setResizable(false);
        stage.show();
    }

    private static HttpURLConnection connection;

    public static void main(String[] args) {
        launch(args);
    } {
       //java.net.HttpURLConnection
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            connection = (HttpURLConnection) url.openConnection();

            // Установка Запроса
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            System.out.println(status);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

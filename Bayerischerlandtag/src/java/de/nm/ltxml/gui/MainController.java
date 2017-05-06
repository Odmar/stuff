package de.nm.ltxml.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController extends Application
{

	public static void main(final String[] args)
	{
		launch(args);

	}

	@Override
	public void start(final Stage primaryStage) throws IOException
	{

		// FXML-Datei laden!
		final VBox box = (VBox) FXMLLoader.load(MainController.class.getResource("MainPage.fxml"));

		// Szene
		final Scene scene = new Scene(box);

		scene.getStylesheets().add(MainController.class.getResource("default.css").toExternalForm());

		// Stage konfigurieren
		primaryStage.setResizable(false);

		// Titel setzen
		primaryStage.getIcons().add(new Image(MainController.class.getResourceAsStream("flagge.png")));
		primaryStage.setTitle("Bayrischer Landtag");

		// Szene setzen

		primaryStage.setScene(scene);
		primaryStage.sizeToScene();

		// Stage anzeigen
		primaryStage.show();

	}
}
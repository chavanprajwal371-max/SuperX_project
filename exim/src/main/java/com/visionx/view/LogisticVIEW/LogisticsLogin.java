package com.visionx.view.LogisticVIEW;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LogisticsLogin extends Application {

    private final String blue = "#087FE0";
    private final String navy = "#102F60";

    @Override
    public void start(Stage stage) {

        VBox left = new VBox(20);
        left.setPadding(new Insets(30));
        left.setPrefWidth(600);
        left.setStyle(
            "-fx-background-color: linear-gradient(to bottom right, #07539B, #168DE0);"
        );

        Label logo = new Label("🌐  EX-IM\n       Global Trade Platform");
        logo.setFont(Font.font("Arial", FontWeight.BOLD, 27));
        logo.setTextFill(Color.WHITE);

        Label tagline = new Label("CONNECT  •  TRADE  •  GROW");
        tagline.setTextFill(Color.WHITE);
        tagline.setFont(Font.font(13));

        Label heading = new Label(
            "Your Global Trade\nPartner for a Stronger Tomorrow"
        );
        heading.setFont(Font.font("Arial", FontWeight.BOLD, 27));
        heading.setTextFill(Color.WHITE);
        heading.setWrapText(true);

        Label description = new Label(
            "Bridging exporters, importers, farmers, manufacturers\n" +
            "and logistics partners in one ecosystem. Trade smarter,\n" +
            "move faster, grow globally."
        );
        description.setTextFill(Color.WHITE);
        description.setFont(Font.font(14));
        description.setWrapText(true);

        Label features = new Label(
            "⚓ Import / Export       ◇ Inventory & Sourcing\n\n" +
            "▤ Documentation       🚚 Logistics & Supply Chain\n\n" +
            "🛡 Risk Protection & Insurance"
        );
        features.setTextFill(Color.WHITE);
        features.setFont(Font.font(14));

        ImageView imageView = new ImageView("assets\\image\\Truck image.png");
        imageView.setFitWidth(540);
        imageView.setFitHeight(290);
        imageView.setPreserveRatio(false);

        StackPane imageArea = new StackPane(imageView);
        imageArea.setMinHeight(290);
        imageArea.setStyle(
            "-fx-background-color: #7DBCE8; " +
            "-fx-background-radius: 12;"
        );
        VBox.setVgrow(imageArea, Priority.ALWAYS);

        left.getChildren().addAll(
            logo, tagline, heading, description, features, imageArea
        );

        VBox right = new VBox(16);
        right.setPadding(new Insets(40));
        right.setPrefWidth(600);
        right.setAlignment(Pos.CENTER_LEFT);
        right.setStyle("-fx-background-color: #FFFFFF;");

        Label back = new Label("←  Back to Portal");
        back.setTextFill(Color.web(blue));
        back.setFont(Font.font(14));
        back.setMaxWidth(Double.MAX_VALUE);
        back.setAlignment(Pos.CENTER_RIGHT);

        Label icon = new Label("🚚");
        icon.setFont(Font.font(32));
        icon.setPadding(new Insets(10));
        icon.setStyle(
            "-fx-background-color: #E1F2FF; -fx-background-radius: 12;"
        );

        Label title = new Label("Logistics Login");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 34));
        title.setTextFill(Color.web(navy));

        Label welcome = new Label(
            "Welcome back! Sign in to your logistics account."
        );
        welcome.setFont(Font.font(14));
        welcome.setTextFill(Color.web("#56749D"));
        welcome.setWrapText(true);

        Label emailLabel = new Label("Business Email");
        emailLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        emailLabel.setTextFill(Color.web(navy));

        TextField email = new TextField();
        email.setPromptText("✉   you@company.com");
        email.setPrefHeight(48);
        email.setStyle(fieldStyle());

        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        passwordLabel.setTextFill(Color.web(navy));

        PasswordField password = new PasswordField();
        password.setPromptText("Enter your password");
        password.setPrefHeight(48);
        password.setStyle(fieldStyle());

        CheckBox showPassword = new CheckBox("Show password");
        showPassword.setTextFill(Color.web("#56749D"));

        Label forgot = new Label("Forgot password?");
        forgot.setTextFill(Color.web(blue));

        HBox passwordOptions = new HBox(10, showPassword, forgot);
        passwordOptions.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(showPassword, Priority.ALWAYS);

        Button signIn = new Button("↪   Sign In");
        signIn.setMaxWidth(Double.MAX_VALUE);
        signIn.setPrefHeight(52);
        signIn.setFont(Font.font("Arial", FontWeight.BOLD, 17));
        signIn.setTextFill(Color.WHITE);
        signIn.setStyle(
            "-fx-background-color: " + blue + ";" +
            "-fx-background-radius: 9; -fx-cursor: hand;"
        );

        Label or = new Label("──────────────   OR   ──────────────");
        or.setTextFill(Color.web("#6681A3"));
        or.setMaxWidth(Double.MAX_VALUE);
        or.setAlignment(Pos.CENTER);

        Label accountText = new Label(
            "♙   New to EX-IM Global Trade Platform?\n" +
            "       Create your logistics account"
        );
        accountText.setTextFill(Color.web(navy));
        accountText.setFont(Font.font(13));
        accountText.setPadding(new Insets(16));
        accountText.setMaxWidth(Double.MAX_VALUE);
        accountText.setStyle(
            "-fx-background-color: #E8F5FF; -fx-background-radius: 10;"
        );

        right.getChildren().addAll(
            back, icon, title, welcome,
            emailLabel, email,
            passwordLabel, password,
            passwordOptions, signIn, or, accountText
        );

        HBox main = new HBox(left, right);
        main.setMaxWidth(1200);
        main.setMaxHeight(720);
        main.setStyle(
            "-fx-background-color: white; -fx-background-radius: 18;"
        );
        main.setClip(new javafx.scene.shape.Rectangle(1200, 720, 18, 18));

        StackPane root = new StackPane(main);
        root.setPadding(new Insets(25));
        root.setStyle("-fx-background-color: #EDF7FF;");

        Scene scene = new Scene(root, 1250, 770);

        stage.setTitle("EX-IM Global Trade Platform - Logistics Login");
        stage.setScene(scene);
        stage.show();
    }

    private String fieldStyle() {
        return "-fx-background-color: white;" +
               "-fx-border-color: #C8DDF2;" +
               "-fx-border-radius: 8;" +
               "-fx-background-radius: 8;" +
               "-fx-font-size: 14;";
    }

    public static void main(String[] args) {
        launch(args);
    }
}

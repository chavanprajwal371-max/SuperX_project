package com.visionx.view.LogisticVIEW;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogisticsLogin extends Application {

    public Scene LogisticsLogin;

    String emailID;
    String Password;

    @Override
    public void start(Stage stage) {
        stage.setScene(getLogisticsLoginScene(() -> {}));
        stage.setTitle("Global Trade - Logistics Login");
        stage.show();
    }

    public Scene getLogisticsLoginScene(Runnable backtoHome) {

        System.out.println("In Logistics Login Page");

        Text logo = new Text("GLOBAL TRADE");
        logo.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-fill: white;");

        Text tagline = new Text("CONNECT  •  TRADE  •  GROW");
        tagline.setStyle("-fx-font-size: 13px; -fx-fill: white;");

        Text heading1 = new Text("Logistics Partner for a");
        heading1.setStyle("-fx-font-size: 29px; -fx-font-weight: bold; -fx-fill: white;");

        Text heading2 = new Text("Seamless Supply Chain");
        heading2.setStyle("-fx-font-size: 29px; -fx-font-weight: bold; -fx-fill: #67E4F5;");

        Text description = new Text(
                "From manufacturer to port, we keep your\n" +
                "goods moving. Manage logistics operations,\n" +
                "track shipments and enable global trade."
        );
        description.setStyle("-fx-font-size: 16px; -fx-fill: white;");

        Text features = new Text(
                "Transport Management       Container Handling       Port Operations"
        );
        features.setStyle("-fx-font-size: 13px; -fx-fill: white;");


        VBox imageBox = new VBox();
        imageBox.setMinHeight(200);
        imageBox.setStyle("-fx-background-color: transparent;");
        VBox.setVgrow(imageBox, Priority.ALWAYS);

        VBox left = new VBox(
                //12, logo, tagline, heading1, heading2,
                //description, features, imageBox
               
        );

        left.setPadding(new Insets(40));
        left.setPrefWidth(600);
        left.setMinWidth(600);
        left.setStyle(
                "-fx-background-color: linear-gradient(to bottom right, #07539B, #168DE0);"
        );

        Text backText = new Text("←  Back to Portal");
        backText.setStyle("-fx-font-size: 14px; -fx-fill: #087FE0;");
        backText.setOnMouseClicked(e -> backtoHome.run());

        HBox backBox = new HBox(backText);
        backBox.setAlignment(Pos.CENTER_RIGHT);

        Text title = new Text("Logistics Login");
        title.setStyle("-fx-font-size: 34px; -fx-font-weight: bold; -fx-fill: #102F60;");

        Text welcome = new Text(
                "Welcome back! Sign in to your logistics account."
        );
        welcome.setStyle("-fx-font-size: 14px; -fx-fill: #56749D;");

        Text emailtx = new Text("Business Email");
        emailtx.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-fill: #102F60;");

        TextField emailField = new TextField();
        emailField.setPromptText("you@company.com");
        emailField.setPrefHeight(48);
        emailField.setStyle(fieldStyle());

        Text passtx = new Text("Password");
        passtx.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-fill: #102F60;");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setPrefHeight(48);
        passwordField.setStyle(fieldStyle());

        TextField visiblePassword = new TextField();
        visiblePassword.setPromptText("Enter your password");
        visiblePassword.setPrefHeight(48);
        visiblePassword.setStyle(fieldStyle());
        visiblePassword.setVisible(false);
        visiblePassword.setManaged(false);

        CheckBox showPassword = new CheckBox("Show password");
        showPassword.setTextFill(Color.web("#56749D"));

        showPassword.setOnAction(e -> {
            if (showPassword.isSelected()) {
                visiblePassword.setText(passwordField.getText());
                passwordField.setVisible(false);
                passwordField.setManaged(false);
                visiblePassword.setVisible(true);
                visiblePassword.setManaged(true);
            } else {
                passwordField.setText(visiblePassword.getText());
                visiblePassword.setVisible(false);
                visiblePassword.setManaged(false);
                passwordField.setVisible(true);
                passwordField.setManaged(true);
            }
        });

        Text forgot = new Text("Forgot password?");
        forgot.setStyle("-fx-fill: #087FE0; -fx-font-size: 13px;");

        HBox passwordOptions = new HBox(10, showPassword, forgot);
        passwordOptions.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(showPassword, Priority.ALWAYS);

        Button signIn = new Button("Sign In");
        signIn.setPrefHeight(52);
        signIn.setMaxWidth(Double.MAX_VALUE);
        signIn.setFont(Font.font("Arial", FontWeight.BOLD, 17));
        signIn.setTextFill(Color.WHITE);
        signIn.setStyle(
                "-fx-background-color: #087FE0;" +
                "-fx-background-radius: 8;" +
                "-fx-cursor: hand;"
        );

        signIn.setOnAction(e -> {
            emailID = emailField.getText();
            Password = showPassword.isSelected()
                    ? visiblePassword.getText()
                    : passwordField.getText();

            System.out.println("Login button clicked");
        });

        Text or = new Text("──────────────   OR   ──────────────");
        or.setStyle("-fx-font-size: 13px; -fx-fill: #6681A3;");

        HBox orBox = new HBox(or);
        orBox.setAlignment(Pos.CENTER);

        Text accountText = new Text(
                "New to Global Trade?\nCreate your logistics account"
        );
        accountText.setStyle("-fx-font-size: 13px; -fx-fill: #102F60;");

        Button createAccount = new Button("Create Account");
        createAccount.setStyle(
                "-fx-background-color: transparent;" +
                "-fx-text-fill: #087FE0;" +
                "-fx-cursor: hand;"
        );

        HBox accountBox = new HBox(10, accountText, createAccount);
        accountBox.setPadding(new Insets(16));
        accountBox.setAlignment(Pos.CENTER_LEFT);
        accountBox.setStyle(
                "-fx-background-color: #E8F5FF;" +
                "-fx-background-radius: 10;"
        );
        HBox.setHgrow(accountText, Priority.ALWAYS);

        VBox right = new VBox(
                16, backBox, title, welcome,
                emailtx, emailField, passtx,
                passwordField, visiblePassword,
                passwordOptions, signIn, orBox, accountBox
        );

        right.setPadding(new Insets(40));
        right.setPrefWidth(600);
        right.setMinWidth(600);
        right.setAlignment(Pos.CENTER_LEFT);
        right.setStyle("-fx-background-color: white;");

        HBox main = new HBox(left, right);
        main.setPrefSize(1200, 720);
        main.setMinSize(1200, 720);

        StackPane root = new StackPane(main);
        root.setPadding(new Insets(25));
        root.setStyle("-fx-background-color: #EDF7FF;");

        Scene sc = new Scene(root, 1250, 770);

        LogisticsLogin = sc;
        return LogisticsLogin;
    }

    private String fieldStyle() {
        return "-fx-background-color: white;" +
               "-fx-border-color: #C8DDF2;" +
               "-fx-border-radius: 8;" +
               "-fx-background-radius: 8;" +
               "-fx-font-size: 14px;";
    }

    public static void main(String[] args) {
        launch(args);
    }
}

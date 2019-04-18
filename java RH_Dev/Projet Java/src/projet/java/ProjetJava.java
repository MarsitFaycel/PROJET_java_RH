/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;


import DAO.DAOFacture;
import DAO.DAOGRH;
import DAO.DAOPersonnel;
import Entite.Facture;
import Entite.Personnel;
import com.calendarfx.model.Calendar;
import com.calendarfx.model.CalendarSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import com.calendarfx.model.Calendar;
import com.calendarfx.model.Calendar.Style;
import com.calendarfx.model.CalendarSource;
import com.calendarfx.view.CalendarView;
import java.util.function.Predicate;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;





/**
 *
 * @author OmaR
 */
public class ProjetJava extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        launch(args);
      
        
    }
    Scene scene1,scene2,scene3,scenePersonnel,sceneAjouterPersonnel,sceneCalendrier,scenMail;
    //private TableView<Personnel> table = new TableView<Personnel>();
        @Override
    public void start(Stage primaryStage) throws Exception {
        //To change body of generated methods, choose Tools | Templates.
        
        //edit stage
        primaryStage.setTitle("SMART IT PARTNER");
        
        
        //create borderpane
            BorderPane borderPane = new BorderPane();
            
            //create scene 780*438 acceuil
            
            scene1= new Scene(borderPane, 780, 438);
        
        
            //VBox vBox1=new VBox();vBox1.setPadding(new Insets(10));vBox1.setSpacing(10);
            HBox hbox1=new HBox();hbox1.setPadding(new Insets(10));hbox1.setSpacing(10);
            //button1
            
            String location= new String("C:\\Users\\heisenberg\\Desktop\\java RH\\Projet Java\\src");
            
            //image
            FileInputStream input1=new FileInputStream(location+"\\image\\user.png");
            Image image1=new Image(input1);
            ImageView imageView1 = new ImageView(image1);
            Button button1=new Button("Responsable RH",imageView1);
            button1.setMinSize(389,371);

            //action button 1
            
            button1.setOnAction(e->primaryStage.setScene(scene2));
            
            
            
            
            
            //button2
            FileInputStream input2=new FileInputStream(location+"\\image\\team.png");
            Image image2=new Image(input2);
            ImageView imageView2 = new ImageView(image2);
            Button button2=new Button("Employee",imageView2);
            button2.setMinSize(389,371);
             
             
            hbox1.getChildren().addAll(button1,button2);                   
            borderPane.setTop(hbox1);
            
                    
            
            
            
           //add scene to primary
           primaryStage.setScene(scene1);
           
           
           
           
           
           //scene2 autentification
          GridPane gridpane=new GridPane();gridpane.setAlignment(Pos.CENTER);
          gridpane.setHgap(10);
          gridpane.setVgap(10);
          gridpane.setPadding(new Insets(25));
          
          
         
            Label label=new Label("login");
            TextField textField=new TextField();
            
                  
                       
            Label labelpass=new Label("mot de passe");
            PasswordField passwordField=new PasswordField();
           
            
            
            gridpane.add(label, 0, 3);
            gridpane.add(textField, 1, 3);
            gridpane.add(labelpass, 0, 4);
            gridpane.add(passwordField, 1, 4);

           
          
            
            //ok
            Button btnok = new Button("ok");btnok.setMinSize(320, 20);
          final Text actiontarget = new Text();
        gridpane.add(actiontarget, 1, 6);
            
           // btnok.setOnAction(e1->primaryStage.setScene(scene3));
                       btnok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DAOGRH daogrh =new DAOGRH();
               int x= daogrh.verifier(textField.getText() , passwordField.getText());
                if (x == 1){
                    primaryStage.setScene(scene3);
                }
                else{
                    actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Vérifier mot de passe ou login");
                }
            }
        });
 
            HBox hbBtnreset = new HBox();
            hbBtnreset.setAlignment(Pos.BOTTOM_LEFT);
            hbBtnreset.getChildren().add(btnok);
            gridpane.add(hbBtnreset, 1, 5);
             FileInputStream inputSmart=new FileInputStream(location+"\\image\\smart.png");
            Image imageSmart=new Image(inputSmart);
            ImageView imageViewSmart = new ImageView(imageSmart);
           gridpane.add(imageViewSmart, 0, 1,2,1);

           
            
            scene2=new Scene(gridpane, 780, 438); 
            
            

            //acceuil respnsable scene3
               GridPane gridPaneAcceuilRH=new GridPane();
               Button btnPersonnel = new Button("Personnel");
               btnPersonnel.setMinSize(161, 102);
            btnPersonnel.setOnAction(e1->primaryStage.setScene(scenePersonnel));
            HBox hbBPersonnel = new HBox();hbBPersonnel.setPadding(new Insets(50, 100, 50, 100));
            hbBPersonnel.setAlignment(Pos.CENTER);
            hbBPersonnel.getChildren().add(btnPersonnel);
            gridPaneAcceuilRH.add(hbBPersonnel, 0, 1);
            
            Button btnFacture=new Button("Facture");btnFacture.setMinSize(161, 102);
            HBox hbxFacture=new HBox();hbxFacture.setPadding(new Insets(50, 100, 50, 100));
            hbxFacture.getChildren().add(btnFacture);
            gridPaneAcceuilRH.add(hbxFacture, 6, 1);
            
            Button btnClendar=new Button("Calandrier");btnClendar.setMinSize(161, 102);
            btnClendar.setOnAction(e->primaryStage.setScene(sceneCalendrier));
            HBox hboxCalendar=new HBox();hboxCalendar.setPadding(new Insets(50, 100, 50, 100));
            hboxCalendar.getChildren().add(btnClendar);
            gridPaneAcceuilRH.add(hboxCalendar,0,3);
            
            Button btnMission=new Button("Mission");btnMission.setMinSize(161, 102);
            HBox hboxMission=new HBox();hboxMission.setPadding(new Insets(50, 100, 50, 100));
            hboxMission.getChildren().add(btnMission);
            gridPaneAcceuilRH.add(hboxMission,6,3);
            
                    

               
            scene3=new Scene(gridPaneAcceuilRH,780,438);
            
            
            TableView<Personnel> table=new TableView();
            //scene personnel
            GridPane gridPanePersonnel=new GridPane();
            gridPanePersonnel.setVgap(20);
            gridPanePersonnel.setHgap(20);
            gridPanePersonnel.setPadding(new Insets(25));
            gridPanePersonnel.getColumnConstraints().addAll(new ColumnConstraints(600),new ColumnConstraints(200));
            Button btnadd=new Button("ajouter");btnadd.setMinSize(100, 100);btnadd.setPadding(new Insets(10));
            btnadd.setOnAction(e2->primaryStage.setScene(sceneAjouterPersonnel));
            
            Button btnemail=new Button("email");btnemail.setMinSize(100, 100);
            btnemail.setOnAction(e1->primaryStage.setScene(scenMail));
            
            
            Button btnsupp=new Button("supprimer");btnsupp.setMinSize(100, 100);
            btnsupp.setOnAction(e->{ Personnel selectedItem = table.getSelectionModel().getSelectedItem();
                DAOPersonnel daop=new DAOPersonnel();
                daop.supprimerEmploye(selectedItem.getId());
                table.getItems().remove(selectedItem);
            
            });
            
            Button btnexit=new Button("quitter");btnexit.setMinSize(100, 50);
            btnexit.setOnAction(e1->primaryStage.setScene(scene3));

            
            VBox vboxZone1=new VBox();vboxZone1.setSpacing(15);
            vboxZone1.getChildren().addAll(btnadd,btnemail,btnsupp,btnexit);
            gridPanePersonnel.add(vboxZone1,1,0);
            
            
            
            /*
            TextField textsearch=new TextField("recherche");textsearch.setMinSize(20, 30);
            HBox hboxZone2=new HBox();hboxZone2.setPadding(new Insets(50, 0, 0, 200));
            hboxZone2.getChildren().add(textsearch);
            gridPanePersonnel.add(hboxZone2, 0, 0);*/
            
            VBox vboxZon3=new VBox();vboxZon3.setSpacing(10);
            TextField textsearch=new TextField();textsearch.setMinSize(20, 30);textsearch.setPromptText("recherche");
            
            //ListView<String> listViewPersonnel=new ListView<>();listViewPersonnel.setMinSize(300, 300);
            
            //tableau
            
            
            ObservableList<Personnel> data= FXCollections.observableArrayList(
            );
            
            
            try {
                String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
            ResultSet res= statement.executeQuery("select * from employe ");
            while (res.next()) { 
                Personnel p=new Personnel("", "", res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getInt(5), res.getString(6));
                        data.add(p);
            }
            } catch (SQLException ex) {
                System.out.printf(ex.getMessage());

            }
            
           
            
            
            table.setEditable(true);
            Callback<TableColumn, TableCell> cellFactory =
             new Callback<TableColumn, TableCell>() {
                 public TableCell call(TableColumn p) {
                    return new EditingCell();
                 }
             };
            
            TableColumn nomColumn=new TableColumn("nom");
            nomColumn.setCellValueFactory(new PropertyValueFactory<Personnel,String>("nom"));
            nomColumn.setCellFactory(cellFactory);
            nomColumn.setOnEditCommit(new EventHandler<CellEditEvent<Personnel,String>>() {
            @Override
            public void handle(CellEditEvent<Personnel,String> t ) {
                DAOPersonnel daop=new DAOPersonnel();
                 daop.supprimerEmploye(((Personnel) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).getId());
                ((Personnel) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setNom(t.getNewValue());
                
                daop.addPersonnel(((Personnel) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ));
            }
        });
            
            
            
            
            TableColumn prenomColumn=new TableColumn("prenom");
            prenomColumn.setCellValueFactory(new PropertyValueFactory<Personnel,String>("prenom"));
            prenomColumn.setCellFactory(cellFactory);
            prenomColumn.setOnEditCommit(new EventHandler<CellEditEvent<Personnel,String>>() {
            @Override
            public void handle(CellEditEvent<Personnel,String> t ) {
                DAOPersonnel daop=new DAOPersonnel();
                 daop.supprimerEmploye(((Personnel) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).getId());
                ((Personnel) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setPrenom(t.getNewValue());
                
                daop.addPersonnel(((Personnel) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ));
            }
        });
            
            
            
            TableColumn telColumn=new TableColumn("tel");
            telColumn.setCellValueFactory(new PropertyValueFactory<Personnel,String>("tel"));
            
            
            
            TableColumn adresseColumn=new TableColumn("adresse");
            adresseColumn.setCellValueFactory(new PropertyValueFactory<Personnel,String>("adresse"));
            
            TableColumn emailColumn=new TableColumn("email");
            emailColumn.setCellValueFactory(new PropertyValueFactory<Personnel,String>("email"));
            
            TableColumn idColumn=new TableColumn("idEmploye");
            idColumn.setCellValueFactory(new PropertyValueFactory<Personnel,String>("id"));
            idColumn.setVisible(false);
            //!!!!!!!
            table.setItems(data);
            table.getColumns().addAll(nomColumn,prenomColumn,telColumn,adresseColumn,emailColumn,idColumn);
            
           
            vboxZon3.getChildren().addAll(textsearch,table);
            gridPanePersonnel.add(vboxZon3,0,0);
            
            //recherche
            FilteredList<Personnel> filteredList = new FilteredList<>(data,e->true);
            textsearch.setOnKeyReleased(e->{
                textsearch.textProperty().addListener(((observableValue, oldValue, newValue) -> {
                    filteredList.setPredicate((Predicate<? super Personnel>) personnel->{
                        if(newValue == null || newValue.isEmpty()){
                            return true;
                            
                        }
                        String lowercasefiltring= newValue.toLowerCase();
                        if(personnel.getNom().contains(newValue)){
                            return true;
                            
                            
                        }else if(personnel.getPrenom().toLowerCase().contains(lowercasefiltring)){
                            return true;
                        }else if(personnel.getNom().toLowerCase().contains(lowercasefiltring)){
                            return true; 
                        }
                        return false;
                    });
                    
                
                }));
                SortedList<Personnel> sortedData= new SortedList<>(filteredList);
                sortedData.comparatorProperty().bind(table.comparatorProperty());
                table.setItems(sortedData);
            });
            
            
            scenePersonnel=new Scene(gridPanePersonnel,780,438);
            
            
            
            
            //jouter personnel
            GridPane gridPaneAjouterPersonel=new GridPane();
            Label labelnom=new Label("nom");
            TextField textFieldnom=new TextField();
            
            Label labelprenom=new Label("prenom");
            TextField textFieldprenom=new TextField();

            Label labeladresse=new Label("adresse");
            TextField textFieldadresse=new TextField();

            Label labeltel=new Label("tel");
            TextField textFieldtel=new TextField();
            textFieldtel.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 if (!newValue.matches("\\d{0,8}([\\.]\\d{0,4})?")) {
                    textFieldtel.setText(oldValue);
                }
            }
        });
            

            Label labelemail=new Label("email");
            TextField textFieldemail=new TextField();

            Label labellogin=new Label("login");
            TextField textFieldlogin=new TextField();

            Label labelmdp=new Label("mdp");
            TextField textFieldmdp=new TextField();
            
            VBox vBoxajouterPersonnel=new VBox();
            vBoxajouterPersonnel.getChildren().addAll(labelnom,textFieldnom,labelprenom,textFieldprenom,labeladresse,textFieldadresse,labeltel,textFieldtel,labelemail,textFieldemail,labellogin,textFieldlogin,labelmdp,textFieldmdp);
            gridPaneAjouterPersonel.setAlignment(Pos.CENTER);
            //gridPaneAjouterPersonel.setHgap(10);
            gridPaneAjouterPersonel.setVgap(10);

            gridPaneAjouterPersonel.add(vBoxajouterPersonnel,0,0);
            
            Button btnok1=new Button("ok");btnok1.setMinSize(50, 20);
            //action button ok
            btnok1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            Integer val=Integer.valueOf(textFieldtel.getText());
                
                Personnel p=new Personnel(textFieldlogin.getText(), textFieldmdp.getText(), textFieldnom.getText(), textFieldprenom.getText(), textFieldadresse.getText(), val, textFieldemail.getText());
                DAOPersonnel dAOPersonnel=new DAOPersonnel();
                dAOPersonnel.addPersonnel(p);
                                textFieldnom.clear();
                                textFieldprenom.clear();
                                textFieldadresse.clear();
                                textFieldtel.clear();
                                textFieldemail.clear();
                                textFieldlogin.clear();
                                textFieldmdp.clear();
                data.add(p);
                primaryStage.setScene(scenePersonnel);
            }
        }
            
            
            );
            
            Button btnreset1=new Button("retour");btnreset1.setMinSize(50, 20);
            btnreset1.setOnAction(e1->primaryStage.setScene(scenePersonnel));
            HBox hbajouterPers=new HBox();hbajouterPers.setSpacing(48);
            hbajouterPers.getChildren().addAll(btnok1,btnreset1);
            gridPaneAjouterPersonel.add(hbajouterPers,0,1);
            
            sceneAjouterPersonnel =new Scene(gridPaneAjouterPersonel,780,438);
            
            
            
            
            
            //calendrier
            
            GridPane gridPaneCal=new GridPane();
            CalendarView calendarView=new CalendarView();
            Calendar b=new Calendar("travail");
            b.setStyle(Style.STYLE2);
            CalendarSource myCalendarSource = new CalendarSource("My Calendars");
           
            FileInputStream input3=new FileInputStream(location+"\\image\\xx.png");
            Image image3=new Image(input3);
            ImageView imageView3 = new ImageView(image3);
             Button buttonexit=new Button("",imageView3);buttonexit.setMinSize(30, 30);
             buttonexit.setOnAction(e1->primaryStage.setScene(scene3));
            myCalendarSource.getCalendars().addAll(b);

                calendarView.getCalendarSources().addAll(myCalendarSource); 
                    
           gridPaneCal.add(buttonexit,0,1);
                      gridPaneCal.add(calendarView,0,2);

             
            
            sceneCalendrier=new Scene(gridPaneCal,780,438);
           
            
            //mail
            
            GridPane gridPaneMail=new GridPane();
           
            
            TextField textFieldMail=new TextField();textFieldMail.setPromptText("email");textFieldMail.setMinSize(120, 20);
            
            TextField textFieldMailMessage=new TextField();textFieldMailMessage.setPromptText("message");
            textFieldMailMessage.setMinHeight(300);
                        textFieldMailMessage.setMinWidth(300);
                        

            Button btnsend=new Button("envoyer");btnsend.setMinSize(120, 20);
            
            
            
            gridPaneMail.add(textFieldMail, 1, 1);
            
            gridPaneMail.add(textFieldMailMessage, 1, 2);
            gridPaneMail.add(btnsend,1,3);
            gridPaneMail.setVgap(20);
            

            gridPaneMail.setAlignment(Pos.CENTER);
            
            btnsend.setOnAction(e->{
            Mailer mailer=new Mailer();
            mailer.send("projetrhitfi@gmail.com", "Omar1111", textFieldMail.getText(), "Message RH", textFieldMailMessage.getText());
               //"medomarboubakri@gmail.com" 
            primaryStage.setScene(scene3);
            });
            
            scenMail=new Scene(gridPaneMail, 780, 480);
           
           
        //afficher stage
        primaryStage.show();
        
    }

    private static class EditingCell extends TableCell<Personnel,String> {

        private TextField textField;
        
        
        public EditingCell() {
        }
        
         @Override
        public void startEdit() {
            if (!isEmpty()) {
                super.startEdit();
                createTextField();
                setText(null);
                setGraphic(textField);
                textField.selectAll();
            }
        }
        @Override
        public void cancelEdit() {
            super.cancelEdit();
 
            setText((String) getItem());
            setGraphic(null);
        }
 
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
 
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        }
 
        private void createTextField() {
            textField = new TextField(getString());
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()* 2);
            textField.focusedProperty().addListener(new ChangeListener<Boolean>(){
                @Override
                public void changed(ObservableValue<? extends Boolean> arg0, 
                    Boolean arg1, Boolean arg2) {
                        if (!arg2) {
                            commitEdit(textField.getText());
                        }
                }
            });
        }
 
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    }
}
    




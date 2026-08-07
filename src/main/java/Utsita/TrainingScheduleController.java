package Utsita;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.TrainingSchedule;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

public class TrainingScheduleController {

    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> trainerComboBox;
    @javafx.fxml.FXML
    private DatePicker sessionDateDatePicker;
    @javafx.fxml.FXML
    private TextField venueTextField;
    @javafx.fxml.FXML
    private TextField startTimeTextField;

    @javafx.fxml.FXML
    private TableView<TrainingSchedule> trainingSessionTableView;

    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule,String> sessionIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule,String> programNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule,String> traInerTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule,java.time.LocalDate> daTeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule,String> TiMeTableColumn;


    @javafx.fxml.FXML
    public void initialize(){

        trainingProgramComboBox.getItems().addAll(
                "Java Programming",
                "Python",
                "Web Development",
                "Data Analytics"
        );

        trainerComboBox.getItems().addAll(
                "Trainer A",
                "Trainer B",
                "Trainer C"
        );

        sessionIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("sessionId"));

        programNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("programName"));

        traInerTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trainer"));

        daTeTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        TiMeTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("time"));
    }


    @javafx.fxml.FXML
    public void saveButton(ActionEvent event) {

        if(trainingProgramComboBox.getValue()==null ||
                trainerComboBox.getValue()==null ||
                sessionDateDatePicker.getValue()==null ||
                venueTextField.getText().isEmpty() ||
                startTimeTextField.getText().isEmpty()){

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all fields."
            );
            return;
        }

        TrainingSchedule schedule =
                new TrainingSchedule(

                        String.valueOf(
                                trainingSessionTableView.getItems().size()+1
                        ),

                        trainingProgramComboBox.getValue(),

                        trainerComboBox.getValue(),

                        sessionDateDatePicker.getValue(),

                        startTimeTextField.getText(),

                        venueTextField.getText()
                );

        trainingSessionTableView.getItems().add(schedule);

        AlertGenerator.showInformationAlert(
                "Saved",
                "Training session scheduled successfully."
        );
    }


    @javafx.fxml.FXML
    public void updateButton(ActionEvent event){

        TrainingSchedule selected =
                trainingSessionTableView.getSelectionModel().getSelectedItem();

        if(selected==null){

            AlertGenerator.showWarningAlert(
                    "No Selection",
                    "Please select a training session."
            );
            return;
        }

        selected.setProgramName(
                trainingProgramComboBox.getValue());

        selected.setTrainer(
                trainerComboBox.getValue());

        selected.setDate(
                sessionDateDatePicker.getValue());

        selected.setTime(
                startTimeTextField.getText());

        selected.setVenue(
                venueTextField.getText());

        trainingSessionTableView.refresh();

        AlertGenerator.showInformationAlert(
                "Updated",
                "Training session updated successfully."
        );
    }


    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent){

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/TrainingCoordinator/TrainingCoordinatorDashboard.fxml"
        );
    }

}
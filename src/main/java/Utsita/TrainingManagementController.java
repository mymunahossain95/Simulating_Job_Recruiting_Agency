package Utsita;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import nonuser.TrainingManagement;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class TrainingManagementController {

    @javafx.fxml.FXML
    private TextField programNameTextField;
    @javafx.fxml.FXML
    private TextField searChTextField;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> cateGoryComboBox;

    @javafx.fxml.FXML
    private TableView<TrainingManagement> trainingProgramTableView;

    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,String> programIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,String> programNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,String> cateGoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,java.time.LocalDate> startDateTableColumn;


    @javafx.fxml.FXML
    public void initialize(){

        cateGoryComboBox.getItems().addAll(
                "Technical",
                "Soft Skills",
                "Management",
                "Communication"
        );

        programIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("programId"));

        programNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("programName"));

        cateGoryTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("category"));

        startDateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("startDate"));

        ObservableList<TrainingManagement> list =
                databaseAccessor.readObject("TrainingProgram.bin");

        if(list!=null){
            trainingProgramTableView.setItems(list);
        }
    }


    @javafx.fxml.FXML
    public void addButton(ActionEvent event){

        if(programNameTextField.getText().isEmpty()
                || startDateDatePicker.getValue()==null
                || cateGoryComboBox.getValue()==null){

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all fields."
            );
            return;
        }

        TrainingManagement program =
                new TrainingManagement(

                        String.valueOf(
                                trainingProgramTableView.getItems().size()+1
                        ),

                        programNameTextField.getText(),

                        cateGoryComboBox.getValue(),

                        startDateDatePicker.getValue()
                );

        trainingProgramTableView.getItems().add(program);

        databaseAccessor.writeObject(
                "TrainingProgram.bin",
                trainingProgramTableView.getItems()
        );

        AlertGenerator.showInformationAlert(
                "Success",
                "Training program added successfully."
        );
    }


    @javafx.fxml.FXML
    public void updateButton(ActionEvent event){

        TrainingManagement selected =
                trainingProgramTableView.getSelectionModel().getSelectedItem();

        if(selected==null){

            AlertGenerator.showWarningAlert(
                    "No Selection",
                    "Please select a training program."
            );
            return;
        }

        selected.setProgramName(
                programNameTextField.getText());

        selected.setCategory(
                cateGoryComboBox.getValue());

        selected.setStartDate(
                startDateDatePicker.getValue());

        trainingProgramTableView.refresh();

        databaseAccessor.writeObject(
                "TrainingProgram.bin",
                trainingProgramTableView.getItems()
        );

        AlertGenerator.showInformationAlert(
                "Updated",
                "Training program updated successfully."
        );
    }


    @javafx.fxml.FXML
    public void deleteButton(ActionEvent event){

        TrainingManagement selected =
                trainingProgramTableView.getSelectionModel().getSelectedItem();

        if(selected==null){

            AlertGenerator.showWarningAlert(
                    "No Selection",
                    "Please select a training program."
            );
            return;
        }

        trainingProgramTableView.getItems().remove(selected);

        databaseAccessor.writeObject(
                "TrainingProgram.bin",
                trainingProgramTableView.getItems()
        );

        AlertGenerator.showInformationAlert(
                "Deleted",
                "Training program deleted successfully."
        );
    }


    @javafx.fxml.FXML
    public void searchButton(ActionEvent event){

        String search =
                searChTextField.getText().toLowerCase();

        ObservableList<TrainingManagement> list =
                databaseAccessor.readObject("TrainingProgram.bin");

        trainingProgramTableView.getItems().clear();

        for(TrainingManagement program : list){

            if(program.getProgramName().toLowerCase().contains(search)){

                trainingProgramTableView.getItems().add(program);
            }
        }
    }


    @javafx.fxml.FXML
    public void homeButton(ActionEvent event){

        SceneSwitchingHelper.switchScene(
                event,
                "/TrainingCoordinator/TrainingCoordinatorDashboard.fxml"
        );
    }

}

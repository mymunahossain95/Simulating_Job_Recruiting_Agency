package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.AssignCandidates;
import nonuser.Candidate;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class AssignCandidatesController {

    @javafx.fxml.FXML
    private TextField searchCandidateTextField;
    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramComboBox;
    @javafx.fxml.FXML
    private TableView<AssignCandidates> assignCandidatesTableView;
    @javafx.fxml.FXML
    private TableColumn<AssignCandidates,String> candidateIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignCandidates,String> candidateNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignCandidates,String> skillsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignCandidates,String> statusTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        trainingProgramComboBox.getItems().addAll(
                "Java Programming",
                "Python",
                "Web Development",
                "Data Analytics"
        );

        candidateIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateId"));
        candidateNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName"));
        skillsTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("skills"));
        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent event) {

        if (searchCandidateTextField.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Search",
                    "Enter candidate name."
            );
            return;
        }

        ObservableList<Candidate> candidateList =
                databaseAccessor.readObject("Candidate.bin");

        assignCandidatesTableView.getItems().clear();

        for (Candidate c : candidateList) {

            if (c.getCandidateName().toLowerCase().contains(
                    searchCandidateTextField.getText().toLowerCase())) {

                assignCandidatesTableView.getItems().add(
                        new AssignCandidates(
                                String.valueOf(c.getCandidateId()),
                                c.getCandidateName(),
                                c.getSkills().toString(),
                                "Not Assigned"
                        )
                );
            }
        }

        if (assignCandidatesTableView.getItems().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Not Found",
                    "No candidate found."
            );
        }
    }

    @javafx.fxml.FXML
    public void assignCandidateButton(ActionEvent event) {

        AssignCandidates selected =
                assignCandidatesTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {

            AlertGenerator.showWarningAlert(
                    "Candidate",
                    "Select a candidate."
            );
            return;
        }

        if (trainingProgramComboBox.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Training Program",
                    "Select a training program."
            );
            return;
        }

        selected.setStatus("Assigned");

        assignCandidatesTableView.refresh();

        AlertGenerator.showInformationAlert(
                "Success",
                selected.getCandidateName()
                        + " assigned to "
                        + trainingProgramComboBox.getValue()
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent event) {

        SceneSwitchingHelper.switchScene(
                event,
                "/TrainingCoordinator/TrainingCoordinatorDashboard.fxml"
        );
    }
}

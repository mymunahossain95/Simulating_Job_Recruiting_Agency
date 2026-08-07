package Utsita;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Candidate;
import nonuser.IssueTrainingCertificates;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class IssueTrainingCertificatesController {

    @javafx.fxml.FXML
    private TableView<IssueTrainingCertificates> certificateTableView;
    @javafx.fxml.FXML
    private TableColumn<IssueTrainingCertificates, String> candidateNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<IssueTrainingCertificates, Integer> candidateIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<IssueTrainingCertificates, String> trainingProgramTableColumn;
    @javafx.fxml.FXML
    private TextField searchCandidateTextField;
    @javafx.fxml.FXML
    private TableColumn<IssueTrainingCertificates, Integer> certificateIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<IssueTrainingCertificates, String> completionStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<IssueTrainingCertificates, String> issueDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker issueDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> candidateComboBox;

    private ObservableList<IssueTrainingCertificates> certificateList;
    private ObservableList<Candidate> candidateList;

    @javafx.fxml.FXML
    public void initialize(){
        candidateList = databaseAccessor.readObject("Candidate.bin");

        for (Candidate candidate : candidateList) {
            candidateComboBox.getItems().add(
                    candidate.getCandidateName()
            );
        }
        trainingProgramComboBox.getItems().addAll(
                "Java Programming",
                "Python",
                "Web Development",
                "Data Analytics"
        );
        certificateIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("certificateId"));

        candidateIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateId"));

        candidateNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName"));

        trainingProgramTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trainingProgram"));

        completionStatusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("completionStatus"));

        issueDateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("issueDate"));

        certificateList = databaseAccessor.readObject("TrainingCertificate.bin");
        certificateTableView.setItems(certificateList);

    }


    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        String search = searchCandidateTextField.getText().toLowerCase();

        ObservableList<IssueTrainingCertificates> filteredList =
                FXCollections.observableArrayList();

        for (IssueTrainingCertificates certificate : certificateList) {

            if (certificate.getCandidateName().toLowerCase().contains(search)) {
                filteredList.add(certificate);
            }
        }

        certificateTableView.setItems(filteredList);

        if (filteredList.isEmpty()) {

            AlertGenerator.showInformationAlert(
                    "Search Result",
                    "No candidate found."
            );

            certificateTableView.setItems(certificateList);

        }
    }

    @javafx.fxml.FXML
    public void issueCertificateButton(ActionEvent actionEvent) {
        if (candidateComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please select a candidate."
            );
            return;
        }
        if (trainingProgramComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please select a training program."
            );
            return;
        }

        if (issueDateDatePicker.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please select the issue date."
            );
            return;
        }
        int certificateId = databaseAccessor.generateId(certificateList);

        int candidateId = 0;

        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateName().equals(candidateComboBox.getValue())) {
                candidateId = candidate.getCandidateId();
                break;
            }

        }
        IssueTrainingCertificates certificate =
                new IssueTrainingCertificates(
                        certificateId,
                        candidateId,
                        candidateComboBox.getValue(),
                        trainingProgramComboBox.getValue(),
                        "Completed",
                        issueDateDatePicker.getValue()
                );

        certificateList.add(certificate);

        databaseAccessor.writeObject(
                "TrainingCertificate.bin",
                certificateList
        );

        certificateTableView.refresh();

        AlertGenerator.showInformationAlert(
                "Success",
                "Training Certificate Issued Successfully."
        );

        candidateComboBox.setValue(null);
        trainingProgramComboBox.setValue(null);
        issueDateDatePicker.setValue(null);
        searchCandidateTextField.clear();
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/TrainingCoordinatorDashboard");
    }
}

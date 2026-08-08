package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.JobOffer;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class JobOffersViewController {

    @javafx.fxml.FXML
    private TableView<JobOffer> jobOffersViewTV;

    @javafx.fxml.FXML
    private TableColumn<JobOffer, String> offerIdTC;

    @javafx.fxml.FXML
    private TextField joiningDateTF;

    @javafx.fxml.FXML
    private TextField salaryTF;

    @javafx.fxml.FXML
    private TableColumn<JobOffer, String> positionTC;

    @javafx.fxml.FXML
    private TextField positionTF;

    @javafx.fxml.FXML
    private TextField benefitsTF;

    @javafx.fxml.FXML
    private TableColumn<JobOffer, String> companyNameTC;

    @javafx.fxml.FXML
    private TableColumn<JobOffer, String> responsestatusTC;

    @javafx.fxml.FXML
    private TextField companyTF;

    @javafx.fxml.FXML
    private Label statusForJobOfferLabel;

    private ObservableList<JobOffer> offerList;


    @javafx.fxml.FXML
    public void initialize() {

        offerIdTC.setCellValueFactory(new PropertyValueFactory<>("offerId"));
        companyNameTC.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        positionTC.setCellValueFactory(new PropertyValueFactory<>("position"));
        responsestatusTC.setCellValueFactory(new PropertyValueFactory<>("responseStatus"));

        offerList =
                databaseAccessor.readObject("JobOffer.bin");

        if (offerList == null) {
            offerList = FXCollections.observableArrayList();
        }

        jobOffersViewTV.setItems(offerList);
    }


    @javafx.fxml.FXML
    public void acceptOfferOA(ActionEvent actionEvent) {

        if (companyTF.getText().isEmpty()
                || positionTF.getText().isEmpty()
                || salaryTF.getText().isEmpty()
                || benefitsTF.getText().isEmpty()
                || joiningDateTF.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all required fields."
            );

            return;
        }

        JobOffer jobOffer =
                new JobOffer(
                        "OF001",
                        companyTF.getText(),
                        positionTF.getText(),
                        salaryTF.getText(),
                        joiningDateTF.getText(),
                        benefitsTF.getText(),
                        "Accepted"
                );

        offerList.add(jobOffer);

        databaseAccessor.writeObject(
                "JobOffer.bin",
                offerList
        );

        jobOffersViewTV.setItems(offerList);

        statusForJobOfferLabel.setText(
                "Offer Accepted"
        );

        AlertGenerator.showInformationAlert(
                "Offer Accepted",
                "Job offer accepted successfully."
        );
    }


    @javafx.fxml.FXML
    public void rejectOfferOA(ActionEvent actionEvent) {

        if (companyTF.getText().isEmpty()
                || positionTF.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please enter the company and position."
            );

            return;
        }

        JobOffer jobOffer =
                new JobOffer(
                        "OF001",
                        companyTF.getText(),
                        positionTF.getText(),
                        salaryTF.getText(),
                        joiningDateTF.getText(),
                        benefitsTF.getText(),
                        "Rejected"
                );

        offerList.add(jobOffer);

        databaseAccessor.writeObject(
                "JobOffer.bin",
                offerList
        );

        jobOffersViewTV.setItems(offerList);

        statusForJobOfferLabel.setText(
                "Offer Rejected"
        );

        AlertGenerator.showInformationAlert(
                "Offer Rejected",
                "Job offer rejected."
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}
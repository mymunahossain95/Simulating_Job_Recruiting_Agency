package Nazila;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.IdentityDocument;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;



public class DocumentVerifierIdentityVerificationController {
    @javafx.fxml.FXML
    private TextField identityVerificationRemarksTextField;
    @javafx.fxml.FXML
    private Label identityVerificationVerificationStatusResultLabel;
    @javafx.fxml.FXML
    private TableColumn<IdentityDocument, String> documentTypeCol2;
    @javafx.fxml.FXML
    private TableColumn <IdentityDocument, String>nidbirthCertificateVerificationstatusCol3;
    @javafx.fxml.FXML
    private TableView <IdentityDocument>nidPassportBirthCertiApostileTableView;
    @javafx.fxml.FXML
    private TableColumn<IdentityDocument, String> statusCol4;
    @javafx.fxml.FXML
    private TableView<IdentityDocument> candidateIdentityDocumentsTableView;
    @javafx.fxml.FXML
    private TableColumn <IdentityDocument, String>nidBirthCertificatedocumentTypeCol1;
    @javafx.fxml.FXML
    private TableColumn<IdentityDocument, String> issueAuthorityCol2;
    @javafx.fxml.FXML
    private TableColumn<IdentityDocument, String> candidateNameCol3;
    @javafx.fxml.FXML
    private TableColumn <IdentityDocument, String>candidateIdentitydocumentTypeCol1;
    @javafx.fxml.FXML
    private PieChart identityVerificationPieChart;

    private ObservableList<IdentityDocument> identityDocumentList;
    @javafx.fxml.FXML
    private ComboBox<String> nidBirthAppostileDocumentTypeComboBox;
    @javafx.fxml.FXML
    private TextField enterDocumentNoTextField;


    @javafx.fxml.FXML
    public void initialize() {
        candidateIdentitydocumentTypeCol1.setCellValueFactory(new PropertyValueFactory<>("documentType"));
        issueAuthorityCol2.setCellValueFactory(new PropertyValueFactory<>("documentNumber"));
        candidateNameCol3.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        statusCol4.setCellValueFactory(new PropertyValueFactory<>("verificationStatus"));

        nidBirthCertificatedocumentTypeCol1.setCellValueFactory(new PropertyValueFactory<>("documentType"));
        documentTypeCol2.setCellValueFactory(new PropertyValueFactory<>("issueAuthority"));
        nidbirthCertificateVerificationstatusCol3.setCellValueFactory(new PropertyValueFactory<>("verificationStatus"));
        identityDocumentList = databaseAccessor.readObject("IdentityDocument.bin");
        nidBirthAppostileDocumentTypeComboBox.getItems().addAll("NID", "Passport", "Birth Certificate", "Apostille");

        candidateIdentityDocumentsTableView.setItems(identityDocumentList);
        nidPassportBirthCertiApostileTableView.setItems(identityDocumentList);

        identityVerificationPieChart.getData().clear();
        identityVerificationPieChart.setTitle("Identity Ratio PieChat");

        identityVerificationPieChart.getData().add(new PieChart.Data("70% data are authentic of people", 76));
        identityVerificationPieChart.getData().add(new PieChart.Data("30% data are Fake of people", 24));

    }

    @javafx.fxml.FXML
    public void handleOpenDocumentButtonOA(ActionEvent actionEvent) {

        if (candidateIdentityDocumentsTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( " Document not found", "No identity document is available." );
            return;
        }
        AlertGenerator.showInformationAlert( "Document is Loading", "Identity documents loaded successfully." );
    }

    @javafx.fxml.FXML
    public void handleVerifyDocumentButtonOA(ActionEvent actionEvent) {
        if ( nidBirthAppostileDocumentTypeComboBox.getValue()==null||nidBirthAppostileDocumentTypeComboBox.getValue().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing is Selection", "Please select a document type from the dropdown.");
            return;
        }
        if (nidBirthAppostileDocumentTypeComboBox.getValue().equals("NID")) {
            if (!nidBirthAppostileDocumentTypeComboBox.getValue().matches("\\d{17}")) {
                AlertGenerator.showWarningAlert("Invalid NID Put again", "NID number must be exactly 17 digits.");
                return;
            }
        }
        if (nidBirthAppostileDocumentTypeComboBox.getValue().equals("NID")) {
            identityVerificationVerificationStatusResultLabel.setText( "Verification Status is NID Selected" );
        } else if (nidBirthAppostileDocumentTypeComboBox.getValue().equals("Passport")) {
            identityVerificationVerificationStatusResultLabel.setText( "Verification Status is Passport Selected" );
        } else if (nidBirthAppostileDocumentTypeComboBox.getValue().equals("Birth Certificate")) {
            identityVerificationVerificationStatusResultLabel.setText( "Verification Status is Birth Certificate Selected" );
        } else if (nidBirthAppostileDocumentTypeComboBox.getValue().equals("Apostille")) {
            identityVerificationVerificationStatusResultLabel.setText( "Verification Status is Apostille Selected" );
        } if (identityVerificationRemarksTextField.getText().trim().isEmpty()) {
            AlertGenerator.showWarningAlert( "Missing Information", "Please enter verification remarks." );
            return;
        } databaseAccessor.writeObject( "IdentityDocument.bin", identityDocumentList );
        AlertGenerator.showInformationAlert( "Verification Complete", "Document verification completed successfully." );
    }


    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/Nazila/DocumentVerifierDashboard.fxml" );
    }

}

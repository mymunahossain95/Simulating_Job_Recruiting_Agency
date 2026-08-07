package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import nonuser.IdentityDocument;

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

    @javafx.fxml.FXML
    public void handleOpenDocumentButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerifyDocumentButtonOA(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
    }
}

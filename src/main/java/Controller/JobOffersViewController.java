package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class JobOffersViewController {
    @javafx.fxml.FXML
    private TableView jobOffersViewTV;
    @javafx.fxml.FXML
    private Label positionLabel;
    @javafx.fxml.FXML
    private TableColumn offerIdTC;
    @javafx.fxml.FXML
    private TextField joiningDateTF;
    @javafx.fxml.FXML
    private TextField salaryTF;
    @javafx.fxml.FXML
    private TableColumn positionTC;
    @javafx.fxml.FXML
    private TextField positionTF;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField benefitsTF;
    @javafx.fxml.FXML
    private TableColumn companyNameTC;
    @javafx.fxml.FXML
    private TableColumn responsestatusTC;

    @javafx.fxml.FXML
    public void acceptOfferOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOfferOA(ActionEvent actionEvent) {
    }
}

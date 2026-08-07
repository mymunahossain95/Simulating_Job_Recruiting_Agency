package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.CounselingSession;

import java.time.LocalDate;
import java.time.LocalTime;

public class CareerCounselorCounselingSessionController {
    @javafx.fxml.FXML
    private Label careercounselPreviousGuidanceLabel;
    @javafx.fxml.FXML
    private TableView<CounselingSession> candidateInformationTableView;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession, LocalDate> sessionDateCol3;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession,String> sessionStatusCol5;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession,String> candidateNameCol2;
    @javafx.fxml.FXML
    private DatePicker sessionDatedatepicker;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession,String> sessionIDCol1;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession, LocalTime> sessionTimeCol4;



    @javafx.fxml.FXML
    public void handleSaveSessionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewSessionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEndSessionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCounselingSessionHomeButtonOA(ActionEvent actionEvent) {
    }
}

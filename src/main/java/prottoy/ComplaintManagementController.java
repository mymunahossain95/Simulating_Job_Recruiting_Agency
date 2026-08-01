package prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ComplaintManagementController {
    @javafx.fxml.FXML
    private TableColumn UserColumnTable;
    @javafx.fxml.FXML
    private TableColumn StatusColumnTable;
    @javafx.fxml.FXML
    private TextField ResolutionTextField;
    @javafx.fxml.FXML
    private TableView complaintTable;
    @javafx.fxml.FXML
    private TableColumn ComplaintIdColumnTable;

    @javafx.fxml.FXML
    public void onClose(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onResolve(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }
}

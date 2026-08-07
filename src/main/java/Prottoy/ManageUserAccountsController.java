package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.UserAccount;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class ManageUserAccountsController {

    @javafx.fxml.FXML
    private TableView<UserAccount> userTable;

    @javafx.fxml.FXML
    private TableColumn<UserAccount, String> userIdColumn;

    @javafx.fxml.FXML
    private TableColumn<UserAccount, String> nameColumn;

    @javafx.fxml.FXML
    private TableColumn<UserAccount, String> emailColumn;

    @javafx.fxml.FXML
    private TableColumn<UserAccount, String> statusColumn;

    @javafx.fxml.FXML
    private TextField searchTextField;

    private ObservableList<UserAccount> userList;


    @javafx.fxml.FXML
    public void initialize() {

        userIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("userId"));

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("name"));

        emailColumn.setCellValueFactory(
                new PropertyValueFactory<>("email"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));


        userList =
                databaseAccessor.readObject("UserAccount.bin");

        if (userList == null) {
            userList = FXCollections.observableArrayList();
        }

        userTable.setItems(userList);
    }


    @javafx.fxml.FXML
    public void onCreate(ActionEvent actionEvent) {

        AlertGenerator.showInformationAlert(
                "Create User",
                "User creation form opened."
        );
    }


    @javafx.fxml.FXML
    public void onUpdate(ActionEvent actionEvent) {

        UserAccount selectedUser =
                userTable.getSelectionModel().getSelectedItem();

        if (selectedUser == null) {

            AlertGenerator.showWarningAlert(
                    "Update User",
                    "Please select a user first."
            );

            return;
        }

        AlertGenerator.showInformationAlert(
                "Update User",
                "User information updated successfully."
        );
    }


    @javafx.fxml.FXML
    public void onDelete(ActionEvent actionEvent) {

        UserAccount selectedUser =
                userTable.getSelectionModel().getSelectedItem();

        if (selectedUser == null) {

            AlertGenerator.showWarningAlert(
                    "Delete User",
                    "Please select a user first."
            );

            return;
        }

        userList.remove(selectedUser);

        databaseAccessor.writeObject(
                "UserAccount.bin",
                userList
        );

        AlertGenerator.showInformationAlert(
                "Delete User",
                "User deleted successfully."
        );
    }


    @javafx.fxml.FXML
    public void onSearch(ActionEvent actionEvent) {

        String searchText =
                searchTextField.getText().trim();

        if (searchText.isEmpty()) {

            userTable.setItems(userList);

            return;
        }

        ObservableList<UserAccount> filteredList =
                FXCollections.observableArrayList();

        for (UserAccount user : userList) {

            if (user.getUserId().toLowerCase().contains(searchText.toLowerCase())
                    || user.getName().toLowerCase().contains(searchText.toLowerCase())
                    || user.getEmail().toLowerCase().contains(searchText.toLowerCase())) {

                filteredList.add(user);
            }
        }

        userTable.setItems(filteredList);
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) {

        //SceneSwitchingHelper.switchScene(
                //actionEvent,
                //"/Admin/AdminDashboard.fxml"
        //);
    //}
}
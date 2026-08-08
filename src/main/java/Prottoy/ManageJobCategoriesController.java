package Prottoy;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.JobCategory;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class ManageJobCategoriesController {

    @javafx.fxml.FXML
    private TableView<JobCategory> categoryTable;

    @javafx.fxml.FXML
    private TableColumn<JobCategory, String> categoryIdColumn;

    @javafx.fxml.FXML
    private TableColumn<JobCategory, String> categoryNameColumn;

    @javafx.fxml.FXML
    private TextField categoryNameField;

    private ObservableList<JobCategory> categoryList;


    @javafx.fxml.FXML
    public void initialize() {

        categoryIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("categoryId"));

        categoryNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("categoryName"));

        categoryList =
                databaseAccessor.readObject("JobCategory.bin");

        categoryTable.setItems(categoryList);
    }


    @javafx.fxml.FXML
    public void onAdd(ActionEvent event) {

        if (categoryNameField.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Category",
                    "Please enter a category name."
            );

            return;
        }

        JobCategory category = new JobCategory(
                "C" + (categoryList.size() + 1),
                categoryNameField.getText()
        );

        categoryList.add(category);

        databaseAccessor.writeObject(
                "JobCategory.bin",
                categoryList
        );

        categoryTable.refresh();

        categoryNameField.clear();

        AlertGenerator.showInformationAlert(
                "Success",
                "Job category added successfully."
        );
    }


    @javafx.fxml.FXML
    public void onUpdate(ActionEvent event) {

        JobCategory category =
                categoryTable.getSelectionModel().getSelectedItem();

        if (category == null) {

            AlertGenerator.showWarningAlert(
                    "Selection",
                    "Please select a category."
            );

            return;
        }

        if (categoryNameField.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Category",
                    "Please enter a category name."
            );

            return;
        }

        category.setCategoryName(
                categoryNameField.getText()
        );

        categoryTable.refresh();

        databaseAccessor.writeObject(
                "JobCategory.bin",
                categoryList
        );

        categoryNameField.clear();

        AlertGenerator.showInformationAlert(
                "Success",
                "Job category updated successfully."
        );
    }


    @javafx.fxml.FXML
    public void onDelete(ActionEvent event) {

        JobCategory category =
                categoryTable.getSelectionModel().getSelectedItem();

        if (category == null) {

            AlertGenerator.showWarningAlert(
                    "Selection",
                    "Please select a category."
            );

            return;
        }

        categoryList.remove(category);

        databaseAccessor.writeObject(
                "JobCategory.bin",
                categoryList
        );

        AlertGenerator.showInformationAlert(
                "Success",
                "Job category deleted successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent event) {

        //SceneSwitchingHelper.switchScene(
                //event,
                //"/Admin/AdminDashboard.fxml"
        //);
    //}
}
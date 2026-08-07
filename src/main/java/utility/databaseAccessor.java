package utility;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class databaseAccessor {

    @SuppressWarnings("unchecked")
    public static <T> ObservableList<T> readObject(String fileName) {

        try {

            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream(fileName));

            ObservableList<T> list =
                    (ObservableList<T>) input.readObject();

            input.close();

            return list;

        } catch (Exception e) {

            return FXCollections.observableArrayList();

        }

    }

    public static <T> void writeObject(String fileName,
                                       ObservableList<T> list) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(new FileOutputStream(fileName));

            output.writeObject(list);

            output.close();

        } catch (Exception e) {

            e.printStackTrace();

            AlertGenerator.showErrorAlert(
                    "File Error",
                    "Unable to access the file."
            );

        }

    }

    public static int generateId(ObservableList<?> list) {

        return list.size() + 1;

    }

}
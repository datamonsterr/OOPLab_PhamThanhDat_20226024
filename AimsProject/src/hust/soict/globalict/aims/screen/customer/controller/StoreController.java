package hust.soict.globalict.aims.screen.customer.controller;

import hust.soict.globalict.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class StoreController {
    private Store store;

    @FXML
    private GridPane gridPane;

    @FXML
    void btnViewCartPressed(ActionEvent event) {

    }

    public StoreController(Store store) {
        this.store = store;
    }

    @FXML
    public void initialize() {
        int cols = 0;
        int rows = 1;
        for (var media : store.getItemsInStore()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Item.fxml"));
                ItemController itemController = new ItemController();
                loader.setController(itemController);
                AnchorPane anchorPane = loader.load();
                itemController.setData(media);

                if (cols == 3) {
                    cols = 0;
                    rows++;
                }
                gridPane.add(anchorPane, cols++, rows);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
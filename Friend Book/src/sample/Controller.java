//create a friend
//Select a friend and see their properties
//Delete a friend
//Display all the friends
//Friends should be objects 

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class Controller {
    
    public TextField textGetLastName;
    public TextField textGetFirstName;
    public ListView<Friend> friendList = new ListView();
    public Label labelFirstName;
    public Label labelLastName;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend (textGetFirstName.getText(), textGetLastName.getText());
        friendList.getItems().add(temp);
        textGetFirstName.clear();
        textGetLastName.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        labelFirstName.setText(temp.getFirstName());
        labelLastName.setText(temp.getLastName());
    }
}

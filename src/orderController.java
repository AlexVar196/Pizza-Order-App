
import javafx.fxml.FXML;
//import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class orderController {

    @FXML
    private Button backToSelection;

    private Stage secondStage;
//    private Stage firstStage;
//    private Scene firstScene;
//
//    public void setFirstStage(Stage stage) {
//        firstStage = stage;
//    }
//    public void setFirstScene(Scene scene) {
//        firstScene = scene;
//    }
//    public void openFirstStage() {
//        firstStage.setTitle("Does this even show?");
//        firstStage.setScene(firstScene);
//        firstStage.show();
//    }
    public void setSecondStage(Stage stage) {
        secondStage = stage;
    }
    public void closeSecondStage() {
        secondStage.close();
    }
}

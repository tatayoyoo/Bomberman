import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;


public class RunPartie extends Application{

    public static void main(String [ ] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        Model model = new Model();
        View view = new View(model);
        Controller controller=new Controller(view,model);

        primaryStage.setScene(view.getScene());
        primaryStage.show();


        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                controller.actualisePostion();
            }
        };
        timer.start();


    }


}
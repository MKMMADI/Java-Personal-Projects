
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		// TODO Auto-generated method stub
		Group root = new Group();
		Scene sc = new Scene(root);
		Image Icon = new Image("https://i.pinimg.com/564x/b2/ad/1f/b2ad1f73236a87b49553814eb535389f.jpg");
		Button btn = new Button("Hello World");
		
		
		stage.getIcons().add(Icon);
		stage.setTitle("My GUI");
		stage.setScene(sc);
		
		stage.show();
		
		
	}

}

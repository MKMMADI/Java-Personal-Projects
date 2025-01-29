import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("MyApp");
		Menu menu1 = new Menu("Menu");
		MenuBar MB = new MenuBar();
		MB.getMenus().add(menu1);
		MenuItem M_ITM = new MenuItem();
		M_ITM.s
		VBox vbox = new VBox(MB);
		Scene Scn = new Scene(vbox,953,800);
		
		primaryStage.setScene(Scn);
		
		
		primaryStage.show();
	}

}

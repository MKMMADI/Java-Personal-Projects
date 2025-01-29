import java.util.ArrayList;

public class PlayWithRemote {

	public static void main(String[] args) {
		
		ElectronicDevice newDevice = TvRemote.getDevice();
		TurnTvOn on = new TurnTvOn(newDevice);
		DeviceButton onPress = new DeviceButton(on);
		
		onPress.press();
	}

}

package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		List<String> Defenders = Arrays.asList("Onana","Martinez","Varane","Dalot","Shaw");
		List<String> MidFielders = Arrays.asList("Casemiro","Mainoo","Bruno");
		List<String> Attackers = Arrays.asList("Hojlund","Rashford","Garnacho");
		
		List<List<String>> LineUp = Arrays.asList(Defenders,MidFielders,Attackers);
		
		List<String> ChampionsLegueLineUp= new ArrayList<String>();
		
		/*for(List<String> ChampionsLineUp : LineUp)
		{
			for(String Player : ChampionsLineUp)
			{
				ChampionsLegueLineUp.add(Player);
			}
		}
		System.out.println(ChampionsLegueLineUp);*/
		
		ChampionsLegueLineUp= LineUp.stream()
								.flatMap(Players->Players.stream().filter(Player-> Player.startsWith("C")))
								.collect(Collectors.toList());
		
		
		System.out.println(ChampionsLegueLineUp);
		
	}

}

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		ArrayList<Visitable> Memberships = new ArrayList<>();
		
		GoldMemberShip Mem1 = new GoldMemberShip();
		SilverMemberShip Mem2=new SilverMemberShip();
		DiamondMemberShip Mem3 = new DiamondMemberShip();
		
		Memberships.add(Mem1);
		Memberships.add(Mem2);
		Memberships.add(Mem3);
		
		ApplyDiscounts appliedDiscounts = new ApplyDiscounts();
		
		for(Visitable v : Memberships)
		{
			v.accept(appliedDiscounts);
		}

	}
}

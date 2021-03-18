package View;
import java.util.ArrayList;
import Model.Weight;
import Controller.WeightController;

public class ListDemo {
	public static void main (String[] args)
	{
		WeightController weightCon = new WeightController();
		
		Weight human1 = new Weight();
		Weight human2 = new Weight();
		Weight human3 = new Weight();
		
		human1.setWeightOnEarth(56.5);
		human2.setWeightOnEarth(77.5);
		human3.setWeightOnEarth(63.8);
		human1.setWeightOnMars(weightCon.CalculateWeight(human1.getWeightOnEarth()));
		human2.setWeightOnMars(weightCon.CalculateWeight(human2.getWeightOnEarth()));
		human3.setWeightOnMars(weightCon.CalculateWeight(human3.getWeightOnEarth()));
		
		ArrayList <Weight> setHuman = new ArrayList<Weight>();
		setHuman.add(human1);
		setHuman.add(human2);
		setHuman.add(human3);
		
		for ( Weight i: setHuman)
		{
			System.out.println(i.getWeightOnMars()+ " kg");
		}
		
	}
}

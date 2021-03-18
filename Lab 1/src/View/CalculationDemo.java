package View;
import Controller.WeightController;
import Model.Weight;

public class CalculationDemo {
	
	public static void main (String[] args)
	{
		Weight human1 = new Weight();
		WeightController weightCon = new WeightController();
		
		human1.setWeightOnEarth(56.5);
		human1.setWeightOnMars(weightCon.CalculateWeight(human1.getWeightOnEarth()));
		
		System.out.println("Weight On Earth = "+ human1.getWeightOnEarth()+" kg");		
		System.out.println("Weight On Mars  = "+ human1.getWeightOnMars()+" kg");
		
	}

}

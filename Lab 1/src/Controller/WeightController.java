package Controller;
import Model.Weight;

public class WeightController {
	
	Weight weight;
	public double CalculateWeight (double weightEarth)
	{
		double weightMars =0.38*weightEarth;
		/* weight= new Weight();
		 weight.setWeightOnMars(0.38*weightEarth);*/
		 
		 return weightMars;	 	 
		
	}

	
	
}

import java.util.ArrayList;

public class Neuron {
	
	private ArrayList<Signal> signals;
	private double threshold;
	private double currentPotential;
	private double potentialReductionSpeed;
	
	public Neuron() {
		signals = new ArrayList<>();
	}
	
	public void tick() {
		
	}
	
	private class Signal {
		
		public Signal() {
			
		}
		
	}
}
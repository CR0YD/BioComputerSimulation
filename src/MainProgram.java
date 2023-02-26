import java.util.ArrayList;

public class MainProgram {
	
	private ArrayList<Neuron> neurons;
	private int simulationTicks;
	
	public MainProgram() {
		neurons = new ArrayList<>();
		simulationTicks = 5000;
		run();
	}
	
	public void run() {
		for (int i = 0; i < simulationTicks; i++) {
			for (int j = 0; j < neurons.size(); j++) {
				neurons.get(j).tick();
			}
		}
	}
	
}
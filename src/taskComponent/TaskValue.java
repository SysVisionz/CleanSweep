package taskComponent;
import java.util.ArrayList;

public class TaskValue {
	String name;
	public ArrayList<Double> times= new ArrayList<Double>();
	
	public TaskValue(String name, ArrayList<Double> times){
		this.name=name;
		this.times=times;
	}
	public double returnavg(){
		double total=0;
		for(double val : times){
			total+=val;
		}
		total=total/times.size();
		return total;
	}
	public double[] asarray(){
		double retval[] = new double[times.size()];
		for(int i = 0; i<times.size(); i++){
			retval[i] = times.get(i);
		}
		return retval;
	}
}

package taskComponent;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Employee {
	Map<String,TaskValue> tasks = new HashMap<String,TaskValue>();
	String name;
	ArrayList<String> taskslisted = new ArrayList<String>();
	public Employee(TaskValue[] taskvals, String name){
		this.name=name;
		for(TaskValue addtask : taskvals){
			enterval(addtask.name,addtask.asarray());
		}
	}
	
	public double taskavg(String tasktarg){
		double average=0;
		for(double task : tasks.get(tasktarg).times){
			average+=task;
		}
		average=average/tasks.get(tasktarg).times.size();
		return average;
	}
	public void enterval(String taskname, double[] valent){
		boolean isunlisted = true;
		for (String task : taskslisted){
			if(task == taskname){
				isunlisted = false;
			}
			if(isunlisted){
				this.taskslisted.add(taskname);
				ArrayList<Double> newtaskval = new ArrayList<Double>();
				for (double valtoent : valent){
					newtaskval.add(valtoent);
				}
				this.tasks.put(taskname, new TaskValue(taskname, newtaskval));
			}
			else
			{
				TaskValue tomodval = this.tasks.get(taskname);
				for (double valtoent : valent){
					tomodval.times.add(valtoent);
				}
				this.tasks.put(taskname, tomodval);
			}
		}
	}
	
	public void enterval(String taskname, double valent){
		boolean isunlisted = true;
		for (String task : taskslisted){
			if(task == taskname){
				isunlisted = false;
			}
			if(isunlisted){
				this.taskslisted.add(taskname);
				ArrayList<Double> newtaskval = new ArrayList<Double>();
				this.tasks.put(taskname, new TaskValue(taskname, newtaskval));
			}
			else
			{
				this.tasks.get(taskname).times.add(valent);
			}
		}
	}
}

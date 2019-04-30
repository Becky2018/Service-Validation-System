package Views;

import java.util.ArrayList;

public class Preprocess {
static ArrayList<Preprocess> taskProcess=new ArrayList<Preprocess>(); 
static String task_type,task_executor,evidence;
	public void setTask(String task_type,String task_executor,String evidence) {
		
		taskProcess.add(new Preprocess(task_type,task_executor,evidence));
		//System.out.println(task_type + "\t"+task_executor+"\t"+evidence);
		System.out.println(taskProcess.size());
	}
	public  ArrayList<Preprocess> getTask()
	{
		return taskProcess;
	}
	Preprocess(String task_type,String task_executor,String evidence)
	{
		this.task_type=task_type;
		this.task_executor=task_executor;
		this.evidence=evidence;
		//System.out.println(arr[0]+arr[1]+arr[2]);
	}
	Preprocess()
	{
		
	}
}

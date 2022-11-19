package practice;

import java.time.LocalDate;


public class Task implements Comparable<Task> {
	public LocalDate date ;  // 日付
	public String taskDescription;  // タスク内容
	
	public Task(LocalDate date, String taskDescription) {
		this.date = date;
		this.taskDescription = taskDescription;
	}
	
	public LocalDate getDate() {
		return date;
	}

	
	public LocalDate setDate() {
		return this.date;
	}
	 
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public String setTaskDescription() {
		return this.taskDescription;
	}
	 

	@Override
	public int compareTo(Task o) {
		if (this.date < o.getDate()) {
			return -1;
		} else if (this.date > o.getDate()) {
			return 1;
		} else {
			return 0;
		}
		
	}
}

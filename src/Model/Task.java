public class Task {

    //enumerations 
    enum ticketStatus
    {
        IN_PROGRESS,
        COMPLETE
    }

    private int taskID; 
    private String taskName;
    private String taskDescription;
    
    public int getTaskID() {
        return taskID;
    }
    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    } 

    
}

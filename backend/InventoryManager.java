package backend;

public class InventoryManager extends Inventory {
  private Inventory[] tasks;

  public InventoryManager(String name, String quantity, String price) {
    super(name, quantity, price);
  }

  public String addTask(Inventory task, int index) {
    tasks[index] = task;
    return "Item added successfully";
  }

  public Inventory[] getTasks() {
    return tasks;
  } 

  public Inventory getSingleTask(int index) {
    return tasks[index];
  }

  public String removeTask(int index) {
    tasks[index] = null;
    return "Item removed successfully";
  }

  public String updateTask(Inventory task, int index) {
    tasks[index] = task;
    return "Item updated successfully";
  } 

  public int getTaskCount() {
    int count = 0;
    for (Inventory task : tasks) {
      if (task != null) {
        count++;
      }
    }
    return count;
  } 

  public void setTasks(Inventory[] tasks) {
    this.tasks = tasks;
  }
}

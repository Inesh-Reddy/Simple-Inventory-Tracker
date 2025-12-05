package backend;

public class Main {
  public static void main(String[] args) {
    System.out.println("Backend is running...");

    InventoryManager itemManager = new InventoryManager("Manager1", "0", "0");
    Inventory item1 = new Inventory("Laptop", "5", "100");
    Inventory item2 = new Inventory("Mobile", "3", "200");

    itemManager.setTasks(new Inventory[10]);

    System.out.println(itemManager.addTask(item1, 0));
    System.out.println(itemManager.addTask(item2, 1));

    System.out.println("Total tasks: " + itemManager.getTaskCount());

    Inventory retrievedItem = itemManager.getSingleTask(0);

    System.out.println("Retrieved Item: " + retrievedItem.getName() + ", Quantity: " + retrievedItem.getQuantity() + ", Price: " + retrievedItem.getPrice());
    System.out.println(itemManager.updateTask(new Inventory("Item1 Updated", "10", "150"), 0));
    Inventory retrievedItemAfterUpdate = itemManager.getSingleTask(0);
    System.out.println("Updated Item: " + retrievedItemAfterUpdate.getName() + ", Quantity: " + retrievedItemAfterUpdate.getQuantity() + ", Price: " + retrievedItemAfterUpdate.getPrice());
    System.out.println(itemManager.removeTask(1));
    System.out.println("Total Items after removal: " + itemManager.getTaskCount());   
  }
}

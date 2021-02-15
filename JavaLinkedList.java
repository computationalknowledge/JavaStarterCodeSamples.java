public class ApplicationManager{
	
		public static void main(String[] args) {
			GroceryList g = new GroceryList();
			g.MakeTheList();
			System.out.println(" The total cost of the groceries is " + g.CalculateTheCost());
	}
		// #TO DO: write a method to parse the array to find:
		//			highest cost item
		//			lowest cost item
		//			average cost of all items
}


class GroceryList{

	GroceryItem fruit;
	GroceryItem bread;
	GroceryItem veggies;
	GroceryItem nextItem;
	GroceryItem currentItem;

	public void MakeTheList() {
		fruit = new GroceryItem(3.00f, "FRUIT");
		veggies = new GroceryItem(4.50f, "VEGGIES");
		bread = new GroceryItem(2.25f, "BREAD");
		
		fruit.nextItem = veggies;
		
		veggies.groceryItemName = "Veggies";
		veggies.nextItem = bread;
		
		currentItem = fruit;
		
	}
	
	public float CalculateTheCost() {
		float totalCost = 0f;
		// let's make an array to store the costs
		float [] costs = new float[10];
		int arrayIndex = 0;
		while (currentItem.nextItem != null) {
			costs[arrayIndex++] = currentItem.groceryItemCost;
			totalCost += currentItem.groceryItemCost;
			nextItem = currentItem.nextItem;
			currentItem = nextItem;
		}
		
		return totalCost;
	}

}

class GroceryItem{
	
	// This is the Constructor
	public GroceryItem(float cost, String itemName) {
		this.groceryItemCost = cost;
		groceryItemName = itemName;
	}
	
	public GroceryItem nextItem;
	float groceryItemCost;
	String groceryItemName;
}



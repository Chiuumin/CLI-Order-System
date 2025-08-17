import java.util.*;

public class OrderSystem { 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WelcomeSign();
        Meals();
    }

    public static void WelcomeSign() {
        System.out.println("--------------------------------------------");
        System.out.println("***         RIE'S DINER             *** ");
        System.out.println("____________________________________________");
        System.out.println("\nWelcome to Rie's Diner Ordering System!");
        System.out.println("What would you like to order, Dear customer?");
        System.out.println("\n--------------------------------------------");
    }

    public static void Meals() {
        System.out.println("***             MEAL             *** ");
        System.out.println("____________________________________________");
        System.out.println("\n1. Main Dish");
        System.out.println("2. Side Dish");
        System.out.println("3. Dessert");
        System.out.println("4. Drinks");
        System.out.println("5. View Order/Checkout");  
        System.out.println("\nPlease kindly select from choices (1-5): ");

        Scanner scanner = new Scanner(System.in);
        int MealChoice = scanner.nextInt();

        switch (MealChoice) {
            case 1:
                MainDish();
                break;
            case 2:
                SideDish();
                break;
            case 3:
                Dessert();
                break;
            case 4:
                Drinks();
                break;
            case 5:
                viewOrder(); 
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                Meals(); 
        }
    }

    static ArrayList<String> orderItems = new ArrayList<>();
    static ArrayList<Double> orderPrices = new ArrayList<>();
    static ArrayList<Integer> orderQuantities = new ArrayList<>();
    
    public static void MainDish() {
        System.out.println("\n--------------------------------------------");
        System.out.println("***             MAIN DISH             *** ");
        System.out.println("____________________________________________");
        System.out.println("\n1. Kare-Kare - PHP 189.00");
        System.out.println("2. Pork Adobo - PHP 169.00");
        System.out.println("3. Chicken Curry - PHP 179.00");
        System.out.println("4. BACK");
        System.out.println("\nPlease kindly select from choices (1-4): ");

        int OrderChoice = scanner.nextInt();

        String dish = "";
        double price = 0;

        switch (OrderChoice) {
            case 1:
                dish = "Kare-Kare";
                price = 189;
                break;
            case 2:
                dish = "Pork Adobo";
                price = 169;
                break;
            case 3:
                dish = "Chicken Curry";
                price = 179;
                break;
            case 4:
                Meals();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                MainDish();
                return;
        }

        int quantity = getQuantity();
        orderItems.add(dish);
        orderPrices.add(price);
        orderQuantities.add(quantity);
        System.out.println("\n--------------------------------------------");
        System.out.println(quantity + " x " + dish + " added to your order.");
        System.out.println("--------------------------------------------");
        
        orderMore();
    }

    
        public static void SideDish() {
        System.out.println("\n--------------------------------------------");
        System.out.println("***             SIDE DISH             *** ");
        System.out.println("____________________________________________");
        System.out.println("\n1. Lumpia Shanghai - PHP 50.00");
        System.out.println("2. Garlic Rice - PHP 30.00");
        System.out.println("3. Pancit Bihon - PHP 60.00");
        System.out.println("4. BACK");
        System.out.println("\nPlease kindly select from choices (1-4): ");

        int OrderChoice = scanner.nextInt();  

        String dish = "";
        double price = 0;

        switch (OrderChoice) {
            case 1:
                dish = "Lumpia Shanghai";
                price = 50;
                break;
            case 2:
                dish = "Garlic Rice";
                price = 30;
                break;
            case 3:
                dish = "Pancit Bihon";
                price = 60;
                break;
            case 4:
                Meals();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                SideDish();
                return;
        }

        int quantity = getQuantity();
        orderItems.add(dish);
        orderPrices.add(price);
        orderQuantities.add(quantity);
        System.out.println("\n--------------------------------------------");
        System.out.println(quantity + " x " + dish + " added to your order.");
        System.out.println("--------------------------------------------");
        orderMore();
    }
    
    public static void Dessert() {
        System.out.println("\n--------------------------------------------");
        System.out.println("***             DESSERT             *** ");
        System.out.println("____________________________________________");
        System.out.println("\n1. Leche Flan - PHP 70.00");
        System.out.println("2. Halo-Halo - PHP 80.00");
        System.out.println("3. Banana Cue - PHP 40.00");
        System.out.println("4. BACK");
        System.out.println("\nPlease kindly select from choices (1-4): ");

        int OrderChoice = scanner.nextInt();  

        String dish = "";
        double price = 0;

        switch (OrderChoice) {
            case 1:
                dish = "Leche Flan";
                price = 70;
                break;
            case 2:
                dish = "Halo-Halo";
                price = 80;
                break;
            case 3:
                dish = "Banana Cue";
                price = 40;
                break;
            case 4:
                Meals();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                Dessert();
                return;
        }

        int quantity = getQuantity();
        orderItems.add(dish);
        orderPrices.add(price);
        orderQuantities.add(quantity);
        
        System.out.println("\n--------------------------------------------");
        System.out.println(quantity + " x " + dish + " added to your order.");
        System.out.println("--------------------------------------------");
        orderMore();
    }

    public static void Drinks() {
        System.out.println("\n--------------------------------------------");
        System.out.println("***             DRINKS             *** ");
        System.out.println("____________________________________________");
        System.out.println("\n1. Iced Tea - PHP 50.00");
        System.out.println("2. Softdrinks - PHP 40.00");
        System.out.println("3. Juice - PHP 60.00");
        System.out.println("4. BACK");
        System.out.println("\nPlease kindly select from choices (1-4): ");

        int OrderChoice = scanner.nextInt();  

        String dish = "";
        double price = 0;

        switch (OrderChoice) {
            case 1:
                dish = "Iced Tea";
                price = 50;
                break;
            case 2:
                dish = "Softdrinks";
                price = 40;
                break;
            case 3:
                dish = "Juice";
                price = 60;
                break;
            case 4:
                Meals();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                Drinks();
                return;
        }

        int quantity = getQuantity();
        orderItems.add(dish);
        orderPrices.add(price);
        orderQuantities.add(quantity);
        
        System.out.println("\n--------------------------------------------");
        System.out.println(quantity + " x " + dish + " added to your order.");
        System.out.println("--------------------------------------------");
        ;orderMore();
    }

     public static void orderMore() {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Processing your order...");

             System.out.println("\nWould you like to order more? (1 for Yes, 2 for No)");
             int orderMore = scanner.nextInt();
            if (orderMore == 1) {
            Meals();
            } else if (orderMore == 2) {
            viewOrder();
        }
     }

    

    public static void viewOrder() {
        if (orderItems.isEmpty()) {
            System.out.println("Your order is empty.");
            Meals(); 
            return;
        }

        System.out.println("\n--- Your Order ---");
        double totalPrice = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            double itemPrice = orderPrices.get(i) * orderQuantities.get(i);
            System.out.println(orderQuantities.get(i) + " x " + orderItems.get(i) + " - PHP " + itemPrice);
            totalPrice += itemPrice;
        }
        System.out.println("___________________");
        System.out.printf("Total: PHP %.2f\n", totalPrice);

        System.out.println("\n1. Confirm Order");
        System.out.println("2. Go Back to Menu");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                confirmOrder(totalPrice);
                break;
            case 2:
                Meals();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                viewOrder();
        }
    } 
    
    public static void confirmOrder(double totalPrice) { 
        System.out.println("\n--------------------------------------------");
        System.out.println("\nThank you for your order!");
        System.out.printf("Your total is PHP %.2f\n", totalPrice);
        System.out.println("We will prepare your meal shortly.");
        System.out.println("____________________________________________");
        orderItems.clear();
        orderPrices.clear();
        orderQuantities.clear();
        System.out.println("\nWould you like to place another order? (1 for Yes, 2 for No)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Meals();
        } else if (choice == 2) {
            System.out.println("\n--------------------------------------------");
            System.out.println("\nThank you for dining with us! Do come again.");
            System.out.println("____________________________________________");
        } else {
            System.out.println("Invalid input. Exiting.");
        }
        scanner.close();
    }
    
     public static int getQuantity() { 
        Scanner scanner = new Scanner(System.in);
        int quantity;
        do {
            System.out.print("Enter quantity: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Quantity must be greater than 0. Please try again.");
            }
        } while (quantity <= 0);
        return quantity;
    }
}




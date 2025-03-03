public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Linked List: " + linkedList);
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int elementToAdd = scanner.nextInt();
                    linkedList.add(elementToAdd);
                    break;
                case 2:
                    if (linkedList.isEmpty()) {
                        System.out.println("Linked list is empty. Nothing to delete.");
                    } else {
                        System.out.print("Enter the element to delete: ");
                        int elementToDelete = scanner.nextInt();
                        boolean removed = linkedList.remove(Integer.valueOf(elementToDelete));

                        if (removed) {
                            System.out.println("Element " + elementToDelete + " deleted successfully.");
                        } else {
                            System.out.println("Element " + elementToDelete + " not available in the LinkedList.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Elements in the linked list:");
                    linkedList.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

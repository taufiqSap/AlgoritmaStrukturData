public class HashTableMain {
    public static void main(String[] args) {
    HashTable table = new HashTable();

    table.set("apple", 100);
    System.out.println(table.hash("apple"));

    table.set("banana", 50);
    System.out.println(table.hash("banana"));

    table.set("cherry", 300);
    System.out.println(table.hash("cherry"));

    table.set("date", 500);
    System.out.println(table.hash("date"));

    table.set("eggplant", 10);
    System.out.println(table.hash("eggplant"));

    table.printTable();

    System.out.println("Apple:");
System.out.println( table.get("apple") );

System.out.println("\nDate:");
System.out.println( table.get("date") );

System.out.println( table.keys() );
}
}

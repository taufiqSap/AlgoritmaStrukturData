import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        Mahasiswa value;
        Node next;

        Node(String key, Mahasiswa value) {
            this.key = key;
            this.value = value;
        }  
    }

    public HashTable() {
        this.dataMap = new Node[this.size];
    }

    public void printTable() {
        for (int i = 0; i < this.dataMap.length; i++) {
            System.out.println(i + ":");
            Node current = this.dataMap[i];
            while (current != null) {
                System.out.println("Key: " + current.key + ", Value: " + current.value);
                current = current.next;
            }
        }
    }

    public int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.dataMap.length;
        }
        return hash;
    }

    public void set(String key, Mahasiswa value) {
        int hash = this.hash(key);
        Node newNode = new Node(key, value);
        if (this.dataMap[hash] == null) {
            this.dataMap[hash] = newNode;
        } else {
            Node current = this.dataMap[hash];
            if (current.key.equals(key)) {
                // Update existing Mahasiswa
                current.value = value;
                return;
            }
            while (current.next != null) {
                current = current.next;
                if (current.key.equals(key)) {
                    // Update existing Mahasiswa
                    current.value = value;
                    return;
                }
            }
            // Add new Mahasiswa to the end of the linked list
            current.next = newNode;
        }
    }

    public Mahasiswa get(String key) {
        int hash = this.hash(key);
        Node current = this.dataMap[hash];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public ArrayList<String> getNIMMahasiswa() {
        ArrayList<String> nimList = new ArrayList<>();
        for (int i = 0; i < this.dataMap.length; i++) {
            Node current = this.dataMap[i];
            while (current != null) {
                nimList.add(current.key);
                current = current.next;
            }
        }
        return nimList;
    }

    public void remove(String key) {
        int hash = this.hash(key);
        Node previous = null;
        Node current = this.dataMap[hash];

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    // Node to be removed is the first node in the linked list
                    this.dataMap[hash] = current.next;
                } else {
                    // Node to be removed is in the middle or end of the linked list
                    previous.next = current.next;
                }
                break;
            }

            previous = current;
            current = current.next;
        }
    }
}

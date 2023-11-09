import java.util.Scanner;
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        int choice = 0;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse InOrder");
            System.out.println("5. Traverse PreOrder");
            System.out.println("6. Traverse PostOrder");
            System.out.println("7. Exit");
            System.out.println("==== Test method ==== ");
            System.out.println("8. Menampilkan angka terkecil dan terbesar");
            System.out.println("9. Menampilkan leaf");
            System.out.println("10. Hitung leaf");
            System.out.println("========== End ==========");
            System.out.print("Pilih: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = sc.nextInt();
                    if (bt.find(data)) {
                        System.out.println("Data tidak ditemukan!");
                    } else {
                        bt.add(data);
                        System.out.println("Data ditambah!");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    int data2 = sc.nextInt();
                    bt.delete(data2);
                    System.out.println("Data dihapus!");
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    int data3 = sc.nextInt();
                    if (bt.find(data3)) {
                        System.out.println("Data Tersedia!");
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                    break;
                case 8:
                    bt.displayMinMax();
                    System.out.println();
                    break;
                case 9:
                    bt.displayLeaf(bt.root);
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Number of leaves: " + bt.countLeaf(bt.root));
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } while (choice != 7);

    }
}
package ASDJobsheet15;

public class BinaryTreeArrayMain05 {
    public static void main(String[] args) {
        BinaryTreeArray05 bta = new BinaryTreeArray05();
        // int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        // int idxLast = 6;
        // bta.populateData(data, idxLast);
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);
        System.out.print("\nInOrder Traversal   : ");
        bta.traverseInOrder(0);
        System.out.print("\nPreOrder Traversal  : ");
        bta.traversePreOrder(0);
        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
    }
}

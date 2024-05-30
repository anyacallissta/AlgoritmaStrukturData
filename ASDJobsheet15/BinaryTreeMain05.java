package ASDJobsheet15;

public class BinaryTreeMain05 {
    public static void main(String[] args) {
        BinaryTree05 bt = new BinaryTree05();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.add(10);
        // bt.add(15);

        //add data use rekursif method
        bt.addR(6);
        bt.addR(4);
        bt.addR(8);
        bt.addR(3);
        bt.addR(5);
        bt.addR(7);
        bt.addR(9);
        bt.addR(10);
        bt.addR(15);
        System.out.print("Pre Order Traversal     :");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("In Order Traversal      :");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("Post Order Traversal    :");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        bt.printMinMaxValues();
        System.out.print("Leaf Data               : ");
        int totalLeaves = bt.leafValues(bt.root);
        System.out.println("\nNumber of Leaf Nodes    : " + totalLeaves);
        System.out.println("\nFind Node               : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("Pre Order Traversal     :");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}

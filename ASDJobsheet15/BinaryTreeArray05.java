package ASDJobsheet15;

public class BinaryTreeArray05 {
    int[] data;
    int idxLast;

    public BinaryTreeArray05() {
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int dataTree) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = dataTree;
        } else {
            System.out.println("Tree is full!");
        }
    }

    void traverseInOrder(int idxStart) { //traversal left - print - traversal right
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1); //traversal left subtree
            System.out.print(data[idxStart] + " "); //print data in root
            traverseInOrder(2 * idxStart + 2); //traversal right subtree
        }
    }

    void traversePreOrder(int idxStart) { //print - traversal left - traversal right
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " "); //print data in root
            traverseInOrder(2 * idxStart + 1); //traversal left subtree
            traverseInOrder(2 * idxStart + 2); //traversal right subtree
        }
    }

    void traversePostOrder(int idxStart) { //traversal left - traversal right - print
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1); //traversal left subtree
            traverseInOrder(2 * idxStart + 2); //traversal right subtree
            System.out.print(data[idxStart] + " "); //print data in root
        }
    }
}

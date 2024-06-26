package ASDJobsheet15;

public class BinaryTree05 {
    Node05 root;

    public BinaryTree05() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { //tree is empty
            root = new Node05(data);
        } else {
            Node05 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node05(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node05(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node05 current = root;

        while (current != null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return result;
    }

    void traversePreOrder(Node05 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node05 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node05 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node05 getSuccessor(Node05 del) {
        Node05 successor = del.right;
        Node05 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node05 parent = root;
        Node05 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else { //if there is no child
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //if there is 1 child in right
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //if there is 1 child in left
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node05 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void addR (int data) {
        root = addRecursive(root, data);
    }

    Node05 addRecursive(Node05 current, int data) {
        if (current == null) {
            return new Node05(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        
        return current;
    }

    int findMinValue(Node05 node) {
        if (node.left == null) {
            return node.data;
        } else {
            return findMinValue(node.left);
        }
    }

    int findMaxValue(Node05 node) {
        if (node.right == null) {
            return node.data;
        } else {
            return findMaxValue(node.right);
        }
    }

    void printMinMaxValues() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
        } else {
            System.out.println("\nSmallest Value          : " + findMinValue(root));
            System.out.println("Largest Value           : " + findMaxValue(root));
        }
    }

    int leafValues(Node05 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return 1;
        }
        int leftLeaves = leafValues(node.left);
        int rightLeaves = leafValues(node.right);
        return leftLeaves + rightLeaves;
    }    

}

public class GraphMatriks05 {
    int vertex;
    int[][] matriks;

    public GraphMatriks05(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree() {
        System.out.println("-----------------------------------");
        System.out.println("| Gedung |  OutDegree |  InDegree |");
        System.out.println("-----------------------------------");
        for (int i = 0; i < vertex; i++) {
            int outDegree = 0;
            int inDegree = 0;
            
            // Calculate outDegree
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 0) {
                    outDegree++;
                }
            }
            // Calculate inDegree
            for (int j = 0; j < vertex; j++) {
                if (matriks[j][i] != 0) {
                    inDegree++;
                }
            }

            System.out.printf("|   %c    |    %3d     |    %3d    |\n", (char) ('A' + i), outDegree, inDegree);
        }
        System.out.println("-----------------------------------\n");
    }
}

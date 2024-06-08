public class Graph05 {
    int vertex;
    DoubleLinkedList05 list[];

    public Graph05(int v) {
        vertex = v;
        list = new DoubleLinkedList05[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList05();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        // --directed
        list[asal].addFirst(tujuan, jarak); 
        // --undirected
        // list[tujuan].addFirst(asal, jarak); 
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        // --directed
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        // --undirected
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove((tujuan));
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void checkEdge(int asal, int tujuan) throws Exception {
        boolean found = false;
        int size = list[asal].size();
    
        for (int i = 0; i < size; i++) {
            if (list[asal].get(i) == tujuan) {
                found = true;
                break;
            }
        }
    
        if (found) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
    }
    
    public void updateJarak(int asal, int tujuan, int jarak) {
        boolean success = false;
        Node05 current = list[asal].head;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarak;
                success = true;
                break;
            }
            current = current.next;
        }

        if (success) {
            System.out.println("Jarak antar gedung berhasil diperbarui");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " belum terhubung");
        }
    }

    public void hitungEdge() {
        int totalEdge = 0;

        for (int i = 0; i < vertex; i++) { // directed
            totalEdge += list[i].size();
        }

        // for (int i = 0; i < vertex; i++) { // undirected
        //     totalEdge += list[i].size();
        // }
        // totalEdge /= 2;

        System.out.println("Jumlah edge: " + totalEdge);
    }
}
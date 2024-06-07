public class GraphMatriks27 {
    int vertex;
    int[][] matriks;

    public GraphMatriks27(int v) {
        vertex = v;
        matriks = new int[v][v];
       
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = 0;
            }
        }
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
                System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
            }
            System.out.println();
        }
    }
    public void degree(int node) {
        int inDegree = 0;
        int outDegree = 0;

        // outDegree
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != 0) {
                outDegree++;
            }
        }
        // inDegree
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != 0) {
                inDegree++;
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + node) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + node) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + node) + ": " + (inDegree + outDegree));
    }
}

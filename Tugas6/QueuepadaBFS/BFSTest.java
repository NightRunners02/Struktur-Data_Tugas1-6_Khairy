package Strukturdatatugas.Tugas6.QueuepadaBFS;

import java.util.*;

public class BFSTest {
    private int V; 
    private LinkedList<Integer> adj[]; 

    @SuppressWarnings("unchecked")
    BFSTest(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w); 
    }

    void BFS(int v) {
       
        Queue<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[V];

        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> itr = adj[v].iterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFSTest g = new BFSTest(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        System.out.println("Hasil BFS dari simpul 0: ");
        g.BFS(0);
    }
}


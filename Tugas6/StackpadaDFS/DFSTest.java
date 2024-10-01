package Strukturdatatugas.Tugas6.StackpadaDFS;

import java.util.*;

public class DFSTest {
    private int V; 
    private LinkedList<Integer> adj[]; 

    @SuppressWarnings("unchecked")
    DFSTest(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w); 
    }

    void DFS(int v) {
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[V];

        stack.push(v);

        while (!stack.empty()) {
            v = stack.pop();

            if (!visited[v]) {
                visited[v] = true;
                System.out.print(v + " ");

                Iterator<Integer> itr = adj[v].iterator();
                while (itr.hasNext()) {
                    int n = itr.next();
                    if (!visited[n])
                        stack.push(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        DFSTest g = new DFSTest(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        System.out.println("Hasil DFS dari simpul 0: ");
        g.DFS(0);
    }
}


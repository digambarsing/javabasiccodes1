package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopolgicalSorting {
    static class Edge {
        int src;
        int des;

        public Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];

       createGraph(graph);
        topsort(graph);


    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));



        graph[3].add(new Edge(3, 1));
    }

    public static void topsort(ArrayList<Edge>[] graph) {
        boolean[]vis=new boolean[graph.length];
        Stack<Integer>st=new Stack<>();

        for (int i = 0; i < vis.length; i++) {
            if(!vis[i]){
                topsortUtil(graph,i,vis,st);
            }

        }
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    public static void topsortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st) {
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);

            if(!vis[e.des]){
                topsortUtil(graph, e.des, vis, st);

            }

        }
        st.push(curr);
    }
}


// used in dependency graphs.
// out degree tell about neighbours.
// out degree=no. of neighbours.


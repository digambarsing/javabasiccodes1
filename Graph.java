package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {

    static class Edge{
        int src;
        int des;
        int weg;

        public Edge(int src,int des,int weg){
            this.src=src;
            this.des=des;
            this.weg=weg;
        }
    }
    static class GraphPath {
        boolean hasPath;
        ArrayList<Integer> path;

        public GraphPath(boolean hasPath, ArrayList<Integer> path) {
            this.hasPath = hasPath;
            this.path = path;
        }
    }

    public static GraphPath hasPath(ArrayList<Edge>[] graph, int src, int des) {
        boolean[] visited = new boolean[graph.length];
        ArrayList<Integer> path = new ArrayList<>();
        return hasPathUtil(graph, src, des, visited, path);
    }

    private static GraphPath hasPathUtil(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, ArrayList<Integer> path) {
        visited[src] = true;
        path.add(src);

        if (src == des) {
            return new GraphPath(true, path);
        }

        for (Edge edge : graph[src]) {
            if (!visited[edge.des]) {
                GraphPath result = hasPathUtil(graph, edge.des, des, visited, path);
                if (result.hasPath) {
                    return result;
                }
            }
        }

        path.remove(path.size() - 1);
        return new GraphPath(false, path);
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));
        graph[4].add(new Edge(4, 2, 2));

        int src = 0;
        int des = 4;

        GraphPath result = hasPath(graph, src, des);
        if (result.hasPath) {
            System.out.println("Path from " + src + " to " + des + ": " + result.path);
        } else {
            System.out.println("No path from " + src + " to " + des);
        }
    }
}

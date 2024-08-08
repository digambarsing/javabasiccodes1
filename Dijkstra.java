package graphs;


import java.util.*;

class Line {
    int dest;
    int weight;

    public Line(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

class Node implements Comparable<Node> {
    int vertex;
    int distance;

    public Node(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}

public class Dijkstra {
    public static void dijkstra(List<Line>[] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        // Initialize distances and visited array
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // Create a priority queue
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // Add source vertex to priority queue
        dist[src] = 0;
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            // If vertex is already visited, skip it
            if (visited[u]) {
                continue;
            }

            visited[u] = true;

            // Update distances of adjacent vertices
            for (Line line : graph[u]) {
                int v = line.dest;
                int newDist = dist[u] + line.weight;

                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(new Node(v, newDist));
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        List<Line>[] graph = new List[5];

        for (int i = 0; i < 5; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Line(1, 4));
        graph[0].add(new Line(2, 1));
        graph[1].add(new Line(3, 1));
        graph[2].add(new Line(1, 2));
        graph[2].add(new Line(3, 5));
        graph[2].add(new Line(4, 3));
        graph[3].add(new Line(4, 2));
        graph[4].add(new Line(0, 5));
        graph[4].add(new Line(3, 3));

        int src = 0;
        dijkstra(graph, src);
    }
}

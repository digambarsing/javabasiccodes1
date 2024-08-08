package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CreateGraph {
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

    public static void BFS(ArrayList<Edge>[]graphs){
        Queue<Integer>q=new LinkedList<>();
        boolean[]visited=new boolean[graphs.length];

        q.add(0);

        while (!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for (int i = 0; i < graphs[curr].size(); i++) {
                    Edge e=graphs[curr].get(i);
                    q.add(e.des);

                }
            }
        }

    }

    // connected componenet part

    public static void bfs(ArrayList<Edge>[]graphs){
        boolean[]visited=new boolean[graphs.length];
        for (int i = 0; i < graphs.length ; i++) {
            if(!visited[i]){
                bfsutil(visited,graphs);
            }

        }
    }

    public static void bfsutil(boolean[] visited, ArrayList<Edge>[] graphs) {
        Queue<Integer>q=new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for (int i = 0; i < graphs[curr].size(); i++) {
                    Edge e=graphs[curr].get(i);
                    q.add(e.des);

                }
            }
        }
    }


    public static void dfs(ArrayList<Edge>[] graph, int startVertex) {
        int numVertices = graph.length;
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);
        visited[startVertex] = true;

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            System.out.print(vertex + " ");

            for (Edge edge : graph[vertex]) {
                int neighbor = edge.des;
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int v=5;
        ArrayList<Edge>[]graph=new ArrayList[v];  // null

        for (int i = 0; i < v; i++) {
            graph[i]=new ArrayList<>();
            
        }
        
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));


        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));
        
        
        graph[4].add(new Edge(4,2,2));


        for (int i = 0; i < graph[2].size(); i++) {
            Edge e=graph[2].get(i);
            System.out.println(e.des +" "+ e.src+" "+e.weg);
            
        }


        CreateGraph cg=new CreateGraph();
        cg.BFS(graph);

        System.out.println();


        cg.dfs(graph,0);
        
        
        
        
        
        
    }
}

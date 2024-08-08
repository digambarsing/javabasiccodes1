package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologocalSortBfs  extends TopolgicalSorting{

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        topSort(graph);

    }

    public static void topSort(ArrayList<Edge>[] graph) {
        int[]indeg=new int[graph.length];
        calcIndeg(graph,indeg);
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i < indeg.length; i++) {
            if(indeg[i]==0){
                q.add(i);
            }

        }

        while (!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");



            for (int j = 0; j < graph[curr].size(); j++) {
                Edge e=graph[curr].get(j);
                indeg[e.des]--;
                if (indeg[e.des]==0){
                    q.add(e.des);
                }

            }

        }
        System.out.println();
    }

    public static void calcIndeg(ArrayList<Edge>[] graph, int[] indeg) {
        for (int i = 0; i < graph.length; i++) {
            int v=i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e=graph[v].get(j);
                indeg[e.des]++;

            }

        }
    }
}


// here we use kahn's algorithm.

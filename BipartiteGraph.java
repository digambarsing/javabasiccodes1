package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    static class Edge{
        int src;
        int des;


        public Edge(int src,int des){
            this.src=src;
            this.des=des;

        }
    }
    public static void main(String[] args) {
        ArrayList<Edge>[]bigraph=new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            bigraph[i]=new ArrayList<>();

        }


        bigraph[0].add(new Edge(0,1));
        bigraph[0].add(new Edge(0,4));

        bigraph[1].add(new Edge(1,0));
        bigraph[1].add(new Edge(1,2));

        bigraph[2].add(new Edge(2,1));
        bigraph[2].add(new Edge(2,3));

        bigraph[3].add(new Edge(3,4));
        bigraph[3].add(new Edge(3,2));

        bigraph[4].add(new Edge(4,3));
        bigraph[4].add(new Edge(4,0));


        if(isBipartite(bigraph)){
            System.out.println("yes it is bipartite");
        }else{
            System.out.println("no it is not bipartite");

        }


    }

    public static boolean isBipartite(ArrayList<Edge>[] bigraph) {
        int[]col=new int[bigraph.length];
        for (int i = 0; i < col.length; i++) {
            col[i]=-1;

        }
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i < bigraph.length; i++) {
            if (col[i]==-1){
                q.add(i);
                col[i]=0;
                while (!q.isEmpty()){
                    int curr=q.remove();
                    for (int j = 0; j < bigraph[curr].size(); j++) {
                        Edge e=bigraph[curr].get(j);
                        if(col[e.des]==-1){
                            int nextcol=col[curr]==0?1:0;
                            col[e.des]=nextcol;
                            q.add(e.des);
                        } else if (col[e.des]==col[curr]) {
                            return false;
                            
                        }

                    }
                }

            }
            
        }
        return true;
    }
}

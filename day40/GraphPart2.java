import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class GraphPart2 {
    int vertices;
    ArrayList<ArrayList<Integer>> graph;
    GraphPart2(int v){
        this.vertices=v;
        graph= new ArrayList<>();
        for(int i=0;i<=v;i++){
            graph.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest){
        graph.get(src).add(dest);
    }
    public void display(){
        for(int i=0;i<=vertices;i++){
            System.out.println(i+":"+graph.get(i));
        }
    }
    public void BFS(int start){
        boolean visited[]=new boolean[vertices+1];
        Queue<Integer> q= new LinkedList<>();
        q.offer(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int nextNode= q.poll();
            System.out.print(nextNode);
            for(int val:graph.get(nextNode)){
                if(!visited[val]){
                    visited[val]=true;
                    q.add(val);
                }
            }
        }
        System.out.println();
    }
    public void DFS(int start){
        boolean visited[]= new boolean[vertices+1];
        helperDfs(start, visited);
        System.out.println();
    }
    public void helperDfs(int start, boolean visited[]){
            System.out.print(start);
            visited[start]=true;
            for(int val:graph.get(start)){
                if(!visited[val]){
                    helperDfs(val, visited);
                }
            }
    }
    public void indegree(int val){
        int degree=0;
        for(int i=0;i<=vertices;i++){
            if(graph.get(i).indexOf(val)!=-1){
                degree++;
            }
        }
        System.out.println("InDegree of "+val+": "+degree);
    }
    public void outDegree(int val){
        int degree=graph.get(val).size();
        System.out.println("OutDegree of "+val+": "+degree);
    }
    public static void main(String[] args) {
        GraphPart2 dg= new GraphPart2(6);
        dg.addEdge(1, 2);
        dg.addEdge(1, 4);
        dg.addEdge(2, 3);
        dg.addEdge(3,6);
        dg.addEdge(4, 3);
        dg.addEdge(4, 5);
        dg.addEdge(5, 6);
        dg.display();
        dg.BFS(1);
        dg.DFS(1);
        dg.indegree(1);
        dg.indegree(2);
        dg.outDegree(1);
        dg.outDegree(3);
    }
}

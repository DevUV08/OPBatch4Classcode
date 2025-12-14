import java.util.*;
public class DGraphList {
    static int vertices;
    static List<List<Integer>> graph;
    DGraphList(int v){
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
            System.out.println(i+"->"+graph.get(i));
        }
    }
    public static void main(String[] args) {
        DGraphList dg= new DGraphList(6);
        dg.addEdge(1, 2);
        dg.addEdge(2, 4);
        dg.addEdge(2, 3);
        dg.addEdge(3, 6);
        dg.addEdge(4, 5);
        dg.addEdge(5, 6);
        dg.display();
    }
}

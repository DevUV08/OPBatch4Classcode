import java.util.Arrays;
public class UDGraphMatrix {
    static int vertexes;
    static int graph[][];
    UDGraphMatrix(int v){
        this.vertexes=v;
        graph= new int[v+1][v+1];
    }
    public void addEdge(int src, int dest){
            graph[src][dest]=1;
            graph[dest][src]=1;
    }
    public void display(){
        for(int i=0;i<=vertexes;i++){
            System.out.println(Arrays.toString(graph[i]));
        }
    }
    public static void main(String[] args) {
        UDGraphMatrix dg=new UDGraphMatrix(3);
        dg.addEdge(1, 2);
        dg.addEdge(2, 3);
        // dg.addEdge(1, 3);
        dg.display();
    }
}

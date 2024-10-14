import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    // WRITE ADDVERTEX METHOD HERE //
    //                             //
    //                             //
    //                             //
    //                             //
    /////////////////////////////////
    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }


}

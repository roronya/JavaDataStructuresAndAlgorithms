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

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    // WRITE REMOVEEDGE METHOD HERE //
    public boolean removeEdge(String vertex1, String vertex2){
        var list = new ArrayList<String>();
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).remove(adjList.get(vertex1).indexOf(vertex2));
            adjList.get(vertex2).remove(adjList.get(vertex2).indexOf(vertex1));
            return true;
        }
        return false;
    }

}

package name.michaelamiethyst;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    private final int id;

    private final List<Integer> neighbors = new ArrayList<>();

    public GraphNode(int id, int neighbor) {
        this(id, neighbor, -1);
    }

    public GraphNode(int id, int neighbor0, int neighbor1) {
        this.id = id;
        if (neighbor0 >= 0) {
            neighbors.add(neighbor0);
        }
        if (neighbor1 >= 0) {
            neighbors.add(neighbor1);
        }
    }
}

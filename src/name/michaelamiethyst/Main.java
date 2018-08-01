package name.michaelamiethyst;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final List<GraphNode> nodes = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.dfs();
    }

    public void dfs() {
        System.out.println("Hello World");
        initDfs();
    }

    public void initDfs() {
        nodes.add(new GraphNode(0, 1, 2));
        nodes.add(new GraphNode(1, 2));
        nodes.add(new GraphNode(2, 0, 3));
        nodes.add(new GraphNode(3, 3));
    }
}
package name.michaelamiethyst;

import java.util.List;

public class Main {

    List<Node> nodes = new List<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.dfs();
    }

    public void dfs() {
        System.out.println("Hello World");
        initDfs();
    }

    public void initDfs() {
        // name, link1, link2
        createNode(0, 1, 2);
        createNode(1, 2);
        createNode(2, 0, 3);
        createNode(3, 3);
    }
}
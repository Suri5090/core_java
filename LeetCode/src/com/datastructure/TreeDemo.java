package com.datastructure;

import java.util.Vector;

public class TreeDemo {

    public static void main(String[] args) {

        int N=7, Root=1;
        Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>();

        for(int i=0; i<N+1; i++){
            adj.add(new Vector<Integer>());
        }
        System.out.println(adj);
        adj.get(1).add(2);
        System.out.println(adj);
        adj.get(2).add(1);
        System.out.println(adj);

        adj.get(1).add(3);
        System.out.println(adj);
        adj.get(3).add(1);
        System.out.println(adj);

        adj.get(1).add(4);
        System.out.println(adj);
        adj.get(4).add(1);
        System.out.println(adj);

        adj.get(2).add(5);
        System.out.println(adj);
        adj.get(5).add(2);
        System.out.println(adj);

        adj.get(2).add(6);
        System.out.println(adj);
        adj.get(6).add(2);
        System.out.println(adj);

        adj.get(4).add(7);
        System.out.println(adj);
        adj.get(7).add(4);

        System.out.println(adj);
        System.out.println("The parents of each node are:");
        printParents(Root, adj, 0);
    }

    private static void printParents(int node, Vector<Vector<Integer>> adj, int parent) {
        if (parent == 0)
            System.out.println(node + "->Root");
        else
            System.out.println(node + "->" + parent);

        // Using DFS
        for (int i = 0; i < adj.get(node).size(); i++)
            if (adj.get(node).get(i) != parent)
                printParents(adj.get(node).get(i), adj, node);
    }
}

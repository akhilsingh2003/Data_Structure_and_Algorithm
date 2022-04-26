package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class graph_imp {
    private LinkedList<Integer>adjacency[];
    public graph_imp(int v){
        adjacency =new LinkedList[v];
        for(int i=0;i<v;i++){
            adjacency[i]=new LinkedList<Integer>();

        }
    }
    public void insertedge(int s,int d){
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public void bfs(int source){
        boolean visited_nodes[]=new boolean[adjacency.length];
        int parent_node[]=new int[adjacency.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited_nodes[source]=true;
        parent_node[source]=-1;
        while(!q.isEmpty()){
            int p=q.poll();
            System.out.println(p);
            for(int i:adjacency[p]) {
                if (visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_node[i] = p;
                }
            }
        }

    }
    public void Dfs(int source){
        boolean visited_nodes[]=new boolean[adjacency.length];
        int parent_nodes[]=new int[adjacency.length];
        Stack<Integer> q=new Stack<>();
        q.add(source);
        visited_nodes[source]=true;
        parent_nodes[source]=-1;
        while(!q.isEmpty()){
            int p=q.pop();
            System.out.println(p);
            for (int i:adjacency[p]){
                if(visited_nodes[i]!=true){
                    visited_nodes[i]=true;
                    q.add(i);
                    parent_nodes[i]=p;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of vertices and edges ");
        int v=sc.nextInt();
        int e= sc.nextInt();
        graph_imp g=new graph_imp(v);
        System.out.println("enter edges ");
        for(int i=0 ;i<e;i++){
            int s=sc.nextInt();
            int d= sc.nextInt();
            g.insertedge(s,d);
        }
        System.out.println("enter the source for traversal ");
        int source=sc.nextInt();
        System.out.println("bfs:");
        g.bfs(source);
        System.out.println("Dfs ");
        g.Dfs(source);

    }
}

import java.util.Scanner;

class graph{
    
    class Edge{
        int src, dest;
    }
    
    Edge[] edge;
    
    int vertices, edges;
    
    graph(int vert, int edg){
        vertices = vert;
        edges = edg;
        
        edge = new Edge[edges];
        for(int i=0; i<edges; i++){
            
            edge[i] = new Edge();
        }
        
        
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		int noVert = 5;
		int noEdg = 8;
		
		graph g = new graph(noVert, noEdg);
		
		for(int i=0; i<noEdg; i++){
		    System.out.
		    g.edge[i].src = sc.nextInt();
		    g.edge[i].dest = sc.nextInt();
		}

    
    for(int i=0; i < noEdg; i++){
        
        System.out.println(g.edge[i].src+" - "+g.edge[i].dest);
    }
}
}


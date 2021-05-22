import java.util.*;

class WeightedGraph {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph(HashMap<Integer , String> h){
            System.out.println(h.get(0));
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println( h.get(list.get(j).weight)+ h.get(i) +","  +
                            h.get(list.get(j).destination)  ) ;
                }
            }
        }
    }
      public static void main(String[] args) {
            int vertices = 15;
            HashMap<Integer , String> hash = new HashMap<Integer,String>();

            hash.put(0, "Root");
            hash.put(1,"Abdominal pain");
            hash.put(2,"Chest pain");
            hash.put(3,"Abdominal pain, right upper quadrant" );
            hash.put(4,"Abdominal pain, right lower quadrant" );
            hash.put(5,"Abdominal pain, left upper quadrant" );
            hash.put(6,"Abdominal pain, right upper quadrant" );
            hash.put(7,"Abdominal pain, mild" );
            hash.put(8,"Abdominal pain, moderate");
            hash.put(9,"Abdominal pain, severe" );
            hash.put(10,"AChest pain, left side" );
            hash.put(11,"Chest pain, right side");
            hash.put(12,"Chest pain, mild" );
            hash.put(13,"Chest pain, moderate");
            hash.put(14,"Chest pain, severe");

            hash.put(21,"--location--");
            hash.put(22,"--severity--");
            hash.put(23,"--symptom--" );
            

            Graph graph = new Graph(vertices);
            graph.addEgde(2, 14, 23);
            graph.addEgde(2, 13, 23);
            graph.addEgde(2, 12, 23);
            graph.addEgde(2, 11, 21);
            graph.addEgde(2, 10, 21);
            graph.addEgde(0, 2, 23);
            graph.addEgde(1, 9, 22);
            graph.addEgde(1, 8, 22);
            graph.addEgde(1, 7, 22);
            graph.addEgde(1, 6, 21);
            graph.addEgde(1, 5, 21);
            graph.addEgde(1, 4, 21);
            graph.addEgde(1, 3, 21);
            graph.addEgde(0, 1, 23);
            
            //System.out.println(hash.get(0));
            System.out.println();
            System.out.println();
            System.out.println();
            graph.printGraph(hash);
        }
}

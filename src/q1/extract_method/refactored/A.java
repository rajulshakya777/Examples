package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   // TODO: Your answer
	   extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  // TODO: Your answer 
	   extractedMethod(edgeList, p);
      return null;
   }
   
     //Refactrored
    //Generic type method with parameter as T which is sub-type of Graph
    <T extends Graph> void extractedMethod(List<T> edges, String p) {
    	//TODO: Your answer
    	for(T t: edges) {
    		if(t.contains(p)) {
    			System.out.println(p);
    		}
    	}
    }
   
}


//// TODO: Your answer  : Created superclass of Node and Edge
class Graph{
   String name;
   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Node extends Graph{
  
}

class Edge extends Graph{
 
}
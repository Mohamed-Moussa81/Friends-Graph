package friends;

import java.util.ArrayList;

import structures.Queue;
import structures.Stack;

public class Friends {

	/**
	 * Finds the shortest chain of people from p1 to p2.
	 * Chain is returned as a sequence of names starting with p1,
	 * and ending with p2. Each pair (n1,n2) of consecutive names in
	 * the returned chain is an edge in the graph.
	 * 
	 * @param g Graph for which shortest chain is to be found.
	 * @param p1 Person with whom the chain originates
	 * @param p2 Person at whom the chain terminates
	 * @return The shortest chain from p1 to p2. Null or empty array list if there is no
	 *         path from p1 to p2
	 */
	public static ArrayList<String> shortestChain(Graph g, String p1, String p2) {
		boolean[] visited = new boolean[g.members.length];
		ArrayList<String> shortestpath = new ArrayList<>();
		//find index of p1
			boolean found = false;
			int p1index = g.map.get(p1);
			int p2index = g.map.get(p2);
			visited[p1index]= true;	
				for( Friend i=g.members[p1index].first;i!=null;i=i.next) {
					ArrayList<String> path = new ArrayList<>();
					if(!visited[i.fnum]) {
						 found = dfs(g,i,p2index,visited,path);
					}
					visited = new boolean[g.members.length];
					visited[p1index]= true;	
					if(found) {
					if(shortestpath.size()==0 ) {
						shortestpath = path;
					}
					if(path.size() !=0) {
						if(path.get(path.size()-1).equals(p2) && path.size()<shortestpath.size()) {
									shortestpath = path;
							}
					}
					}
				}
		
		// FOLLOWING LINE IS A PLACEHOLDER TO MAKE COMPILER HAPPY
		// CHANGE AS REQUIRED FOR YOUR IMPLEMENTATION
		return shortestpath;
	}
	private static boolean dfs(Graph g, Friend i, int p2, boolean[] visited, ArrayList<String> path) {
		visited[i.fnum] = true;
		boolean correctpath = false;
		//friend fnum is where the friend is stored,
			for(Friend e = i; e!=null;e =e.next) {
				String friendName = g.members[e.fnum].name;
				visited[e.fnum] = true;
				if(!path.contains(friendName)) {
				path.add(friendName);
				}
				if(e.fnum == p2) {
					return true;
				}
				correctpath = dfs(g,e,p2,visited, path);
					if(correctpath) {
						
					}
			}
			return false;
	}
	
	/**
	 * Finds all cliques of students in a given school.
	 * 
	 * Returns an array list of array lists - each constituent array list contains
	 * the names of all students in a clique.
	 * 
	 * @param g Graph for which cliques are to be found.
	 * @param school Name of school
	 * @return Array list of clique array lists. Null or empty array list if there is no student in the
	 *         given school
	 */
	public static ArrayList<ArrayList<String>> cliques(Graph g, String school) {
		//bfs search and just add the ones that have the same school
		/** COMPLETE THIS METHOD **/
		
		// FOLLOWING LINE IS A PLACEHOLDER TO MAKE COMPILER HAPPY
		// CHANGE AS REQUIRED FOR YOUR IMPLEMENTATION
		return null;
		
	}
	
	/**
	 * Finds and returns all connectors in the graph.
	 * 
	 * @param g Graph for which connectors needs to be found.
	 * @return Names of all connectors. Null or empty array list if there are no connectors.
	 */
	public static ArrayList<String> connectors(Graph g) {
		
		/** COMPLETE THIS METHOD **/
		
		// FOLLOWING LINE IS A PLACEHOLDER TO MAKE COMPILER HAPPY
		// CHANGE AS REQUIRED FOR YOUR IMPLEMENTATION
		return null;
		
	}
}


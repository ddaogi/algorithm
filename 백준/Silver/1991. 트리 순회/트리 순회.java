import java.util.*;
import java.io.*;
public class Main {
	
	static class Node{
		Node left;
		Node right;
		char value;
		Node( char value, Node left, Node right){
			this.value = value;
			this.left = left;
			this.right = right;
		}	
	}	
	
	static void insertNode(Node node,char parent, char left, char right) {
		
		//첫번째값, 부모인지 확인
		if(node.value == parent) {
			//부모이면 자식노드를 생성하면서 값을 넣어줌 
			if(left == '.') 
				node.left = null;
			else 
				node.left = new Node(left,null,null);
			if(right == '.')
				node.right = null;
			else
				node.right = new Node(right,null,null);
		}
		
		//
		else {
			if(node.left!=null) insertNode(node.left,parent,left,right);
			if(node.right!=null) insertNode(node.right,parent,left,right);
		}
			
	}
	
	static void preOrder(Node n) {
		if(n==null)	return;
		System.out.print(n.value);
		preOrder(n.left);
		preOrder(n.right);
		
	}
	static void inOrder(Node n) {
		if(n==null)	return;
		inOrder(n.left);
		System.out.print(n.value);
		inOrder(n.right);
		
	}
	static void postOrder(Node n) {
		if(n==null)	return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.value);
		
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	//노드의 개수 
		Node root = new Node('A',null,null);
		
		for(int i=0;i<N;i++) {
			String [] str = br.readLine().split(" ");
			char parent = str[0].charAt(0);
			char left = str[1].charAt(0);
			char right = str[2].charAt(0);
			insertNode(root,parent,left,right);
		}
		
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
	
	}// main()

}

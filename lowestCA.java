import java.util.ArrayList;
import java.util.List;

public class lowestCA {
	
    public static class Node { 
        int data;
        Node left, right;

        Node(int value) {	
            data = value;
            left = right = null;
        }
    }

    public static class LcaClass {

        Node root;
        private List<Integer> path1 = new ArrayList<>();
        private List<Integer> path2 = new ArrayList<>();

        int findLCA(int n1, int n2) {
            path1.clear();
            path2.clear();
            return findLCA(root, n1, n2);
        }

        private int findLCA(Node root, int n1, int n2) {
            if (!path(root, n1, path1) || !path(root, n2, path2)) {
                return -1;
            }

            int i;
            for (i = 0; i < path1.size() && i < path2.size(); i++) {
                if (!path1.get(i).equals(path2.get(i)))
                    break;
            }
            return path1.get(i - 1);
        }

        private boolean path(Node root, int n, List<Integer> path) {
            path.add(root.data);

            if (root.data == n) {
                return true;
            }
            if (root.left != null && path(root.left, n, path)) {
                return true;
            }
            if (root.right != null && path(root.right, n, path)) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }
    }
	
	public static void main(String[] args) {
		
		
		
		LcaClass BST = new LcaClass();
		
		BST.root = new lowestCA.Node(8);
		BST.root.left = new lowestCA.Node(12);
        BST.root.right = new lowestCA.Node(4);
        
        
        int test =BST.findLCA(12,4);
        
        System.out.print(test);

	}

}

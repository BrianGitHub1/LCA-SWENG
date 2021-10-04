import static org.junit.Assert.*;

import org.junit.Test;

public class lowestCATest {
	
	
	
	
	@Test
	public void Test1() {
		lowestCA.LcaClass BST = new lowestCA.LcaClass();
		BST.root = new lowestCA.Node(8);
		BST.root.left = new lowestCA.Node(12);
        BST.root.right = new lowestCA.Node(4);


        assertEquals( 8,BST.findLCA(12,4));
        assertEquals( 8,BST.findLCA(4,12));
        
	}
	
	
	@Test
    public void TestWithThree() {
		lowestCA.LcaClass BST = new lowestCA.LcaClass();
        BST.root = new lowestCA.Node(50);
        BST.root.left = new lowestCA.Node(13);
        BST.root.right = new lowestCA.Node(10);
        BST.root.left.left = new lowestCA.Node(1);
        BST.root.left.right = new lowestCA.Node(3);
        BST.root.right.left = new lowestCA.Node(8);
        BST.root.right.right = new lowestCA.Node(4);




        assertEquals( 50,BST.findLCA(1, 4));
        assertEquals( 10,BST.findLCA(8, 4));
        
	}


}

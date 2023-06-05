public class Main {

    public static void main(String[] args) {
        BinaryTree treeA = new BinaryTree("A");
        BinaryTree treeC = new BinaryTree("C");
        BinaryTree treeB = new BinaryTree("B", treeA, treeC);
        System.out.println("treeB: " + treeB);
        System.out.println("treeB.isAVL(): " + treeB.isAVL());
        BinaryTree treeE = new BinaryTree("E");
        BinaryTree treeF = new BinaryTree("F", treeE, null);
        System.out.println("treeF: " + treeF);
        System.out.println("treeF.isAVL(): " + treeF.isAVL());
        BinaryTree treeD = new BinaryTree("D", treeC, treeF);
        System.out.println("treeD: " + treeD);
        System.out.println("treeD.isAVL(): " + treeD.isAVL());
        treeB = new BinaryTree("B", treeA, treeD);
        System.out.println("treeB: " + treeB);
        System.out.println("treeB.isAVL(): " + treeB.isAVL());

    }
}
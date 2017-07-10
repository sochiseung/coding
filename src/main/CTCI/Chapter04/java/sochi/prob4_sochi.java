package sochi;

public class prob4_sochi {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode leftleft = new TreeNode(4);
        TreeNode leftright = new TreeNode(5);
        TreeNode rightleft = new TreeNode(6);
        TreeNode rightright = new TreeNode(7);

        root.setLeft(left);
        root.setRight(right);

        left.setLeft(leftleft);
        left.setRight(leftright);

        right.setLeft(rightleft);
        right.setRight(rightright);

        isBalanceTree(root);
    }
    public static boolean isBalanceTree(TreeNode node){

        while(true){
            node.getLeft();
            TreeNode left = node.left;
            TreeNode right = node.right;

            break;
        }

        return true;
    }



}
//class Tree{
//
//    TreeNode root;
//
//    Tree(int[] ints){
//        Node node = new Node(ints[0]);
//        root = node;
//        if(ints.length<=1) return;
//
//        for(int i=1; i<ints.length; i++){
//            Node addNode = new Node(ints[i]);
//            node.setNextNode(addNode);
//            node = addNode;
//        }
//
//    }
//    public Node getRoot() {
//        return root;
//    }
//    public void findNthToEnd(int n){
//        //n-1 skip
//        if(n < 1) return;
//        int count = 1;
//        Node node =root;
//        while(true){
////            if(count >= n) System.out.print(node.element);
//
//            if(node.getNextNode() == null) break;
//
//            node = node.getNextNode();
//            count++;
//        }
//        int nth = count - n ;
//        if(nth<1) return;
//        node =root;
//        int newCount = 1;
//        while(true){
//            if(newCount>nth){
//                System.out.println(node.element);
//                break;
//            }
//            node = node.getNextNode();
//            newCount++;
//        }
//    }
//}

class TreeNode{
    TreeNode left = null;

    TreeNode right = null;
    int element;

    TreeNode(int element){
        this.element = element;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}

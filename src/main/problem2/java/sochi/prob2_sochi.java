package sochi;

/**
 * @author : Intellicon Lab. soh
 * @version 1.0
 *          <p>
 *          == Modification Information ==
 *          <p>
 *          Date			Author			Note
 *          ----------	-------------	--------------------------------
 *          2017-05-31		soh			최초 생성
 * @packgename : sochi
 * @description :
 */
public class prob2_sochi {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList(new int[]{1,2,3,4,5,6,7});
        linkedList.findNthToEnd(3);
    }
}
class LinkedList{

    Node root;

    LinkedList(int[] ints){
        Node node = new Node(ints[0]);
        root = node;
        if(ints.length<=1) return;

        for(int i=1; i<ints.length; i++){
            Node addNode = new Node(ints[i]);
            node.setNextNode(addNode);
            node = addNode;
        }

    }
    public Node getRoot() {
        return root;
    }
    public void findNthToEnd(int n){
        //n-1 skip
        if(n < 1) return;
        int count = 1;
        Node node =root;
        while(true){
//            if(count >= n) System.out.print(node.element);

            if(node.getNextNode() == null) break;

            node = node.getNextNode();
            count++;
        }
        int nth = count - n ;
        if(nth<1) return;
        node =root;
        int newCount = 1;
        while(true){
            if(newCount>nth){
                System.out.println(node.element);
                break;
            }
            node = node.getNextNode();
            newCount++;
        }
    }
}

class Node{
    Node tail = null;
    int element;

    Node(int element){
        this.element = element;
    }

    Node getNextNode(){
        return tail;
    }
    void setNextNode(Node node){
        this.tail = node;
    }
}



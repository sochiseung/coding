package sochi;

import java.util.ArrayList;

/**
 * @author : Intellicon Lab. soh
 * @version 1.0
 *          <p>
 *          == Modification Information ==
 *          <p>
 *          Date			Author			Note
 *          ----------	-------------	--------------------------------
 *          2017-06-01		soh			최초 생성
 * @packgename : sochi
 * @description :
 */
public class prob3_sochi {

    public static void main(String[] args){
        Stack stack1 = new Stack();
        stack1.Push(7);
        stack1.Push(8);
        stack1.Push(3);
        stack1.Push(4);
        stack1.Push(5);
        stack1.Push(6);
//        System.out.println(stack1.min());

//        for(int i: stack1.arrayList){
//            System.out.println(i);
//        }

        stack1.Pop();
        for(int i: stack1.arrayList){
            System.out.println(i);
        }
    }
}

class Stack{
    private int min;
    private int arraySize = 0;
    public ArrayList<Integer> arrayList;

    Stack(){
        arrayList = new ArrayList<Integer>();
    }
    public void Push(int input){
        if(arraySize ==0){
            min = input;
        }
        else{
            if(min > input) min = input;
        }
        arrayList.add(input);
        arraySize++;
    }
    public int Pop(){
        int result = arrayList.get(arraySize-1);
        arrayList.remove(arraySize-1);
        arraySize--;
        return result;
    }
    public int min(){
        return min;
    }
}

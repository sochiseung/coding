package sochi;

/**
 * @author :soh
 * @version 1.0
 *          <p>
 *          == Modification Information ==
 *          <p>
 *          Date			Author			Note
 *          ----------	-------------	--------------------------------
 *          2017-05-30		soh			최초 생성
 * @packgename : sochi
 * @description : Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
 */
public class Prob1 {
    public static void main(String[] args){
        String testStr1 = "asbaseqwe";
        String testStr2 = "abcdefgn";
        Prob1 prob1 = new Prob1();
        prob1.hasAllUniqChar(testStr1);
        prob1.hasAllUniqChar(testStr2);

    }

    public boolean hasAllUniqChar(String str){
        String container = "";
        for(int i =0; i<str.length(); i++){
            if(container.contains(""+str.charAt(i))){
                System.out.println("false");
                return false;
            }
            else{
                container += str.charAt(i);
            }
        }
        System.out.println("true");
        return true;
    }
}

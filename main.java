import java.util.*;

public class Main {
    static HashMap<Byte,String> dialPad = new HashMap<Byte,String>(){{
        put((byte)0,"");
        put((byte)1,"");
        put((byte)2,"abc");
        put((byte)3,"def");
        put((byte)4,"ghi");
        put((byte)5,"jkl");
        put((byte)6,"mno");
        put((byte)7,"pqrs");
        put((byte)8,"tuv");
        put((byte)9,"wxyz");
    }};

    static void printPermutations(String leftOver,String current){
        if(leftOver==null) return;
        byte ij = (byte)(leftOver.charAt(0)-48);
        String num = dialPad.get(ij);
        String newLeftOver=leftOver.length()==1?null:leftOver.substring(1);
        for(int i=0;i<num.length();i++){
            if(newLeftOver!=null)
                printPermutations(newLeftOver,current+num.charAt(i));
            else
                System.out.print(current+num.charAt(i)+" ");
        }
    }

    public static void main(String[] args){
        printPermutations("23","");
    }

}

public class SameEnds {
    public String sameEnds(String string) {
        String res="";
        if(string.length()<2){
            return "";
        }
        else{
            String str1=string.substring(string.length()/2,string.length());
            for(int i=0;i<string.length()/2;i++){
                for(int j=0;j<str1.length();j++){
                    if(string.substring(0,string.length()/2-i).equals(str1.substring(j))){
                        res= str1.substring(j);
                        return res;
                    }

                }
            }
        return res;
    }
    }
    public static void main(String[]args){
        String str="javaXYZjava";
        SameEnds sameEnds =new SameEnds();
        System.out.println(sameEnds.sameEnds(str));
    }
    }


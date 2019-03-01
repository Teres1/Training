public class MaxBlock {
    public int maxBlock(String str) {
        int count=0;
        int maxCount=0;
        int start=0;
        for(int i=start;i<str.length();i++){
            if(str.charAt(start)==str.charAt(i)){
                count++;
                if(count>maxCount){
                    maxCount=count;
                }
            }
            else {
                start=i;
                count=1;
            }
        }
        return maxCount;
    }
}

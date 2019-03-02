public class SumNumbers {
    public int sumNumbers(String str) {
        int sum=0;
        String str1=str.replaceAll("[^0-9]", " ")
                .replaceAll("\\s{2,}", " ").trim();
        if(str1.length()==0){
            return 0;
        }else {
            String arr[] = str1.split(" ");
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
        }
        return sum;
    }
    public static void main(String[]args){
        String str="aa11b33";
        SumNumbers sumNumbers =new SumNumbers();
        System.out.println(sumNumbers.sumNumbers(str));
    }

}

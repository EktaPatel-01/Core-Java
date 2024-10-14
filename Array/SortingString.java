package Array;

public class SortingString {
    public static void main(String[] args) {
        String str="Abhishek";
        char[] charArr=str.toCharArray();
        // Arrays.sort(charArr);
        // System.out.println(new String(charArr));

        for (int i = 0; i < charArr.length-1; i++) {
            for (int j = 0; j < charArr.length-1; j++) {
                if(charArr[j]>charArr[j+1]){
                    char temp=charArr[j];
                    charArr[j]=charArr[j+1];
                    charArr[j+1]=temp;
                }
            }
        }
        System.out.println(new String(charArr));

    }
}

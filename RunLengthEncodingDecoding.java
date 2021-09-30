package Chapter3;

public class RunLengthEncodingDecoding {
    public static void main(String[] args) {
        System.out.println(encoding("aaaaeerrwfffffdsdd"));
        System.out.println(decoding("4a2e1r1w1r5f1d1s2d"));
    }

    public static String encoding(String str){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 0;i < str.length() - 1;i++){
            if(str.charAt(i) == str.charAt(i+1))
                ++count;
            else {
                result.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        result.append(count).append(str.charAt(str.length() - 1));
        return result.toString();
    }

    public static String decoding(String str){
        StringBuilder count = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count.append(str.charAt(i));
            }
            else{
                if(!count.toString().equals("")) {
                    for (int j = 0; j < Integer.parseInt(count.toString()); j++) {
                        result.append(str.charAt(i));
                    }
                    count = new StringBuilder();
                }
            }
        }
        return result.toString();
    }
}

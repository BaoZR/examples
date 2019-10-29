public class Compare {
    public static String compare(String str1,String str2){
        String str = "345678910JQKA2";
        return  (str.indexOf(str1)>str.indexOf(str2)) ? str1 : str2;
    }

    public static void main(String[] args) {
        String result = Compare.compare("10","A");
        System.out.println(result);
    }


}

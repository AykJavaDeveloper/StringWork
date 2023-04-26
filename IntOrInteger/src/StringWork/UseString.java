package StringWork;

public class UseString {
    public static void main(java.lang.String[] args) {
        java.lang.String stringForWork = "I am   a  java  ";

        for(java.lang.String word : stringForWork.split("\\s+")) {
            System.out.println(word);
        }
    }
}

public class Sbuilder {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch = (char) ('a'+i);
            build.append(ch);
        }
        System.out.println(build);
        build.reverse();
        System.out.println(build);

    }
}
In Stringbuilder only one object is made and changes are made to that one object only,the refernce is also the same and it is not change

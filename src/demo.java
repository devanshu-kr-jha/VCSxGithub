public class demo {
    public static void main(String[] args) {
        skip("","Avnegers",'e',0);
       String str = "Assassination";
       printRev(str, str.length()-1);
    }
    static void skip(String p, String up, char ch, int idx){
        if (idx == up.length()){
            System.out.println(p);
            return;
        }
        if (up.charAt(idx) == ch){
            skip(p,up,ch,idx+1);
        } else{
            p += up.charAt(idx);
            skip(p,up,ch,idx+1);
        }
    }
    static void printRev(String str, int idx){
        if (idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);

    }
}

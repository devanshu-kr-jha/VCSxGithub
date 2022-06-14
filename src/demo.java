public class demo {
    public static void main(String[] args) {
        skip("","Avnegers",'e',0);
       String str = "Assassination";
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
}

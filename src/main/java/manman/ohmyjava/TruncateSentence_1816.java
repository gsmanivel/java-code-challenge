package manman.ohmyjava;

public class TruncateSentence_1816 {
    public static void main(String[] args) {
        TruncateSentence_1816 obj= new TruncateSentence_1816();
        String s= "Hello how are you doing?";
        int k=4;
        System.out.println(obj.truncateSentence(s,k));
    }
    public String truncateSentence(String s, int k) {
        String[] words= s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<k;i++)
            sb.append(words[i]+" ");
        return sb.toString().trim();
    }
}

import java.util.ArrayList;
public class GlobalReplace {
    
    private static ArrayList<String> savedText = new ArrayList<String>();
    public static void main(String[] args){
        System.err.println(undoReplaceAll());
        System.err.println(replaceAll("AAAA","AAA","B"));
        System.err.println(undoReplaceAll());
    }
    public static String replaceAll(String text, String what, String sub){
        savedText.add(text);
        int start = text.indexOf(what);
        int end = what.length();
        text = replaceOne(text,start,end,sub);
        return text;
    }
    public static String undoReplaceAll(){
        if(savedText.isEmpty())
            return null;
        return savedText.get(savedText.size()-1);
    }
    public static String replaceOne(String text, int i, int n, String sub){
        int secPart = i+n;
        text = text.substring(0, i)+sub+text.substring(secPart, text.length());
        
        return text;
    }
}

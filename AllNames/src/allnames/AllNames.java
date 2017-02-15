package allnames;

import java.util.Set;
import java.util.TreeSet;

public class AllNames {

    public static void main(String[] args) {
        
        Set<String> myset = new TreeSet<String>();
        // kommentar dazugetan
        myset.add(Andreas.getName());
        
        for(String s : myset) {
            System.out.println(s);
        }
        
        
    }
    
}

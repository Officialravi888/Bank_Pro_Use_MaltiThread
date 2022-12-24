package Logging_Project_23_12_22;

import java.util.ArrayList;
import java.util.List;

public class CrawledSites {
    private List<String> CrawledSites=new ArrayList<>();
    private List<String> LinkedSide=new ArrayList<>();

    void add(){
        synchronized (this){
            String site = null;
            if (!CrawledSites.contains(site)){
                LinkedSide.add(site);
            }
        }
    }
    public String next(){
        if (LinkedSide.size()==0){
            return null;
        }
        synchronized (this){
            if (LinkedSide.size()>0){
                String s = LinkedSide.get(0);
                LinkedSide.remove(0);
                CrawledSites.add(s);
                return s;
            }
            return null;
        }
    }

}

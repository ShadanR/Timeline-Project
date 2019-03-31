package timeline;

public class HumanInterestComponent  extends Component {

    private String objectName;

    private int releaseYear;
    
     public String getObjectName(){
       
       return objectName;
       
   } // end of get object name
   
   public void setObjectName(String o){
       
       objectName = o;
       
   } // end of set object name
   
   public int setReleaseYear(){
       
       return releaseYear;
       
   } // end of get realease year 
   
   public void setReleaseYear(int  r){
   
    releaseYear = r;
  
   } // end of set release year
     
}

package timeline;

public class ComputerComponent  extends Component {

    public String specs;

    private String modelNumber;
    
    private String manufacturer;

    private int price2018;
    
    private int releaseYear; 
    
    public String getSpecs(){
        
       return specs; 
       
     } // end of get specs    
       
    public void setSpecs (String s){
                                             
       specs = s; 
    
    } // end of set specs
    
    
   public String getModelNumber(){
        
        return modelNumber;
        
    }// end of get model number    
        
     public void setModelNumber(String mn){
        
       modelNumber = mn;
        
    }// end of set model number    
            
        
   public String getManufacturer(){
       
       return manufacturer;
       
   } // end of get manufacturer
   
   public void setManufacturer(String m){
       
       manufacturer = m;
       
   } // end of set manufacturer
   
   public int getPrice2018(){
       
       return price2018;
       
   } // end of get price
   
   public void setPrice2018(int p){
       
      price2018 = p;
       
   } // end of set price
   
   public int getReleaseYear(){
       
       return releaseYear;
       
   }// end of get release year
   
     public void setReleaseYear(int r){
       
      releaseYear= r;
       
   } // end of set release year
   

} //end of class

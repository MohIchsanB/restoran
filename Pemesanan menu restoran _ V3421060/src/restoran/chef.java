package restoran;

// CLASS Object
public class chef {
    private int chefId; //variabel 
    private String name;
    
//constructor	
public chef(int id,String nama)
   { 
       this.chefId=id;
	   this.name=nama;
	   
    }

public int chefId(){ //method assesor
        return chefId;
    }
  
public String chefName(){ //method assesor
        return name;
    }	

}

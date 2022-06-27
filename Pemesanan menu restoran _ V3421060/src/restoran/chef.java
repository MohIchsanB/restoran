package restoran;

// CLASS Object
public class chef {
    private int chefId; //variabel / attribut
    private String name;
    
	
public chef(int id,String nama)
   { //method assesor
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
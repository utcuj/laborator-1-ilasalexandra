package utility;
import java.util.Comparator;

import raw.Tren;

public class ComparatorTren implements Comparator<Tren>{

	 @Override
	    public int compare(Tren a, Tren b) {
	      	if( a.getOraPlecare().getHours() < b.getOraPlecare().getHours())
	    	  return -1;
	    	 if(a.getOraPlecare().getHours() == b.getOraPlecare().getHours())
	    	 {
	    		 if(a.getOraPlecare().getMinutes()<b.getOraPlecare().getMinutes())
	    			 return -1;
	    		 if(a.getOraPlecare().getMinutes()>b.getOraPlecare().getMinutes())
	    			 return 1;
	    		 else
	    			 return 0;
	    			 
	    	 }
	    	 else 
	    		 return 1;
	    	 

	    }
}

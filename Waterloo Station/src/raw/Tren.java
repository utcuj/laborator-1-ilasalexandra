package raw;
import java.sql.Time;

public class Tren {

	private String destinatie;
	private Time oraPlecare;
	private String id;
	
	public Tren(String destinatie,Time oraPlecare,String id){
		this.destinatie=destinatie;
		this.oraPlecare=oraPlecare;
		this.id=id;
	}
	public String getDestinatie() {
		return destinatie;
	}
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}
	public Time getOraPlecare() {
		return oraPlecare;
	}
	public void setOraPlecare(Time oraPlecare) {
		this.oraPlecare = oraPlecare;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}

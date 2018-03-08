package utility;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import raw.Gara;
import raw.Tren;

public class Test {
	
	private Gara gara=new Gara();
	
	public void initialize(){
		List<Tren> trenuri= new ArrayList<Tren>(5);
		Tren tren1=new Tren("Berlin",new Time(10,1,0),"AC1");
		Tren tren2=new Tren("Munchen",new Time(5,1,0),"AC2");
		Tren tren3=new Tren("Frankfurt",new Time(16,1,0),"AC3");
		Tren tren4=new Tren("Dusseldorf",new Time(10,31,0),"AC4");
		Tren tren5=new Tren("Koln",new Time(13,1,0),"AC5");
		trenuri.add(tren1);
		trenuri.add(tren2);
		trenuri.add(tren3);
		trenuri.add(tren4);
		trenuri.add(tren5);
		this.gara.setTrenuri(trenuri);
		
	}
	
	public void sortare(){
		Collections.sort(this.gara.getTrenuri(),new ComparatorTren());
	}

	public Gara getGara() {
		return gara;
	}

	public void setGara(Gara gara) {
		this.gara = gara;
	}
	
	
}

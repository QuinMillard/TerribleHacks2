
public class Haiku {
	HaikuLine firstLine = new HaikuLine(5);
	HaikuLine secondLine = new HaikuLine(7);
	HaikuLine thirdLine = new HaikuLine(5);
	Haiku(){
		
	}
	String getLine(int x){
		if(x == 0){
			return firstLine.getLine();
		}else if(x == 1){
			return secondLine.getLine();
		}else if(x == 2){
			return thirdLine.getLine();
		}else{
			return "#terriblehack";
		}
	}
}

public enum Rank {
	Ace (1), Two (2), Three (3), Four (4), Five (5), Six (6), Seven (7), Eight (8), Nine (9), 
	Ten (10), Jack (11), Queen (12), King (13);
	int value;
	private Rank(int val){
		this.value = val; 
	}
	//handle ace case
	public int getValue(){
		return this.value;
	}
	public static Rank getRankFromValue(int value){
		if (value == 1 || value == 14){
			return Ace;
		}
		else if(value == 2){
			return Two;
		}
		else if(value == 3){
			return Three;
		}
		else if(value == 4){
			return Four;
		}
		else if(value == 5){
			return Five;
		}
		else if (value == 6){
			return Six;
		}
		else if(value == 7){
			return Seven;
		}
		else if(value == 8){
			return Eight;
		}
		else if(value == 9){
			return Nine;
		}
		else if(value == 10){
			return Ten;
		}
		else if (value == 11){
			return Jack;
		}
		else if(value == 12){
			return Queen;
		}
		else if (value == 13){
			return King;
		}
		return null;
		
	}
}

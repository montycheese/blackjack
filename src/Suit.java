public enum Suit {
	Spade (0), Club (1), Heart (2), Diamond (3);
	private int value;
	private Suit(int val){
		this.value = val;
	}
	public int getValue(){return this.value;}
	public static Suit getSuitFromValue(int value){
		switch(value){
			case 0:
				return Spade;
			case 1:
				return Club;
			case 2:
				return Heart;
			case 3:
				return Diamond;
			default:
				return null;
		}
	}
}

public class RandomCharacter {
    public static void main (String [] args) {
		char ch = getRandomCharacter ('\u0000', '\uFFFF');
		System.out.println (ch);
	}

	public static char getRandomCharacter (char ch1, char ch2) {
		return (char) (ch1 + Math.random () * (ch2 - ch1 + 1));
	}
  
}



public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		int a = 0;
    boolean yes = false;

    while (a + 10 <= e.length() && !yes) {
        String digits = e.substring(a, a + 10);
        double dNum = Double.parseDouble(digits);

        if (isPrime(dNum)) {
            System.out.println(digits);
            yes = true;
        }
        a++;
    }
	}
	
	public static boolean isPrime(double d){
		if(dNum < 2){
    			return false;
		}
  		for(int i = 2; i <= Math.sqrt(dNum); i++)
    			if(dNum % i == 0)
      				return false;
  		return true;
	}



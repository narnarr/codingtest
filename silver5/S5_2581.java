package silver5;

// PrimeNumber
public class S5_2581 {
	
	public static void main(String[] args) {
		
		int N = 30;
		boolean[] notPrime = new boolean[N+1];
		
		notPrime[0] = notPrime[1] = true;
		
		for (int i=2; i*i<=N; i++) {
			if (notPrime[i] == false) {
				for (int j=i*i; j<=N; j+=i) {
					notPrime[j] = true;
				}
			}
		}
		
		for (int i=0; i<=N; i++) {
			if (notPrime[i] == false) System.out.println(i);
		}
	}

}

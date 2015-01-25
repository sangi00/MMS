package mms;

public class MMS_lib {
	
	private double lambda, mu, rho;
	private int n;

	public MMS_lib(double lambda, double mu, int n) {
		super();
		this.lambda = lambda;
		this.mu = mu;
		this.n = n;
		this.rho = lambda/mu;
	}
	
	public int getFactorial(int k){
		int fact = 1;
		if(k == 0){
			fact = 1;
		}
		else{
			for(int i = k; k >0; k--){
				fact *= k;
			}
		}
		return fact; 
	}
	
	public double getC(){
		double c = 0, c1 = 0, c2 = 0;
		for(int k = 0 ; k < n ; k++){
			c1 += Math.pow(rho, k)/this.getFactorial(k);
		}
		c2 = Math.pow(rho, n)/this.getFactorial(n-1)/(n-rho);
		c = 1/(c1+c2);
		return c;
	}
	
	public double getLq(){
		double lq = this.getC()*Math.pow(rho, n+1)/this.getFactorial(n-1)/Math.pow(n-rho, 2);
		return lq;
	}

}

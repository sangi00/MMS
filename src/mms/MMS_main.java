package mms;

import java.util.Scanner;

public class MMS_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Lambda ->");
		double lambda = Double.parseDouble(scan.next());
		System.out.print("Input Service Rate ->");
		double mu = Double.parseDouble(scan.next());
		System.out.print("Input Number of Servier ->");
		int n = Integer.parseInt(scan.next());
		
		MMS_lib mms = new MMS_lib(lambda, mu, n);
		System.out.println("平均待ち人数Lq= " + mms.getLq());

	}

}

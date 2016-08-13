package practice;

import java.util.HashMap;
import java.util.Map;

public class InterviewMain {

	// CIDR
	public InterviewMain() {
	}
	
	public void printMask(int startIp, int size) {
		Map<Integer, Integer> ipMask = new HashMap<Integer, Integer>();
		int bitMask = 0;
		int endIp = startIp + size - 1;
		int ip = startIp;
		/*for (int i=1; i<=32; i++) {
			if ((int) Math.pow(2, i) <= size) {
				bitMask = 32 - i;
			}
			else
				break;
		}*/
		int x = size;
		int n = 0;
		while (x/2 > 0) {
			x = x/2;
			n++;
		}
		bitMask = 32 - n;
		while (ip <= endIp) {
			if (ip % (int) Math.pow(2,32-bitMask) == 0) {
				ipMask.put(ip, bitMask);
				ip += (int) Math.pow(2,32-bitMask);
			}
			//System.out.println(ip + " - " + bitMask);
			bitMask++;
			if (bitMask > 32)
				break;
		}
		for (Integer i: ipMask.keySet()) 
			System.out.println(i + ", " + ipMask.get(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewMain m = new InterviewMain();
		m.printMask(16, 51);
		System.out.println("---");
		m.printMask(17, 10);
	}

}

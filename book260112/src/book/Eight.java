package book;

import java.util.Date;

public class Eight {
	public static void main(String[] args) {
		Date now=new Date();
		Date one=new Date(0);
		Date two=new Date(1543872152);
		Date[] caos=new Date[3];
		caos[0]=now;
		caos[1]=one;
		caos[2]=two;
		Date min;
		Date max;
		Date middle;
		for(int i=0;i<caos.length;i++) {
			if(caos[i].compareTo(caos[i+1])>0) {
				
			}
		}
	}
}

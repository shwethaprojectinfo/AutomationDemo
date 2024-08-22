package genericLabrories;

import java.util.Random;

public class JavaUtilitise1 {
	public int getRandomNum(int num) {
		Random n=new Random();
		int ranNum=n.nextInt(0,50)+num;
		return ranNum;
		}

}

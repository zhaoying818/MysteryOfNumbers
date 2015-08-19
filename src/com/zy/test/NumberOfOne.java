package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��19�� ����4:41:45 
 */
public class NumberOfOne {
	
	
	public static int getNum1(int n){
		int count = 0;
		int factor = 1;
		int lowNum = 0;
		int currNum = 0;
		int highNun = 0;
		while(n/factor!=0){
			lowNum = n-(n/factor)*factor;
			currNum = (n/factor)%10;
			highNun = n/(factor*10);
			switch(currNum){
			case 0:
				count += highNun*factor;
				break;
			case 1:
				count +=highNun*factor+lowNum+1;
				break;
			default:
				count += (highNun+1)*factor;
			}
			factor *= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("1�к���" + getNum1(1) + "��1");
		System.out.println("2�к���" + getNum1(2) + "��1");
		System.out.println("12�к���" + getNum1(12) + "��1");
		System.out.println("111�к���" + getNum1(111) + "��1");

	}

}

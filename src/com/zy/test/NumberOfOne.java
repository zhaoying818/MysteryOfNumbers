package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��19�� ����4:41:45 
 */
public class NumberOfOne {
	
	/**
	 * �������n��1�ĸ���
	 * @param n
	 * @return
	 */
	public static int count1InAinteger(int n){
		int num = 0;
		while(n!=0){
			num += (n%10==1)?1:0;
			n /= 10;
		}
		return num;
	}
	/**
	 * �������(1,2,����N)��1�ĸ���֮��
	 * @param n
	 * @return
	 */
	public static int getNum1(int n){
		int count = 0;
		for(int i=1;i<=n;i++)
			count += count1InAinteger(i);
		return count;
	}

	public static void main(String[] args) {
		System.out.println("1�к���" + getNum1(1) + "��1");
		System.out.println("2�к���" + getNum1(2) + "��1");
		System.out.println("12�к���" + getNum1(12) + "��1");
		System.out.println("111�к���" + getNum1(111) + "��1");

	}

}

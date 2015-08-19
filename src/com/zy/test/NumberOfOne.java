package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月19日 下午4:41:45 
 */
public class NumberOfOne {
	
	/**
	 * 求解数字n中1的个数
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
	 * 求解数字(1,2,…，N)中1的个数之和
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
		System.out.println("1中含有" + getNum1(1) + "个1");
		System.out.println("2中含有" + getNum1(2) + "个1");
		System.out.println("12中含有" + getNum1(12) + "个1");
		System.out.println("111中含有" + getNum1(111) + "个1");

	}

}

package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月21日 上午10:49:11 
 */
public class GCD {
	
	/**
	 * 辗转相除法
	 * @param m
	 * @param n
	 * @return
	 */
	public static int gcd(int x,int y){
		return (y==0)?x:gcd(y,x%y);
	}

	public static void main(String[] args) {
		int ret = gcd(40,32);
		System.out.println("40和32的最大公约数:" + ret);

	}

}

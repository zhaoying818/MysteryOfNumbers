package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月21日 上午11:04:38 
 */
public class GCD2 {
	
	/**
	 * 辗转相减法
	 */
	public static int gcd(int x,int y){
		if(x<y)
			return gcd(y,x);
		if(y==0)
			return x;
		else
			return gcd(x-y,y);
	}

	public static void main(String[] args) {
		int ret = gcd(40,32);
		System.out.println("40和32的最大公约数:" + ret);

	}

}

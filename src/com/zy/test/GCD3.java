package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月21日 上午11:13:30 
 */
public class GCD3 {
	
	/**
	 * 辗转相减法与相除法相结合求最大公约数
	 */
	public static int gcd(int x,int y){
		if(x<y)
			return gcd(y,x);
		if(y==0)
			return x;
		else{
			if(isEven(x)){
				if(isEven(y))
					return ((gcd(x>>1,y>>1))<<1);
				else
					return gcd(x>>1, y);
			}
			else{
				if(isEven(y))
					return gcd(x,y>>1);
				else
					return gcd(y,x-y);
			}
		}
	}
	/**
	 * 判断是否为偶数
	 * @param m
	 * @return
	 */
	public static boolean isEven(int m){
		if(m%2==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int ret = gcd(40,32);
		System.out.println("40和32的最大公约数:" + ret);

	}

}

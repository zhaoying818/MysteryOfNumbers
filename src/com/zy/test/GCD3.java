package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��21�� ����11:13:30 
 */
public class GCD3 {
	
	/**
	 * շת���������������������Լ��
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
	 * �ж��Ƿ�Ϊż��
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
		System.out.println("40��32�����Լ��:" + ret);

	}

}

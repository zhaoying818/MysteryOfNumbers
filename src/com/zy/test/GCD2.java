package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��21�� ����11:04:38 
 */
public class GCD2 {
	
	/**
	 * շת�����
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
		System.out.println("40��32�����Լ��:" + ret);

	}

}

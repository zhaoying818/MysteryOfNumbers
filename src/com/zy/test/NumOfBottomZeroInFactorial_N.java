package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月18日 下午8:05:54 
 */
public class NumOfBottomZeroInFactorial_N {
	
	public static int countNum(int n){
		int result = 0;
		int tmp = factorial(n);
		while(tmp>0){
			if(tmp%10==0){
				result++;
				tmp /= 10;
			}
			else
				break;
		}
		return result;
	}
	
	public static int factorial(int x){
		if(x==0 || x==1)
			return 1;
		else
			return x*factorial(x-1);
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println(n + "!的末尾有" + countNum(n) + "个0");
	}

}

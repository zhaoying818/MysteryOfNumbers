package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月18日 下午8:05:54 
 */
public class NumOfBottomZeroInFactorial_N {
	
	/**
	 * 通过质因数分解(2^X)*(3^Y)*(5^Z)来求解
	 * @param n
	 * @return
	 */
	public static int countNum(int n){
		int result = 0;
		for(int i=1;i<=n;i++){
			int j = i;
			while(j%5==0){
				result++;
				j /= 5;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println(n + "!的末尾有" + countNum(n) + "个0");
	}

}

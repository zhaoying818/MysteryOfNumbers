package com.zy.test;

/**
 * 
 * @author ZhaoYing
 * 求二进制数中1的个数
 */
public class CountOfOneInBinarySystem {
	
	/**
	 * MIT HAKMEM算法
	 * @param n
	 * @return
	 */
	public static int countOfOneInBinS(int n){
		int num;
		num = n - ((n>>1)&033333333333)
				- ((n>>2)&011111111111); 
		num = (num + (num>>3))&030707070707;
		num = num % 63;
		return num;
	}
	

	public static void main(String[] args) {
		System.out.println("3中1的个数为:" + countOfOneInBinS(3));
		System.out.println("13中1的个数为:" + countOfOneInBinS(13));
		System.out.println("130中1的个数为:" + countOfOneInBinS(130));

	}

}

package com.zy.test;

/**
 * 
 * @author ZhaoYing
 * �����������1�ĸ���
 */
public class CountOfOneInBinarySystem {
	
	/**
	 * MIT HAKMEM�㷨
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
		System.out.println("3��1�ĸ���Ϊ:" + countOfOneInBinS(3));
		System.out.println("13��1�ĸ���Ϊ:" + countOfOneInBinS(13));
		System.out.println("130��1�ĸ���Ϊ:" + countOfOneInBinS(130));

	}

}

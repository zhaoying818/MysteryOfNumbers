package com.zy.test;

/**
 * 
 * @author ZhaoYing
 * 求二进制数中1的个数
 */
public class CountOfOneInBinarySystem {
	
//	public static int countOfOneInBinS(int n){
//		int num = 0;
//		while(n>0){
//			if(n%2==1)
//				num++;
//			n = (byte) (n/2);
//		}
//		return num;
//	}
	
	
//	/**
//	 * 移位之后，使用位操作判断是否存在1
//	 */
//	public static int countOfOneInBinS(int n){
//		int num = 0;
//		while(n>0){
//			num += n &0x01;
//			n >>= 1;
//		}
//		return num;
//	}
	
	public static int countOfOneInBinS(int n){
		int num =0;
		while(n>0){
			n &= (n-1);
			num++;
		}
		return num;
	}
	

	public static void main(String[] args) {
		System.out.println("3中1的个数为:" + countOfOneInBinS(3));
		System.out.println("13中1的个数为:" + countOfOneInBinS(13));
		System.out.println("130中1的个数为:" + countOfOneInBinS(130));

	}

}

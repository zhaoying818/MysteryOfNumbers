package com.zy.test;

/**
 * 
 * @author ZhaoYing
 * �����������1�ĸ���
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
//	 * ��λ֮��ʹ��λ�����ж��Ƿ����1
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
		System.out.println("3��1�ĸ���Ϊ:" + countOfOneInBinS(3));
		System.out.println("13��1�ĸ���Ϊ:" + countOfOneInBinS(13));
		System.out.println("130��1�ĸ���Ϊ:" + countOfOneInBinS(130));

	}

}

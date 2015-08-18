package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��18�� ����8:38:04 
 */
public class PositionOfLowestOneinFactorial_N {
	
	/**
	 * ת��Ϊ���N!�к���������2�ĸ���
	 * @param n
	 * @return
	 */
	public static int lowestOne(int n){
		int ret = 0;
		while(n>0){
			n >>= 1;
			ret += n;
		}
		return ret+1;
	}

	public static void main(String[] args) {
		System.out.println(lowestOne(4));

	}

}

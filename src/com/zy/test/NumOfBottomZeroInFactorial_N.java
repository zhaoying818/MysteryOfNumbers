package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��18�� ����8:05:54 
 */
public class NumOfBottomZeroInFactorial_N {
	
	/**
	 * NumOfBottomZeroInFactorial_N2.0�����ĸĽ�
	 * @param n
	 * @return
	 */
	public static int countNum(int n){
		int result = 0;
		while(n>0){
			result += n/5;
			n /= 5;
		}
		return result;
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println(n + "!��ĩβ��" + countNum(n) + "��0");
	}

}

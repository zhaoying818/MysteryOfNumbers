package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��9��1�� ����9:38:09 
 */
public class RightShiftKBit {
	
	/**
	 * ����ѭ�������ƶ�Kλ
	 * @return
	 */
	public static int[] getRightShiftK(int[] a, int k){
		int len = a.length;
		while((k--)>0){
			int t= a[len-1];
			for(int i = len-1;i>0;i--)
				a[i]= a[i-1];
			a[0]= t;
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a= {1,2,3,4,5,6,7,8,9};
		int k=5;
		int[] res = getRightShiftK(a, k);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i] + " ");
	}

}

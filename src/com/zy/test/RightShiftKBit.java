package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年9月1日 下午9:38:09 
 */
public class RightShiftKBit {
	
	/**
	 * 数组循环向右移动K位
	 * 原数组看成两部分，分别进行交换
	 * 通过逆序来完成
	 * 
	 * 1.abcd1234（假设向右移动4位）
	 * 2.dcba1234
	 * 3.dcba4321
	 * 4.1234abcd
	 * @return
	 */
	public static int[] getRightShiftK(int[] a, int k){
		int len = a.length;
		k %= len;
		reverse(a, 0, len-k-1);
		reverse(a,len-k,len-1);
		reverse(a,0,len-1);
		return a;
	}
	
	public static int[] reverse(int[] a,int left,int right){
		while(left<right){
			int temp = a[right];
			a[right] = a[left];
			a[left] = temp;
			left++;
			right--;
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

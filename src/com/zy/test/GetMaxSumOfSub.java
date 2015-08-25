package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月25日 上午10:17:09
 * 
 * 求数组的子数组之和的最大值
 * 要求:1.字数组连续
 *      2.只需要求和，不需要返回最大位置
 *      3.元素是整数，可能包含整数、负数和零 
 */
public class GetMaxSumOfSub {
	
	/**
	 * 假设我们已经知道(A[k].....A[n-1])最大的一段数组和为All[k]，
	 * 并且已经计算出在(A[k].....A[n-1])中包含A[k]的最大的一段数组和为Start[k]，
	 * 那么可以推断出All[k-1]=max{A[k-1]，A[k-1]+Start[k]，All[k]}，
	 * 利用动态规划思想以及这样的递推公式，从后往前计算
	 */
	public static int getMaxSum(int[] a ){
		int len = a.length;
		int Start= a[len-1];
		int All = a[len-1];
		for(int i=len-2;i>=0;i--){
			Start = Math.max(a[i], a[i]+Start);
			All = Math.max(Start, All);
		}
		return All;
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,-8,6};
		int MAXSUM = getMaxSum(a);
		System.out.println(MAXSUM);

	}

}

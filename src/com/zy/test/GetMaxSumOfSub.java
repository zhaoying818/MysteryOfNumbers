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
	 * 遍历法
	 */
	public static int getMaxSum(int[] a ){
		int maxSum = Integer.MIN_VALUE;
		int Sum;
		for(int i=0;i<a.length;i++){
			Sum = 0;
			for(int j=i;j<a.length;j++){
				Sum += a[j];
				if(Sum>maxSum)
					maxSum = Sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,-8,6};
		int MAXSUM = getMaxSum(a);
		System.out.println(MAXSUM);

	}

}

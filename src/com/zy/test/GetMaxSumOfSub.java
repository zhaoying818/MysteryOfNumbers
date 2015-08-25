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
	 * 返回子数组和最大值以及，子数组的始末位置
	 * 求最大和，那就一直累加呗，只要大于0，就说明当前的“和”可以继续增大，
	 * 如果小于0了，说明“之前的最大和”已经不可能继续增大了，就从新开始
	 */
	public static int[] getMaxSum(int[] a ){
		int maxSum = Integer.MIN_VALUE;
	    int sum = 0;
	    int start = 0;
	    int curStart = 0;
	    int end= 0;
	    for(int i = 0; i < a.length; ++i)
	    {
	        if(sum < 0)
	        {
	            sum = a[i];
	            curStart = i;//记录当前起始位置 
	        }else
	        {
	            sum += a[i];
	        }
	        if(sum > maxSum)
	        {
	            maxSum = sum;
	            start = curStart;
	            end = i;
	        }
	    }
	    return new int[]{maxSum,start,end};
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,-8,6};
		int[] MAXSUM = getMaxSum(a);
		System.out.println("子数组和的最大值:" + MAXSUM[0]);
		System.out.println("起始位置:" + MAXSUM[1]);
		System.out.println("结束位置:" + MAXSUM[2]);

	}

}

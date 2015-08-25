package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月25日 上午11:35:31 
 */
public class GetMaxSumOfSubBothAdjacent {
	
	/**
	 * 数组首尾相邻的情况，先求原问题的最大子数组,然后减去连续子数组和的最小值
	 * 
	 */
	public static int getSum(int[] a){
		//取出跨界时的最大和子数组
		int maxSumAdj;
		int totalSum = 0;
	    int minSum = Integer.MAX_VALUE;
		int tempMinSum = 0;
	    for(int i = 0; i < a.length; ++i)
	    {
	        if(tempMinSum > 0)
	        {
	        	tempMinSum = a[i];
	        }else
	        {
	        	tempMinSum += a[i];
	        }
	        if(tempMinSum < minSum)
	        {
	        	minSum = tempMinSum;
	        }
	        totalSum += a[i];
	        
	    }
	    maxSumAdj = totalSum - minSum;
	    //取得不跨界时的最大和子数组
	    int maxSumNotAdj = new GetMaxSumOfSub().getMaxSum(a)[0]; 
	    return Math.max(maxSumAdj, maxSumNotAdj);
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,3,6};
		int MAXSUM = getSum(a);
		System.out.println("子数组和的最大值:" + MAXSUM);
		

	}

}

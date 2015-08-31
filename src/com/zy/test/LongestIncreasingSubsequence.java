package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月31日 下午9:27:45 
 */
public class LongestIncreasingSubsequence {
	
	public static int getLIS(int[] a){
		int[] LIS = new int[a.length];
		for(int i=0;i<a.length;i++){
			LIS[i]=1;
			for(int j=0;j<i;j++){
				if(a[i]>a[j] && LIS[j]+1>LIS[i])
					LIS[i] = LIS[j]+1;
			}
		}
		int maxLIS = 1;
		for(int i=0;i<a.length;i++)
			maxLIS = Math.max(maxLIS, LIS[i]);
		return maxLIS;
	}

	
	
	public static void main(String[] args) {
		int[] a = {1,-1,2,-3,4,-5,6,-7};
		int maxLIS = getLIS(a);
		System.out.println(maxLIS);

	}

}

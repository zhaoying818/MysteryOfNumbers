package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月31日 下午9:27:45 
 */
public class LongestIncreasingSubsequence {
	
	public static int getLIS(int[] a){

		int[] LIS = new int[a.length];
		//记录数组中的递增序列信息
		int[] MaxV = new int[a.length+1];
		MaxV[1] = a[0];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
			min = Math.min(min, a[i]);
		MaxV[0] = min - 1;
		
		//初始化最长递增序列的信息
		for(int i=0;i<LIS.length;i++)
			LIS[i] = 1;
		
		int maxLIS = 1;
		for(int i=1;i<a.length;i++){
			//遍历历史最长递增序列信息
			int j;
			for(j=maxLIS;j>=0;j--){
				if(a[i]>MaxV[j]){
					LIS[i] = j+1;
					break;
				}
			}
			//如果当前最长序列大于最长递增序列长度，更新最长信息
			if(LIS[i]>maxLIS){
				maxLIS = LIS[i];
				MaxV[LIS[i]] = a[i];
			}
			else if(MaxV[j]<a[i] && a[i]<MaxV[j+1]){
				MaxV[j+1] = a[i];
			}
		}
		return maxLIS;
	}

	
	
	public static void main(String[] args) {
		int[] a = {1,-1,2,-3,4,-5,6,-7};
		int maxLIS = getLIS(a);
		System.out.println(maxLIS);

	}

}

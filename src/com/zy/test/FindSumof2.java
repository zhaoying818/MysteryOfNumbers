package com.zy.test;

import java.util.Arrays;

/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月24日 下午5:45:37 
 */
public class FindSumof2 {
	
	/**
	 * 先排序，然后双向遍历
	 * @param a
	 * @return
	 */
	public static int[] findSum(int a[] ,int sum){
		Arrays.sort(a);
		int i = 0;
		int j = a.length-1;
		while(i<j){
			if(a[i]+a[j]>sum)
				j--;
			else if(a[i]+a[j]<sum)
				i++;
			else
				return new int[]{a[i],a[j]};
		}
		return null;
	}

	public static void main(String[] args) {
		int[] a = {5,6,1,4,7,9,8};
		int[] ret = findSum(a, 10);
		System.out.println("和为10的一对元素为:" + ret[0] + " "+ ret[1]);

	}

}

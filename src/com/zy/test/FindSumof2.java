package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月24日 下午5:45:37 
 */
public class FindSumof2 {
	
	/**
	 * 遍历法
	 * @param a
	 * @return
	 */
	public static int[] findSum(int a[] ,int sum){
		int len = a.length;
		int index1=0,index2=0;
		for(int i=0;i<len-1;i++)
			for(int j=i+1;j<len;j++){
				if(a[i]+a[j]==sum){
					return new int[]{a[i],a[j]};
				}
			
			}
		return null;
	}

	public static void main(String[] args) {
		int[] a = {5,6,1,4,7,9,8};
		int[] ret = findSum(a, 10);
		System.out.println("和为10的一对元素为:" + ret[0] + " "+ ret[1]);

	}

}

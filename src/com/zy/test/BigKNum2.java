package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月21日 上午10:06:59 
 */
public class BigKNum2 {
	
	/**
	 * 求数组中的最大值
	 * @param a
	 * @return
	 */
	public static int findMax(int[] a){
		int temp = a[0];
		for(int i=1;i<a.length;i++){
			if(temp<a[i])
				temp = a[i];
		}
		return temp;
	}
	/**
	 * 空间换时间
	 * @param a
	 * @param k
	 * @return
	 */
	public static int[] bigK(int[] a,int k){
		int MaxN = findMax(a);
		int[] count = new int[MaxN+1];
		for(int i=0;i<=MaxN;i++){
			count[i] = 0;
		}
		for(int j=0;j<a.length;j++){
			count[a[j]]++;
		}
		int[] ret = new int[k];
		int i = 0;
		for(int sumCount=0,v=MaxN;v>=0;v--){
			sumCount += count[v];
			if(count[v]!=0){
				ret[i] = v;
				i++;
			}
			if(sumCount>=k)
				break;
		}
		return ret;
			
		
		
	}

	public static void main(String[] args) {
		int[] a = {20,100,4,2,87,9,8,5,46,26};
		int k=2;
		int[] result = bigK(a, k);
		for(int i=0;i<k;i++)
			System.out.print(result[i] + " ");

	}

}

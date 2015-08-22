package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月22日 上午10:25:08 
 */
public class SearchMaxAndMin {
	
	public static int[] searchMaxAndMin(int[] a){
		
		int MAX = Integer.MIN_VALUE;
		int MIN = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(MAX<a[i])
				MAX = a[i];
		}
		for(int i=0;i<a.length;i++){
			if(MIN>a[i])
				MIN = a[i];
		}
		int[] ret = new int[]{MAX,MIN};
		return ret;
	}

	public static void main(String[] args) {
		int [] a = {5,6,8,3,7,9,2};
		int [] ret = searchMaxAndMin(a);
		System.out.println("MAX of Array: " + ret[0]);
		System.out.println("MIN of Array: " + ret[1]);


	}

}

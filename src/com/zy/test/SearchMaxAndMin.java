package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月22日 上午10:25:08 
 */
public class SearchMaxAndMin {
	
	public static int[] searchMaxAndMin(int[] a){
		int MAX = Integer.MIN_VALUE;
		int MIN = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length-1;i+=2){
			if(a[i]<a[i+1]){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		for(int i=0;i<a.length;i+=2){
			if(MAX<a[i])
				MAX = a[i];
		}
		for(int i=1;i<a.length;i+=2){
			if(MIN>a[i])
				MIN = a[i];
		}
		if(a.length%2!=0){
			if(MIN>a[a.length-1])
				MIN = a[a.length-1];
		}

		int [] ret = new int[]{MAX,MIN};
		return ret;
	}
		
		
		
		
	public static void main(String[] args) {
		int [] a = {5,6,8,7,3,9,2};
		int [] ret = searchMaxAndMin(a);
		
		System.out.println("MAX of Array: " + ret[0]);
		System.out.println("MIN of Array: " + ret[1]);
	}

}

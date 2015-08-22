package com.zy.test;

/**
 * @author ZhaoYing E-mail:zhaoying1258@qq.com
 * @version Creation-time：2015年8月22日 上午10:25:08
 */
public class SearchMaxAndMin {

	public static int[] searchMaxAndMin(int[] a) {
		int MAX = Integer.MIN_VALUE;
		int MIN = Integer.MAX_VALUE;

		for (int i = 0; i < a.length - 1; i += 2) {
			if (a[i] < a[i + 1]) {
				if (a[i + 1] > MAX)
					MAX = a[i + 1];
				if (a[i] < MIN)
					MIN = a[i];
			} else {
				if (a[i] > MAX)
					MAX = a[i];
				if (a[i + 1] < MIN)
					MIN = a[i + 1];
			}
		}
			
		if(a.length%2!=0){
			if(MAX<a[a.length-1])
				MAX = a[a.length-1];
			if(MIN>a[a.length-1])
				MIN = a[a.length-1];
		}

		int[] ret = new int[] { MAX, MIN };
		return ret;
	}

	public static void main(String[] args) {
		int[] a = { 5, 6, 8, 7, 3, 9, 2 };
		int[] ret = searchMaxAndMin(a);

		System.out.println("MAX of Array: " + ret[0]);
		System.out.println("MIN of Array: " + ret[1]);
	}

}
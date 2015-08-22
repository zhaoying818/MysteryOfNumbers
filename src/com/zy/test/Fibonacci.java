package com.zy.test;

/**
 * @author ZhaoYing E-mail:zhaoying1258@qq.com
 * @version Creation-time：2015年8月22日 上午9:59:58
 */
public class Fibonacci {

	/**
	 * 递归方法
	 */
	public static int fibonacci(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci(3) = " + fibonacci(3));

	}

}

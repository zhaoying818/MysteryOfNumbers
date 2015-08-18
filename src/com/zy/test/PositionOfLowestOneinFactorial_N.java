package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月18日 下午8:38:04 
 */
public class PositionOfLowestOneinFactorial_N {
	
	/**
	 * 转换为求解N!中含有质因数2的个数
	 * @param n
	 * @return
	 */
	public static int lowestOne(int n){
		int ret = 0;
		while(n>0){
			n >>= 1;
			ret += n;
		}
		return ret+1;
	}

	public static void main(String[] args) {
		System.out.println(lowestOne(4));

	}

}

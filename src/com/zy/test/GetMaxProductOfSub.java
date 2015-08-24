package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月24日 下午7:54:24 
 */
public class GetMaxProductOfSub {
	
	public static long getMaxProduct(long[] a ){
		if(a.length==0)
			return Integer.MIN_VALUE;
		long [] pro = new long[a.length];
		long MAXPRO = Integer.MIN_VALUE;
		pro[0] = a[0];
		for(int i = 1; i < a.length; i++)
		{
			pro[i] = pro[0];//将pro[i]赋值成a[0]~a[i-1]的乘积
			pro[0] *= a[i];
		}
		pro[0] = 1;
		for(int i = a.length-1; i > 0; i--)
		{
			pro[i] *= pro[0];//在原来的乘积基础上，乘上a[i+1]~a[N-1]的乘积
			pro[0] *= a[i];
			if(pro[i]>MAXPRO)
				MAXPRO = pro[i];
		}
		return MAXPRO;	
	}

	public static void main(String[] args) {
		long[] a = {-2,5,3,-6,4,1,2};
		long MAX = getMaxProduct(a);
		System.out.println(MAX);

	}

}

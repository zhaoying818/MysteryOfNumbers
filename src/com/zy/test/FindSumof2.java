package com.zy.test;

import java.util.Arrays;

/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��24�� ����5:45:37 
 */
public class FindSumof2 {
	
	/**
	 * ������Ȼ��˫�����
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
		System.out.println("��Ϊ10��һ��Ԫ��Ϊ:" + ret[0] + " "+ ret[1]);

	}

}

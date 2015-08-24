package com.zy.test;

import java.util.Arrays;

/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��24�� ����7:31:26 
 */
public class FindSumof3 {
	
	/**
	 * �������е�����Ԫ�أ�����a[i]+a[j]+a[k]=sum
	 * @param a
	 * @param sum
	 * @return
	 */
	public static int[] findSum(int[] a ,int sum){
		Arrays.sort(a);
		int len = a.length;
		for(int k=0;k<len;k++){
			int i = 0;
			int j= len-1;
			if(k==i) i++;
			if(k==j) j--;
			int sub = sum - a[k];
			while(i<j){
				if(a[i]+a[j]>sub)
					j--;
				else if(a[i]+a[j]<sub)
					i++;
				else
					return new int[]{a[i],a[j],a[k]};
			}
			
		}
		return null;
	}

	public static void main(String[] args) {
		int[] a = {5,6,1,4,7,9,8};
		int sum = 18;
		int[] ret = findSum(a, sum);
		System.out.println("��Ϊ" + sum + "������Ԫ��Ϊ:" + ret[0] + " "+ ret[1] + " " + ret[2]);

	}

}

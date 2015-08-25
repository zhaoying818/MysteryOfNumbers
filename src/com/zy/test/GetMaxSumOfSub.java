package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��25�� ����10:17:09
 * 
 * �������������֮�͵����ֵ
 * Ҫ��:1.����������
 *      2.ֻ��Ҫ��ͣ�����Ҫ�������λ��
 *      3.Ԫ�������������ܰ����������������� 
 */
public class GetMaxSumOfSub {
	
	/**
	 * ������
	 */
	public static int getMaxSum(int[] a ){
		int maxSum = Integer.MIN_VALUE;
		int Sum;
		for(int i=0;i<a.length;i++){
			Sum = 0;
			for(int j=i;j<a.length;j++){
				Sum += a[j];
				if(Sum>maxSum)
					maxSum = Sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,-8,6};
		int MAXSUM = getMaxSum(a);
		System.out.println(MAXSUM);

	}

}

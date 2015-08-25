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
	 * �����ͣ��Ǿ�һֱ�ۼ��£�ֻҪ����0����˵����ǰ�ġ��͡����Լ�������
	 * ���С��0�ˣ�˵����֮ǰ�����͡��Ѿ������ܼ��������ˣ��ʹ��¿�ʼ
	 */
	public static int getMaxSum(int[] a ){
		int maxSum = Integer.MIN_VALUE;
	    int sum = 0;
	    for(int i = 0; i < a.length; ++i)
	    {
	        if(sum < 0)
	        {
	            sum = a[i];
	        }else
	        {
	            sum += a[i];
	        }
	        if(sum > maxSum)
	        {
	            maxSum = sum;
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

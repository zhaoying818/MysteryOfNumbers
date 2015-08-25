package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��25�� ����11:35:31 
 */
public class GetMaxSumOfSubBothAdjacent {
	
	/**
	 * ������β���ڵ����������ԭ��������������,Ȼ���ȥ����������͵���Сֵ
	 * 
	 */
	public static int getSum(int[] a){
		//ȡ�����ʱ������������
		int maxSumAdj;
		int totalSum = 0;
	    int minSum = Integer.MAX_VALUE;
		int tempMinSum = 0;
	    for(int i = 0; i < a.length; ++i)
	    {
	        if(tempMinSum > 0)
	        {
	        	tempMinSum = a[i];
	        }else
	        {
	        	tempMinSum += a[i];
	        }
	        if(tempMinSum < minSum)
	        {
	        	minSum = tempMinSum;
	        }
	        totalSum += a[i];
	        
	    }
	    maxSumAdj = totalSum - minSum;
	    //ȡ�ò����ʱ������������
	    int maxSumNotAdj = new GetMaxSumOfSub().getMaxSum(a)[0]; 
	    return Math.max(maxSumAdj, maxSumNotAdj);
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,3,6};
		int MAXSUM = getSum(a);
		System.out.println("������͵����ֵ:" + MAXSUM);
		

	}

}

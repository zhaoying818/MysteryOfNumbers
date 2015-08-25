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
	 * ���������Ѿ�֪��(A[k].....A[n-1])����һ�������ΪAll[k]��
	 * �����Ѿ��������(A[k].....A[n-1])�а���A[k]������һ�������ΪStart[k]��
	 * ��ô�����ƶϳ�All[k-1]=max{A[k-1]��A[k-1]+Start[k]��All[k]}��
	 * ���ö�̬�滮˼���Լ������ĵ��ƹ�ʽ���Ӻ���ǰ����
	 */
	public static int getMaxSum(int[] a ){
		int len = a.length;
		int[] Start = new int[len];
		int[] All = new int[len];
		Start[len-1] = a[len-1];
		All[len-1] = a[len-1];
		for(int i=len-2;i>=0;i--){
			Start[i] = Math.max(a[i], a[i]+Start[i+1]);
			All[i] = Math.max(Start[i], All[i+1]);
		}
		return All[0];
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,-8,6};
		int MAXSUM = getMaxSum(a);
		System.out.println(MAXSUM);

	}

}

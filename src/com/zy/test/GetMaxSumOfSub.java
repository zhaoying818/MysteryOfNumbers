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
		int Start= a[len-1];
		int All = a[len-1];
		for(int i=len-2;i>=0;i--){
			Start = Math.max(a[i], a[i]+Start);
			All = Math.max(Start, All);
		}
		return All;
	}

	public static void main(String[] args) {
		int[] a = {-2,5,3,-6,4,-8,6};
		int MAXSUM = getMaxSum(a);
		System.out.println(MAXSUM);

	}

}

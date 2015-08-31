package com.zy.test;

/**
 * @author ZhaoYing E-mail:zhaoying1258@qq.com
 * @version Creation-time��2015��8��31�� ����7:36:27
 */
public class GetMaxSumOfSub_2D {

	/**
	 * ���ò��ֺ����Ӿ���ĺ͵����ֵ �ռ任ʱ��
	 */

	public static int[][] PS(int[][] a) {
		int rowLen = a.length; // ����
		int cowLen = a[0].length; // ����
		int[][] PS = new int[rowLen][cowLen];
		for (int i = 0; i < rowLen; i++)
			PS[i][0] = 0;
		for (int j = 0; j < cowLen; j++)
			PS[0][j] = 0;
		for (int i = 1; i < rowLen; i++)
			for (int j = 1; j < cowLen; j++)
				PS[i][j] = PS[i - 1][j] + PS[i][j - 1] - PS[i - 1][j - 1] + a[i][j];

		return PS;
	}

	public static int getMaxSumOfSub(int[][] a) {
		int maxSum = Integer.MIN_VALUE;
		int rowLen = a.length; // ����
		int cowLen = a[0].length; // ����
		// �Ѷ�ά��������һ�£������������ֱ�+1,��һ�У���һ�ж���0
		int[][] a1 = new int[rowLen + 1][cowLen + 1];
		for (int i = 0; i <= rowLen; i++)
			a1[i][0] = 0;
		for (int j = 0; j <= cowLen; j++)
			a1[0][j] = 0;
		for (int i = 1; i <= rowLen; i++)
			for (int j = 1; j <= cowLen; j++)
				a1[i][j] = a[i - 1][j - 1];
		
		//���㲿�ֺ;���
		int[][] PS = PS(a1);

		for (int i = 1; i <= rowLen; i++)
			for (int ii = i; ii <= rowLen; ii++)
				for (int j = 1; j <= cowLen; j++)
					for (int jj = j; jj <= cowLen; jj++)
						maxSum = Math.max(maxSum, (PS[ii][jj]-PS[i][jj]-PS[ii][j] +PS[i][j]));
		return maxSum;
	}

	public static void main(String[] args) {
		int[][] a = { { -1, 0, 2 }, { 2, 1, -1 }, { -2, 5, -3 } };
		int MAX = getMaxSumOfSub(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				System.out.print(a[i][j] + "   ");
			System.out.println();
		}
		System.out.println("�Ӿ��������Ӿ���֮��Ϊ: " + MAX);

	}

}

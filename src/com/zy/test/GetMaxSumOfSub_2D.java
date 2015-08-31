package com.zy.test;

/**
 * @author ZhaoYing E-mail:zhaoying1258@qq.com
 * @version Creation-time：2015年8月31日 下午7:36:27
 */
public class GetMaxSumOfSub_2D {

	/**
	 * 利用部分和求子矩阵的和的最大值 空间换时间
	 */

	public static int[][] PS(int[][] a) {
		int rowLen = a.length; // 行数
		int cowLen = a[0].length; // 列数
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
		int rowLen = a.length; // 行数
		int cowLen = a[0].length; // 列数
		// 把二维数组扩充一下，行数和列数分别+1,第一行，第一列都是0
		int[][] a1 = new int[rowLen + 1][cowLen + 1];
		for (int i = 0; i <= rowLen; i++)
			a1[i][0] = 0;
		for (int j = 0; j <= cowLen; j++)
			a1[0][j] = 0;
		for (int i = 1; i <= rowLen; i++)
			for (int j = 1; j <= cowLen; j++)
				a1[i][j] = a[i - 1][j - 1];
		
		//计算部分和矩阵
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
		System.out.println("子矩阵的最大子矩阵之和为: " + MAX);

	}

}

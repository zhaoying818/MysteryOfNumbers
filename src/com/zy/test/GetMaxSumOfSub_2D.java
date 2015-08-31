package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��31�� ����7:36:27 
 */
public class GetMaxSumOfSub_2D {
	
	/**
	 * ���������Ӿ���ĺ͵����ֵ
	 */
	public static int getMaxSumOfSub(int[][] a){
		int maxSum = Integer.MIN_VALUE;
		int rowLen = a.length; //����
		int cowLen = a[0].length; //����
		for(int i=0;i<rowLen;i++)
			for(int ii = i;ii<rowLen;ii++)
				for(int j=0;j<cowLen;j++)
					for(int jj = j;jj<cowLen;jj++)
						maxSum = Math.max(maxSum, getSum2D(a,i,ii,j,jj));
		return maxSum;
	}
	
	public static int getSum2D(int[][]a ,int iMin,int iMax,int jMin,int jMax){
		int sum = 0;
		for(int i = iMin;i<=iMax;i++)
			for(int j = jMin;j<=jMax;j++)
				sum += a[i][j];
		return sum;
	}

	public static void main(String[] args) {
		int[][] a ={{-1,0,2},{2,1,-1},{-2,5,-3}};
		int MAX = getMaxSumOfSub(a);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j] + "   ");
			System.out.println();
		}
		
		System.out.println("�Ӿ��������Ӿ���֮��Ϊ: " + MAX);

	}

}

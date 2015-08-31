package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��31�� ����9:27:45 
 */
public class LongestIncreasingSubsequence {
	
	public static int getLIS(int[] a){

		int[] LIS = new int[a.length];
		//��¼�����еĵ���������Ϣ
		int[] MaxV = new int[a.length+1];
		MaxV[1] = a[0];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
			min = Math.min(min, a[i]);
		MaxV[0] = min - 1;
		
		//��ʼ����������е���Ϣ
		for(int i=0;i<LIS.length;i++)
			LIS[i] = 1;
		
		int maxLIS = 1;
		for(int i=1;i<a.length;i++){
			//������ʷ�����������Ϣ
			int j;
			for(j=maxLIS;j>=0;j--){
				if(a[i]>MaxV[j]){
					LIS[i] = j+1;
					break;
				}
			}
			//�����ǰ����д�����������г��ȣ��������Ϣ
			if(LIS[i]>maxLIS){
				maxLIS = LIS[i];
				MaxV[LIS[i]] = a[i];
			}
			else if(MaxV[j]<a[i] && a[i]<MaxV[j+1]){
				MaxV[j+1] = a[i];
			}
		}
		return maxLIS;
	}

	
	
	public static void main(String[] args) {
		int[] a = {1,-1,2,-3,4,-5,6,-7};
		int maxLIS = getLIS(a);
		System.out.println(maxLIS);

	}

}

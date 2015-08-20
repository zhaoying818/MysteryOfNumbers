package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��20�� ����10:45:31 
 */
public class BigKNum {
	
	public static int[] bigK(int[] a, int k){
		int len = a.length;
		if(k<=0)
			return null;
		if(len<=k)
			return a;
		int[] ret = new int[k];
		for(int i=0;i<k;i++)
			ret[i] = a[i];
		//ǰk����������С��
		myMinHeap(ret, k);
		//�ѵ�k+1��Ԫ���빹������С�ѽ��бȽ�
		for (int i = k; i < len; i++) {
			if (ret[0] <a[i]){
				ret[0] = a[i];
				adjustminHeap(ret, 0, k-1);//����������˺ð���
			}
		}
		return ret;
	}
	/**
	 * ���˹���:���ڵ����С�Ķ��ӽ���
	 */
	public static void adjustminHeap(int[] a,int pos,int len ){
		int temp;
		int child;
		for(temp=a[pos];2*pos+1<=len;pos=child){
			child = 2*pos+1;
			if(child<len && a[child]>a[child+1])
				child++;
			if(a[child]<temp)
				a[pos] = a[child];
			else
				break;
		}
		a[pos] = temp;	
	}
	
	//���ѹ��̣�������С��,�����һ����㿪ʼ����Ϊ��С��  
	public static void myMinHeap(int[] arr ,int size)  {   
		for(int i=size/2-1;i>=0;i--)  
			adjustminHeap(arr,i,size-1);  
	 }  
	
	public static void main(String[] args){
		int[] a = {20,100,4,2,87,9,8,5,46,26};
		int k=4;
		int[] result = bigK(a, k);
		for(int i=0;i<k;i++)
			System.out.print(result[i] + " ");
	}

}

package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月20日 上午10:45:31 
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
		//前k个数构建最小堆
		myMinHeap(ret, k);
		//把第k+1个元素与构建的最小堆进行比较
		for (int i = k; i < len; i++) {
			if (ret[0] <a[i]){
				ret[0] = a[i];
				adjustminHeap(ret, 0, k-1);//在这里纠结了好半天
			}
		}
		return ret;
	}
	/**
	 * 下滤过程:父节点与较小的儿子交换
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
	
	//建堆过程，建立最小堆,从最后一个结点开始调整为最小堆  
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

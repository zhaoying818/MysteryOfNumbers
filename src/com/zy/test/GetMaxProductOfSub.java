package com.zy.test;

import java.util.Arrays;

/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��24�� ����7:54:24 
 */
public class GetMaxProductOfSub {
	
	
	/**
	 * ʹ��ͳ�Ʒ���
	 * ��������������Ԫ�صĳ˻���P
	 * ��P == 0,�����������ٰ���һ��0Ԫ�أ���ȥ��0Ԫ�غ�����Ԫ�صĳ˻���ΪQ
	 *     ��Q == 0���������а���2������2�����ϵ�0Ԫ�أ�����������ô��������ȥ��N-1����Ԫ�أ�
	 *               ������ĳ˻�����0��������������˻���0
	 *     ��Q > 0�����ȥ��0Ԫ�غ���������������������˻�
	 *     ��Q < 0����������������������������۽�0Ԫ�����滻�����е���������һ��Ԫ�صõ��ĳ˻�����0������Q��
	 *              �ʴ�ʱ����������˻���0���������б��������0Ԫ��
	 * ��P > 0��
	 *     �������д�����Ԫ�أ���ȥ����С����Ԫ�ؼ���
	 *     �������в�������Ԫ�أ���ȥ������ֵ���ĸ�Ԫ�ؼ���
	 * ��P < 0,����������д�����������Ԫ�أ����ݸ���������ȥ������ֵ��С�ĸ������ɵõ�������ĳ˻��������
	 */
	public static long getMaxProduct(long[] a ){
		long subPRO = 1;
		int zeroNum = 0;  
	    int negativeNum = 0;  
	    int positiveNum = 0;  
	    long maxNegative = Long.MIN_VALUE;
	    long minNegative = 0;  
	    long minPositive = Long.MAX_VALUE;  
	    int zeroIndex = 0;
	    
	    for(int i = 0; i < a.length; i++) {  
	        if(a[i] == 0) {  
	            zeroNum++;  
	            zeroIndex = i;  
	        }  
	        else if(a[i] < 0) {  
	            negativeNum++;  
	            if(a[i] > maxNegative)  
	                maxNegative = a[i];  
	            if(a[i] < minNegative)  
	                minNegative = a[i];  
	        }  
	        else {
	            positiveNum++;
	            if(a[i] < minPositive){
	            	minPositive = a[i];
	            }
	               
	        }  
	    }
	    
	    //��������а�������������������0����ô������ĳ˻��϶�Ϊ0  
	    if(zeroNum>=2)
	    	return 0;
	    //���������ֻ����һ��0����ô�����������  
	    //1.ȥ����0Ԫ�������������ĳ˻�Ϊ������ôȥ����0Ԫ�غ����õ�������˻����  
	    //2.ȥ����0Ԫ�������������ĳ˻�Ϊ������ô���������ĳ˻�Ϊ0���������б������0Ԫ��  
	    if(zeroNum==1){
	    	for(int i=0;i<a.length;i++){
	    		if(i!=zeroIndex)
	    			subPRO *= a[i];
	    	}
	    	if(subPRO>0)
	    		return subPRO;//ȥ����0Ԫ�������������ĳ˻�Ϊ������ôȥ����0Ԫ�غ����õ�������˻����  
	    	else
	    		return 0;//ȥ����0Ԫ�������������ĳ˻�Ϊ������ô���������ĳ˻�Ϊ0���������б������0Ԫ��
	    }
	    
	    //��P > 0
	    if(negativeNum%2==0){
	    	//�������в�������Ԫ�أ���ȥ������ֵ���ĸ�Ԫ�ؼ���	   	
	    	if(positiveNum>0){
		    	for(int i=0;i<a.length;i++){
		    		if(a[i]!=minPositive)
		    			subPRO *= a[i];
		    	}
	    	}
	    	//�������в�������Ԫ�أ���ȥ������ֵ���ĸ�Ԫ�ؼ���
	    	else{
	    		for(int i=0;i<a.length;i++){
		    		if(a[i]!=minNegative)
		    			subPRO *= a[i];
		    	}
	    	}
	    }
	    //��P < 0,����������д�����������Ԫ�أ����ݸ���������ȥ������ֵ��С�ĸ������ɵõ�������ĳ˻��������
	    else{
	    	for(int i=0;i<a.length;i++){
	    		if(a[i]!=maxNegative)
	    			subPRO *= a[i];
	    	}
	    }
	    return subPRO;
	}


	public static void main(String[] args) {
		long[] a = {-2,5,3,-6,4,1,2};
		long MAX = getMaxProduct(a);
		System.out.println(MAX);

	}

}

package com.zy.test;

import java.util.Arrays;

/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月24日 下午7:54:24 
 */
public class GetMaxProductOfSub {
	
	
	/**
	 * 使用统计方法
	 * 假设数组中所有元素的乘积是P
	 * 若P == 0,则数组中至少包含一个0元素，出去该0元素后所有元素的乘积记为Q
	 *     若Q == 0，则数组中包含2个或者2个以上的0元素，无论我们怎么从数组中去（N-1）个元素，
	 *               子数组的乘积总是0，故子数组的最大乘积是0
	 *     若Q > 0，则除去该0元素后的子数组就是子数组的最大乘积
	 *     若Q < 0，则表明有奇数个负数，次数无论将0元素来替换数组中的其它任意一个元素得到的乘积总是0，大于Q，
	 *              故此时子数组的最大乘积是0，子数组中必须包含该0元素
	 * 若P > 0，
	 *     若数组中存在正元素，则去掉最小的正元素即可
	 *     若数组中不存在正元素，则去掉绝对值最大的负元素即可
	 * 若P < 0,则表明数组中存在奇数个负元素，根据负负得正，去掉绝对值最小的负数即可得到子数组的乘积最大的组合
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
	    
	    //如果数组中包含两个或者两个以上0，那么子数组的乘积肯定为0  
	    if(zeroNum>=2)
	    	return 0;
	    //如果数组中只包含一个0，那么分两个情况：  
	    //1.去除该0元素其余所有数的乘积为正，那么去除该0元素后所得的子数组乘积最大  
	    //2.去除该0元素其余所有数的乘积为负，那么子数组最大的乘积为0，子数组中必须包含0元素  
	    if(zeroNum==1){
	    	for(int i=0;i<a.length;i++){
	    		if(i!=zeroIndex)
	    			subPRO *= a[i];
	    	}
	    	if(subPRO>0)
	    		return subPRO;//去除该0元素其余所有数的乘积为正，那么去除该0元素后所得的子数组乘积最大  
	    	else
	    		return 0;//去除该0元素其余所有数的乘积为负，那么子数组最大的乘积为0，子数组中必须包含0元素
	    }
	    
	    //若P > 0
	    if(negativeNum%2==0){
	    	//若数组中不存在正元素，则去掉绝对值最大的负元素即可	   	
	    	if(positiveNum>0){
		    	for(int i=0;i<a.length;i++){
		    		if(a[i]!=minPositive)
		    			subPRO *= a[i];
		    	}
	    	}
	    	//若数组中不存在正元素，则去掉绝对值最大的负元素即可
	    	else{
	    		for(int i=0;i<a.length;i++){
		    		if(a[i]!=minNegative)
		    			subPRO *= a[i];
		    	}
	    	}
	    }
	    //若P < 0,则表明数组中存在奇数个负元素，根据负负得正，去掉绝对值最小的负数即可得到子数组的乘积最大的组合
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

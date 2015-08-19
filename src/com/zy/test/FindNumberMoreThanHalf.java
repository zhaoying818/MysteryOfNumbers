package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月19日 下午4:28:07 
 */
public class FindNumberMoreThanHalf {
	
	public static int findNum(int[] nums){
		int ret = -1;
		int len = nums.length;
		int nTimes = 0;
		for(int i=0;i<len;i++){
			if(nTimes==0){
				ret = nums[i];
				nTimes = 1;
			}
			else{
				if(ret == nums[i])
					nTimes++;
				else
					nTimes--;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,2,2,2,5,6,8};
		System.out.println("出现次数超过一半的数字为:" + findNum(nums));

	}

}

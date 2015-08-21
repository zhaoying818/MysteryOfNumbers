package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time：2015年8月21日 上午11:22:51 
 */
public class RepresentFloatingPointExactly {
	
	/**
	 * 求最大公约数，用于约分
	 */
	public static long gcd(long x,long y){
		if(x<y)
			return gcd(y,x);
		if(y==0)
			return x;
		else
			return gcd(x-y,y);
	}
	
	public static String represtFP(String str){
		char[] c = str.toCharArray(); //输入的字符串转化为字符数组
		int cLen = c.length;
		StringBuffer strInt = new StringBuffer();
		StringBuffer strLimit = new StringBuffer();
		StringBuffer strUnlimit = new StringBuffer();
		
		int posDot = 0; //点号的位置
		int posLeftBra = 0; //左括号位置
		int PosRightBra = 0;//右括号位置
		
		for(int i=0;i<cLen;i++){
			if(c[i]=='.')
				posDot = i;
			if(c[i]=='(')
				posLeftBra = i;
			if(c[i]==')')
				PosRightBra = i;
		}
		for(int i=0;i<posDot;i++)
			strInt.append(c[i]);
		if(posLeftBra>0){
			for(int i=posDot+1;i<posLeftBra;i++)
			strLimit.append(c[i]);
		for(int i=posLeftBra+1;i<PosRightBra;i++)
			strUnlimit.append(c[i]);
		}
		else{
			for(int i=posDot+1;i<cLen;i++)
				strLimit.append(c[i]);
		}
		
		//StringBuffer转换为String
		String sInt = strInt.toString();
		String sLimit = strLimit.toString();
		String sUnlimit = strUnlimit.toString();
		
		//计算整数部分、不循环部分和循环部分的长度
		int strLenInt = strInt.length();
		int strLenLimit = strLimit.length();
		int strLenUnlimit = strUnlimit.length();
		
		long numInt = 0;
		long numLimit= 0;
		long numUnlimit =0;
		if(strLenInt>0)
			numInt = Long.parseLong(sInt);
		if(strLenLimit>0)
			numLimit = Long.parseLong(sLimit);
		if(strLenUnlimit>0)
			numUnlimit = Long.parseLong(sUnlimit);
		
//		System.out.println(numInt);
//		System.out.println(numLimit);
//		System.out.println(numUnlimit);
		
		
		long denominator;//分母
		long numerator;//分子
		if(strLenUnlimit>0){
			denominator = (long) ((Math.pow(10, strLenUnlimit)-1)*(Math.pow(10, strLenLimit)));
			long limit = (long) (numLimit*(Math.pow(10, strLenUnlimit)-1));
			numerator = limit + numUnlimit + numInt*denominator;
		}	
		else{
			denominator = (long)(Math.pow(10, strLenLimit));
			numerator = numLimit + numInt*denominator;
		}
//		System.out.println(denominator);
//		System.out.println(numerator);
		
		//约分
		long GCD = gcd(numerator, denominator);
		numerator /= GCD;
		denominator /= GCD;
		
		String fenzi = String.valueOf(numerator);
		String fenmu = String.valueOf(denominator);
		
		String ret = fenzi + "/" + fenmu;
		return ret;
	}

	public static void main(String[] args) {
		
		System.out.println("1.3可以精确表示为：" + represtFP("1.3"));
		System.out.println("1.3(3)可以精确表示为：" + represtFP("1.3(3)"));
		System.out.println("1.02(3)可以精确表示为：" + represtFP("1.02(3)"));
	}

}

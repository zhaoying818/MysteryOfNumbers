package com.zy.test;
/** 
 * @author ZhaoYing E-mail:zhaoying1258@qq.com 
 * @version Creation-time��2015��8��21�� ����11:22:51 
 */
public class RepresentFloatingPointExactly {
	
	/**
	 * �����Լ��������Լ��
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
		char[] c = str.toCharArray(); //������ַ���ת��Ϊ�ַ�����
		int cLen = c.length;
		StringBuffer strInt = new StringBuffer();
		StringBuffer strLimit = new StringBuffer();
		StringBuffer strUnlimit = new StringBuffer();
		
		int posDot = 0; //��ŵ�λ��
		int posLeftBra = 0; //������λ��
		int PosRightBra = 0;//������λ��
		
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
		
		
		//StringBufferת��ΪString
		String sInt = strInt.toString();
		String sLimit = strLimit.toString();
		String sUnlimit = strUnlimit.toString();
		
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
		
		
		long denominator;//��ĸ
		long numerator;//����
		if(strLenUnlimit>0){
			denominator = (long) ((Math.pow(10, strLenUnlimit)-1)*(Math.pow(10, strLenLimit)));
			long limit = (long) (numLimit*(Math.pow(10, strLenUnlimit)-1));
			numerator = limit + numUnlimit + numInt*denominator;
		}	
		else{
			denominator = (long)(Math.pow(10, strLenLimit));
			numerator = numLimit + numInt*denominator;
		}
		System.out.println(denominator);
		System.out.println(numerator);
		
		//Լ��
		long GCD = gcd(numerator, denominator);
		numerator /= GCD;
		denominator /= GCD;
		
		String fenzi = String.valueOf(numerator);
		String fenmu = String.valueOf(denominator);
		
		String ret = fenzi + "/" + fenmu;
		return ret;
	}
	
	
	

	public static void main(String[] args) {
		String num = new String("1.(3)");
		System.out.println(represtFP(num));

	}

}

package array;

/**
 * 要求：输入一个数字n，按照顺序打印出从1到最大的n为十进制。 比如输入3，则打印出1、2、3……一直到最大的3位数999
 * 
 * 考点 1. 当n的值很大的时候，将会溢出 2. 如果用+1方式打印，要处理最大的N位数 3. 如果用0-9的排列组合，考察递归 4. 不能打印出最前面的0
 * 
 * 当遇到有关数的时候，我们要考虑一下是否会出现数据特别大的情况，假如出现，可以通过数组或字符串进行替换处理
 * 
 * @author Helen
 *
 */

public class PrintMaxNum {
	public void printMaxNum(int n) {
		if (n <= 0) return;
		StringBuffer sb = new StringBuffer("");
		while (n-- > 0) {
			sb.append('0');
		}
		
		while(!increment(sb)) {
			printMaxNum(sb);
		}
	}
	
	/**
	 * 注意进位
	 * @param sb
	 * @return
	 */
	public boolean increment(StringBuffer sb) {
		boolean isOverflow = false;
		int nTakeover = 0;
		int nLength = sb.length();
		for (int i = nLength - 1; i >= 0; i--) {
			int nSum = sb.charAt(i) - '0' + nTakeover;
			if (i == nLength - 1) {
				nSum++;
			}
			if (nSum >= 10) {
				if (i == 0) {
					isOverflow = true;
				} else {
					nTakeover = 1;
					nSum -= 10;
					sb.setCharAt(i, (char)('0' + nSum));
				}
			} else {
				sb.setCharAt(i, (char)('0' + nSum));
				break;
			}
		}
		return isOverflow;
	}
	
	/**
	 * 注意不要打印前面的0
	 * @param sb
	 */
	public void printMaxNum(StringBuffer sb) {
		boolean isBegin0 = true;
		int nLength = sb.length();
		for (int i = 0; i < nLength; i++) {
			if (isBegin0 && sb.charAt(i) != '0') {
				isBegin0 = false;
			}
			if (!isBegin0) {
				System.out.print(sb.charAt(i));
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PrintMaxNum p = new PrintMaxNum();
		p.printMaxNum(3);
	}
}

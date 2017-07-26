package array;

/**
 * Ҫ������һ������n������˳���ӡ����1������nΪʮ���ơ� ��������3�����ӡ��1��2��3����һֱ������3λ��999
 * 
 * ���� 1. ��n��ֵ�ܴ��ʱ�򣬽������ 2. �����+1��ʽ��ӡ��Ҫ��������Nλ�� 3. �����0-9��������ϣ�����ݹ� 4. ���ܴ�ӡ����ǰ���0
 * 
 * �������й�����ʱ������Ҫ����һ���Ƿ����������ر��������������֣�����ͨ��������ַ��������滻����
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
	 * ע���λ
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
	 * ע�ⲻҪ��ӡǰ���0
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

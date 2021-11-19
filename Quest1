public class Quest1 {

    public static void main(String[] args) {
		// 【问题二】
		int[] arr = new int[]{0x268cb43, 0x7ff, 0x2b7b, 0x123a, 0xf6, 0x282};
		for (int num : arr) {
            System.out.println(zigZagToInt(num));
        }
	}
	
	private static int zigZagToInt(int num) {
        return (num >>> 1) ^ -(num & 1);
    }
}

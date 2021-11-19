public class Quest4 {

    public static void main(String[] args) {
		Integer[] intArr = Arrays.stream(inArr).map(element -> new BigInteger(element, 16).intValue()).toArray(Integer[]::new);
		System.out.println(validUtf8(intArr).getKey() ? 1 : 0);
		
		Integer[] utf8IntArr = Arrays.stream(utf8Arr).map(element -> new BigInteger(element, 16).intValue()).toArray(Integer[]::new);
		System.out.println(validUtf8(utf8IntArr).getValue());
	}
	
	public static Pair<Boolean, Integer> validUtf8(Integer[] data) {
		int sum = 0;
        int n = 0;
		for (Integer datum : data) {
			if (n > 0) {
				if (datum >> 6 != 0b10) {
                    return new Pair<>(false, 0);
                }
				n--;
                if (n == 0) {
                    sum++;
                }
			}else if (datum >> 7 == 0) {
				n = 0;
                sum++;
			} else if (datum >> 5 == 0b110) {
				n=1;
			} else if (datum >> 4 == 0b1110) {
				n=2;
			} else if (datum >> 3 == 0b11110) {
				n=3;
			} else {
                return new Pair<>(false, 0);
            }
		}
		return new Pair<>(n == 0, sum);
	}
	
}

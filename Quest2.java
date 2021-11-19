public class Quest2 {

    public static void main(String[] args) {
		// 【问题一】
		// 思路：主要问题在0上面，只要0位置前面的数字有一个是大于数字到该位置的距离就可以，反之不可以
		// 【问题二】
		String numStr = "12,4,7,6,0,0,0,0,0";
		String[] arr = numStr.split(",");
		// Integer[] numArr = Arrays.stream(arr).map(Integer::parseInt).toArray(Integer[]::new);
    System.out.println(check(new Integer[]{3,4,7,4,0,0,0,0,0,0,4,5}));
	}
	
	private static boolean check(Integer[] numArr) {
		if (numArr.length < 2) {
            return false;
        }
		for (int i = 0; i < numArr.length - 1; i++) {
			if (numArr[i] == 0) {// 找到0位置
				// 看0前面是否都满足
				boolean can = false;
				for (int j = i-1; j >= 0; j--) {
					if (numArr[j] > i - j) {
						can = true;
						break;
					}
				}
				if (!can) {
            return false;
        }
			}
		}
		return true;
	}
	public static boolean canJump(Integer[] nums) {
		if (nums.length == 1) {
            return true;
        }
		int coverRange = nums[0];
		for (int i = 0; i <= coverRange; i++) {
			// 更新下：当前位置能达到的最远位置
			coverRange = Math.max(coverRange, i + nums[i]);
			// 如果最远位置达到最后一位，则能通过
			if (coverRange >= nums.length - 1) {
				return true;
			}
		}
		 return false;
	}
}

public class Quest5 {

    public static void main(String[] args) {
		System.out.println(check(Integer.parseInt(inStr)) ? 1 : 0);
	}
	
	private static boolean check(long num) {
		if (num < 1) {
            return false;
        }
		return (num & (num - 1)) == 0;
	}
	
}

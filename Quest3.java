public class Quest3 {

    public static void main(String[] args) {
		System.out.println(Math.round(getP(0.31) * 100) + "%");
	}
	
	public static int getC(int p) {
		if (p <= 0) {
            return 0;
        }
		double min = 0;
        double max = 100;
        while (true) {
			double middle = ((min + max) / 2);
			double temp = getP(middle / 100.0);
			int tempPer = (int) Math.round(temp * 100);
			if (tempPer == p) {
				return (int) Math.round(middle);
			} else if (tempPer > p) {
				max = middle;
			} else {
                min = middle;
            }
		}
	}
	
	public static double getP(double c) {
		if (c <= 0) {
            return 0;
        }
		int count = (int) Math.ceil(1 / c);
		double temp = 1;
        double last = 0;
        double sum = 0;
		for (int i = 1; i <= count; i++) {
			temp -= last;
            last = temp * Math.min(1, (c * i));
            sum += last * i;
		}
		return 1 / sum;
	}
}

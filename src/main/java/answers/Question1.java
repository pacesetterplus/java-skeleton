package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int arraySize = portfolios.length;
		int pMaxDecimalValue = (int) (Math.pow(2,16)-1);

	      if (arraySize<=100) {
			if (arraySize < 2) {
				return -1;
			}
			int maxValue = 0;
			for (int i = 0; i < 2; i++) {
				if (portfolios[i] > pMaxDecimalValue) {
					return -1;
				}
				maxValue = maxValue ^ portfolios[i];
			}
			int currentMaxValue = maxValue;
			for (int i = 2; i < arraySize; i++) {
				currentMaxValue = currentMaxValue ^ (portfolios[i] - portfolios[i - 2]);
				maxValue = Math.max(maxValue, currentMaxValue);
			}
			return maxValue;
		}
	      
	      return -1;
	}
}

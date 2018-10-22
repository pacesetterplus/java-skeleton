package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int maxEvaluationValue = 0;
		int arraySize = portfolios.length;
		int pMaxDecimalValue = (int) (Math.pow(2,16)-1);

		if(arraySize<=100) {
			
			for (int i = 0; i < arraySize; i++) {
				int portfolio = portfolios[i];
				if(portfolio > pMaxDecimalValue)
					return -1;
				for (int j = i+1; j < arraySize; j++) {
					maxEvaluationValue = Math.max(bitwiseXor(portfolio, portfolios[j]),maxEvaluationValue);
				}
			}
			return maxEvaluationValue;
		}
		
		
		return -1;
	}
	
	private static int bitwiseXor(int portfolio1, int portfolio2) {
		return portfolio1^portfolio2;
	}
}

package appraisalRating;

public class CalculationMethodsForRating {

	public static double moduleTotalAverage(int sumOfRating, int sumOfDenominator) {
		double averageForEachModule = 0;
		averageForEachModule = sumOfRating / sumOfDenominator;
		return averageForEachModule;

	}

	public static double actualScoreOfAModule(double moduleTotalAverage, int countOfModules) {
		double actualScore = 0;
		actualScore = moduleTotalAverage / countOfModules;
		return actualScore;
	}

	public static double finalScoreOfAllModules(double actualScores) {
		double finalScore = 0;

		return finalScore;
	}

	public static String displayFinalRating(double finalScore) {
		if (finalScore >= 4.1 && finalScore <= 5) {
			return "Outstanding";
		} else if (finalScore >= 3.1 && finalScore <= 4) {
			return "Excellent";
		} else if (finalScore >= 2.1 && finalScore <= 3) {
			return "Satisfactory ";
		} else if (finalScore >= 1.1 && finalScore <= 2) {
			return "Needs Improvement";
		} else if (finalScore >= 0 && finalScore <= 1) {
			return "Unsatisfactory";
		}
		return null;
	}

}

package abstractFactoryDesignpattern;

public class Main {

	public static void main(String[] args) {

		int entranceExamScore = 125;

		UniversityFactory abstractUniversityFactagy = UniversityFactory.getUniversityFactory(entranceExamScore);
		AdmitCard admitCard = abstractUniversityFactagy.getAdmitCard("Math");
		System.out.println(admitCard.getClass());

		FeeCalculator feeCalculator = abstractUniversityFactagy.getFeeCalculator("Math");
		System.out.println(feeCalculator.calculateFee());

		AdmitCard admitCardTwo = abstractUniversityFactagy.getAdmitCard("Physics");
		System.out.println(admitCardTwo.getClass());

		feeCalculator = abstractUniversityFactagy.getFeeCalculator("Physics");
		System.out.println(feeCalculator.calculateFee());

		AdmitCard admitCardThree = abstractUniversityFactagy.getAdmitCard("CS");
		System.out.println(admitCardThree.getClass());

		feeCalculator = abstractUniversityFactagy.getFeeCalculator("CS");
		System.out.println(feeCalculator.calculateFee());

		entranceExamScore = 105;

		UniversityFactory abstractUniversityFactoryTwo = UniversityFactory.getUniversityFactory(entranceExamScore);
		AdmitCard admitCardFour = abstractUniversityFactoryTwo.getAdmitCard("CS");
		System.out.println(admitCardFour.getClass());

		feeCalculator = abstractUniversityFactoryTwo.getFeeCalculator("CS");
		System.out.println(feeCalculator.calculateFee());

	}
}

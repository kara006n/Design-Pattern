package abstractFactoryDesignpattern;

public class PublicUniversityFactory extends UniversityFactory {

	@Override
	public AdmitCard getAdmitCard(String course) {
		
		
		switch (course) {
		case "Maths":
		return new USCAdmitCard();
		case "Physics":
		return new VSUAdmitCard();
		case "CS":
		return new ASUAmitCard();
		default:
		break;
		}
		return null;
	}

	@Override
	public FeeCalculator getFeeCalculator(String course) {

		switch (course) {
		case "Maths":
			return new UscCalutator();
		case "Physics":
			return new VsUFeeCalculator();
		case "CS":
			return new ASUFeeCalculator();
		default:
			break;
		}
		return null;
	}

}

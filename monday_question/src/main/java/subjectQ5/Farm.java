package subjectQ5;

/**
 * @author PiyushBodhani
 * 
 * We can Solve diamond problem with method overriding Or Multiple inheritance
 * but we can't solve diamond problem with method overloading
 * 
 */
public class Farm implements Goat , Chicken  {

	@Override
	public int weightOfChicken() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	public int QuatityOfFoodConsumesByChicken() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String nameOfAnimal() {
		// TODO Auto-generated method stub
		return "Chicken";
	}

	@Override
	public int profitEarnedByChicken() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public int weightOfGoat() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int QuatityOfFoodConsumesByGoat() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String nameOfSecondAnimal() {
		// TODO Auto-generated method stub
		return "Goat";
	}

	@Override
	public int profitEarnedByGoat() {
		// TODO Auto-generated method stub
		return 60;
	}

}

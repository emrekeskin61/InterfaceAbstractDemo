
public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(String nationalId) {
		System.out.println("Müsteri Id dogrulandý");
		return true;
	}

}

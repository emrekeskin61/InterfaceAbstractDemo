
public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(String nationalId) {
		System.out.println("M�steri Id dogruland�");
		return true;
	}

}

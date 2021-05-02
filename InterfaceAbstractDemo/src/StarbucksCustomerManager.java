public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		
		this.checkService = checkService;
	}

	@Override
	public void add(Customer customer) {
		
		if(this.checkService.checkIfRealPerson(customer.getNationalIdentity())) {
			System.out.println("Sb m�steri eklendi :" +customer.getFirstName());
		}
		
		
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Sb m�steri g�ncellendi :" +customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Sb m�steri silindi :" +customer.getFirstName());
	}

	@Override
	public void getall(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Sb M�steri Bilgileri ; " +customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getDateOfBirth()+" "+customer.getNationalIdentity());
		
	}

}

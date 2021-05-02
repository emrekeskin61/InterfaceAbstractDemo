import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Customer senpai=new Customer();
		senpai.setId(1);
		senpai.setFirstName("emre");
		senpai.setLastName("Keskin");
		senpai.setDateOfBirth(LocalDate.parse("2001-07-10"));
		senpai.setNationalIdentity("12345");
		BaseCustomerManager base=new StarbucksCustomerManager(new CustomerCheckManager());
	       BaseCustomerManager nero=new NeroCustomerManager();
	       nero.delete(senpai);
	       base.add(senpai);
	       base.getall(senpai);
		
	}

}

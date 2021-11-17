package tugas5.SignUp;

import com.github.javafaker.Faker;

public class RequestDataFaker {
	Faker faker = new Faker();
	
	public String requestEmail() {
		return faker.name().username() + "@gmail.com";
	}
	
	public String requestFullname() {
		return faker.name().fullName();
	}
	
	public String requestFirstname() {
		return faker.name().firstName();
	}
	
	public String requestLastname() {
		return faker.name().lastName();
	}
	
	public String requestPassword() {
		return faker.name().username()+"54321";
	}
	
	public String requestPhoneNumber() {
		return faker.phoneNumber().phoneNumber();
	}
}

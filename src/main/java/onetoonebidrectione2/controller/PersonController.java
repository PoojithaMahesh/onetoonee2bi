package onetoonebidrectione2.controller;

import onetoonebidrectione2.dao.PersonDao;
import onetoonebidrectione2.dto.AadharCard;
import onetoonebidrectione2.dto.Person;

public class PersonController {
public static void main(String[] args) {
	Person person=new Person();
//	person.setName("poojithaJM");
//	person.setAddress("Bangalore");
//	
//	AadharCard aadharCard=new AadharCard();
//	
//	aadharCard.setAge(18);
//	aadharCard.setName("poojithaJm");
//	aadharCard.setPerson(person);
//	
//
//	person.setAadharCard(aadharCard);
	
	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
////	personDao.updatePerson(1, person);
//	personDao.findPersonById(1);
   personDao.deleteAdharCardById(1);
}
}

import java.util.ArrayList;

public class PersonManagement {

    ArrayList<Person> persons;

    public PersonManagement() {
        persons=new ArrayList<>();
    }

    public void add(Person person)
    {
        persons.add(person);
    }
    public Person find (int id)
    {
        for (Person person:persons)
        {
            if (person.getId()==id)
            {
                return person;
            }
        }
        return null;
    }
    public void delete(int id)
    {
        for (Person person:persons)
        {
            if (person.getId()==id)
            {
                persons.remove(person);
            }


        }
    }
    public void show()
    {
        for (Person person:persons)
        {
            System.out.println("id:"+person.getId()+", firstname:"+person.getFirstName()+", lastname:"+ person.getLastName()+ ", age:"+person.getAge());
        }
    }
    public void update()
    {

    }
}

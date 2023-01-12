import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int menuItem=0;
        PersonManagement personManagement= new PersonManagement();

        while (true)
        {

            System.out.println("1. add a person");
            System.out.println("2. find a person");
            System.out.println("3. delete a person");
            System.out.println("4. edit a person");
            System.out.println("5. show all persons");
            menuItem= input.nextInt();

            switch (menuItem)
            {
                case 1:
                    System.out.println(" Enter id: ");
                    int id= input.nextInt();
                    System.out.println(" Enter name: ");
                    String name= input.next();
                    System.out.println(" Enter lastname: ");
                    String lastName= input.next();
                    System.out.println(" Enter age: ");
                    int age=input.nextInt();
                    Person person= new Person(id,name,lastName,age);
                    personManagement.add(person);
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    int findId=input.nextInt();
                    Person findPerson=personManagement.find(findId);
                    System.out.println("id:"+findPerson.getId()+", firstname:"+findPerson.getFirstName()+", lastname:"+ findPerson.getLastName()+ ", age:"+findPerson.getAge());

                    break;
                case 3:
                    System.out.println("Enter id: ");
                    int delId=input.nextInt();
                    personManagement.delete(delId);
                    break;
                case 4:
                    System.out.println("Enter id:");
                    int upId= input.nextInt();
                    Person findUpPerson= personManagement.find(upId);
                    System.out.println(" Enter id: ");
                    int newId= input.nextInt();
                    System.out.println(" Enter name: ");
                    String newName= input.next();
                    System.out.println(" Enter lastname: ");
                    String newLastName= input.next();
                    System.out.println(" Enter age: ");
                    int newAge=input.nextInt();
                    findUpPerson.setId(newId);
                    findUpPerson.setFirstName(newName);
                    findUpPerson.setLastName(newLastName);
                    findUpPerson.setAge(newAge);
                    break;
                case 5:
                    personManagement.show();
                    break;
            }


        }

    }
}
package by.mts.brest.java.classes_deeper;

public class Lesson10ClassessInner{

    public static void main(String[] args) {
//
        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();

        Person somePerson = new Person("Mike", "222");
        // Person.Account someAccount = new Person.Account("123");
        Person.Account someAccount = somePerson.new Account("333");
        System.out.println("somePerson = " + somePerson);
        System.out.println("someAccount = " + someAccount);
    }
}

class Person {

    private String name;
    Account account;

    Person(String name, String password){
        this.name = name;
        account = new Account(password);
        //account.password = "324";
    }
    public void displayPerson(){
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account{
        private String password;

        Account(String pass){
            // Person.this.name = "SomeName";
            this.password = pass;
        }
        void displayAccount(){
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }

        @Override
        public String toString() {
            return "Account{" +
                    "password='" + password + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}

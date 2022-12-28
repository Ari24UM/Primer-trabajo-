class Person {
    int age;
    String name;
    long phoneNumber;

    public Person(int age, String name, long phoneNumber) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Client extends Person {
    int credit;

    public Client(int age, String name, long phoneNumber, int credit) {
        super(age, name, phoneNumber);
        this.credit = credit;
    }
}

class Worker extends Person {
    int salary;

    public Worker(int age, String name, long phoneNumber, int salary) {
        super(age, name, phoneNumber);
        this.salary = salary;
    }
}

Person person = new Person(26, "Caleb", 244589080);
Client client = new Client(26, "Caleb", 244589080, 90000);
Worker worker = new Worker(26, "Caleb", 244589080, 50000);
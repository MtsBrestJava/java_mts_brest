package by.mts.brest.java.classes_deeper;

public class Human {

    // Поля класса
    public String name;
    protected String surname;
    int age;
    private int weight;

    public static int humansCount = 0;                      // Статическое поле - ОДНО для всего класса
    final int classId;
    static final String humansGreeting = "Приветствую вас дорогие друзья и гости, рад видеть вас!";      // Статическое финализированное поле - ОДНО НЕИЗМЕНЯЕМОЕ для всего класса

    {                                                       // Инициализатор - код, который выполняется ДО любого конструктора при создании ОБЪЕКТА этого КЛАССА
        humansCount++;
        classId = 14;
    }


    // ################################################################################################################
    // КОНСТРУКТОРЫ, объявляются как - МОД_ДОСТУПА ИМЯ_КЛАССА(ПАРАМЕТРЫ) { выполняемый код ... }
    public Human() {                                        // Такой конструктор (без входных параметров) создается по умолчанию ЕСЛИ не объявлены другие конструкторы
        System.out.println("Конструктор Human()");   // Такой конструктор (без входных параметров) ОБЯЗАТЕЛЕН если у этого класса есть НАСЛЕДНИКИ
    }

    public Human(String name, String surname) {             // Конструктор с ДВУМЯ входными параметрами ТИПА String
        System.out.println("Конструктор Human(String, String)");
        this.name = name;
        this.surname = surname;
    }

    Human(int age) {                                        // Тоже конструктор с ОДНИМ входным параметром ТИПА int БЕЗ модификатора доступа (default)
        this.age = age;
    }


    // ################################################################################################################
    // МЕТОДЫ, объявляются как МОД_ДОСТУПА ТИП_ВОЗВРАЩАЕМОГО_ЗНАЧЕНИЯ ИМЯ_МЕТОДА(ПАРАМЕТРЫ) { выполняемый код ... }
    public void doDiet() {                                  // Обычный метод класса который что-то там делает, метод доступен для вызова ВЕЗДЕ (public)
        System.out.println("Метод doDieta(): " + name + " " + surname + " на диете");
        decreaseWeight();
    }

    public void Human() {                                   // ТОЖЕ обычный метод класса который что-то там делает, метод доступен для вызова ВЕЗДЕ (public)
        System.out.println("Метод Human()");
    }

    private void decreaseWeight() {                         // ТОЖЕ обычный метод класса который что-то там делает, метод доступен для вызова только ВНУТРИ класса (private)
        System.out.println("Метод decreaseWeight()");
        if(weight > 0)
            this.weight--;
        else System.out.println("Вес итак слишком мал!!!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", classId=" + classId +
                '}';
    }
}

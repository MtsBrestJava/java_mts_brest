package by.mts.brest.java.classes_deeper;

public class mtsTech extends Human {
    // Класс mtsTech наследуется от Human со всеми полями и методами КРОМЕ конструкторов

    // Свои поля для класса mtsTech (кроме тех что он унаследовал)
    String jobSpecialization;        // Специализация работы, должность
    int driveLevel;                  // Уровень пользования служебным транспортом

    // Поэтому объявляем здесь конструктор с двумя полыми String
    mtsTech(String name, String surname) {
        super(name, surname);           // Т.к. этот конструктор должен выполнять идентичные действия как в
                                        // таком же конструкторе Human, вызываем здесь конструктор родительского класса
        System.out.println("Конструктор mtsTech(String, String)");
    }

    @Override
    public String toString() {
        return "mtsTech{" +
                "jobSpecialization='" + jobSpecialization + '\'' +
                ", driveLevel=" + driveLevel +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                '}';
    }
}

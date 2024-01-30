package homework10;

public class GenericClass<T> {

    private T genericField;

    public GenericClass(T value) {
        this.genericField = value;
    }

    public void printGenericField() {
        System.out.println("Generic Alan: " + genericField);
    }

    public static void main(String[] args) {
        GenericClass<String> stringGenericClass = new GenericClass<>("Hello, World!");
        stringGenericClass.printGenericField();

        GenericClass<Integer> integerGenericClass = new GenericClass<>(42);
        integerGenericClass.printGenericField();
    }
}

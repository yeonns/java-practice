package basic.generics;

public class GenericPractice {

    class WithoutGeneric {
        private final Object object;

        public WithoutGeneric(Object object) {
            this.object = object;
        }

        public Object getObject() {
            return this.object;
        }
    }

    class Generic<T> {
        private final T object;

        public Generic(T object) {
            this.object = object;
        }

        public T getObject() {
            return this.object;
        }
    }

    private void withoutGeneric() {
        WithoutGeneric wg1 = new WithoutGeneric("obj1");
        WithoutGeneric wg2 = new WithoutGeneric(4);

        String obj1 = (String) wg1.getObject();
        String obj2 = (String) wg2.getObject(); // runtime error
    }

    private void generic() {
        Generic<String> g1 = new Generic<>("obj1");
        Generic<Integer> g2 = new Generic<>(4);

        String obj1 = g1.getObject();
        //String obj2 = g2.getObject(); // compile error
    }

    public static void main(String[] args) {
        GenericPractice practice = new GenericPractice();
        practice.withoutGeneric();
        practice.generic();
    }
}

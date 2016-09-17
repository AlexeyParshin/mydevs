import javaBookExamples.Interfaces.ICharQ;
import EXERCISESGPACK.CircularQueue;
import EXERCISESGPACK.FixedQueue;
import EXERCISESGPACK.DynQueue;
import EXERCISESGPACK.DynCircularQueue;

class Example {
    public static void main(String[] args) {
        FixedQueue ql = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue qЗ = new CircularQueue(10);
        DynCircularQueue q4 = new DynCircularQueue(10);

        FixedQueue qq = new FixedQueue(15);

        ICharQ iQ;

        char ch;
        int i;

        iQ = ql;
        // Поместить ряд символов в очередь фиксированного размера
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

       /* iQ = q2;
        // Поместить ряд символов в динамическую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = qЗ;
        // Поместить ряд символов в кольцевую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // Поместить больше символов в кольцевую очередь
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nCoxpaнeниe и использование данных" +
                " кольцевой очереди");
        // Поместить символы в кольцевую очередь и извлечь их оттуда
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
        iQ = q4;
        // Поместить ряд символов в бесконечную кольцевую очередь
        for (i = 0; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe бесконечной кольцевой очереди: ");
        for (i = 0; i < 20; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();*/
    }
}



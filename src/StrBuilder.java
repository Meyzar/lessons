public class StrBuilder {
    public static void main(String[] args) {
        String str1 = "hello"; //Строки являются неизменяемыми объектами и для их изменения создается новая строка
        String str2 = "my";
        String str3 = "friend";
        String stringAll = str1 + str2 + str3; //Неэффективный метод соединения строк

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append(" my"); //Эффективный метод соединения строк
        sb.append(" friend");
        System.out.println(sb.toString());

        //Или

        StringBuilder sb1 = new StringBuilder("hello");
        sb1.append(" my").append(" friend");
        System.out.println(sb1.toString());
    }
}


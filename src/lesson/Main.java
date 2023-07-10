package lesson;

public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book prestuplenieNakazanie = new Book("Преступление и наказание", dostoevsky, 1866);
        Author gogol = new Author("Николай","Гоголь");
        Book mertvyeDushi = new Book("Мёртвые души", gogol, 1835);


        System.out.println(dostoevsky);
        System.out.println(prestuplenieNakazanie);
        Author dostoevsky2 = new Author("Фёдор", "Достоевский");
        System.out.println(dostoevsky.equals(dostoevsky2));
        System.out.println(dostoevsky.hashCode());
        System.out.println(dostoevsky2.hashCode());
    }

}

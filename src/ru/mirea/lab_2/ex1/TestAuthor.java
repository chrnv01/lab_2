package ru.mirea.lab_2.ex1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Chernov Artem", "chrnv1@mail.ru", 'M');
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}

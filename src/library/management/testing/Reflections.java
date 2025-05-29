package library.management.testing;

import library.management.models.Author;
import library.management.models.Book;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflections {
    public static void main(String[] args) {
        Class<?> bookClass = Book.class;
        Class<?> authorClass = Author.class;

        for (Field field : bookClass.getDeclaredFields()) {
            System.out.println("Book Field: " + field.getName() + " of type " + field.getType().getSimpleName());
        }

        System.out.println("Author Modifiers: " + Modifier.toString(authorClass.getModifiers()));
    }
}

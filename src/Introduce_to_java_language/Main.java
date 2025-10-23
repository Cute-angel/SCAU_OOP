package Introduce_to_java_language;

import Introduce_to_java_language.experiment.*;
import Introduce_to_java_language.task.*;
import utls.CourseTask;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        run(new ConvertToDex(new Scanner(System.in)));
    }

    public static void run(CourseTask tk) {
        tk.solve();
    }

    // just write for fun
    public static void run_use_reflect(Class<? extends CourseTask> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        clazz.getConstructor(Scanner.class)
                .newInstance(scanner)
                .solve();
        scanner.close();
    }
}



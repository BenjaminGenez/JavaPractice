package Practice.Hyperskill.Methods.JavaPractice.src.bookh;

import java.util.Scanner;

public class PhraseOMatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("test");
        //System.out.println(number);
        String[] wordListOne = {"agnostic", "opinionated", "voice activated",
                "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service oriented", "containerized",
                "serverless", "microservices", "distributed ledger"};

        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline",
                "service mesh", "architecture", "perspective", "design", "orientation"};

        java.util.Random randomGenerator = new java.util.Random();
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;
        int rand1 = randomGenerator.nextInt(oneLenght);
        int rand2 = randomGenerator.nextInt(twoLenght);
        int rand3 = randomGenerator.nextInt(threeLenght);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("the result is" + phrase);
        System.out.println(phrase);

    }
}

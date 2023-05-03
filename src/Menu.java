//import java.util.Scanner;
//
//public class Menu {
//
//    public static void userChoice() {
//        Scanner sc = new Scanner(System.in);
//
//        int userSelection = sc.nextInt();
//        boolean continueRunning = true;
//
//        do {
//            System.out.println("Please make a selection from the list below...");
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//
//            System.out.println("Enter a choice: ");
//
//
//            switch (num) {
//                case 0:
//                    System.out.println("OK, bye Felicia!");
//                    continueRunning = false;
//
//                case 1:
//                    if (num == 1) {
//                        for (Movie movie : movies) {
//                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
//                        }
//                    }
//                    break;
//                case 2:
//                    for (Movie movie : movies) {
//                        if (movie.getCategory().equals("animated")) {
//                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
//                        }
//                    }
//                    break;
//                case 3:
//                    for (Movie movie : movies) {
//                        if (movie.getCategory().equals("drama")) {
//                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
//                        }
//                    }
//                    break;
//                case 4:
//                    for (Movie movie : movies) {
//                        if (movie.getCategory().equals("horror")) {
//                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
//                        }
//                    }
//                    break;
//                case 5:
//                    for (Movie movie : movies) {
//                        if (movie.getCategory().equals("scifi")) {
//                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
//                        }
//                    }
//                default:
//                    System.out.println("that's not an option");
//            }
//        } while (continueRunning);
//        System.out.println("exiting loop");
//    }
//}

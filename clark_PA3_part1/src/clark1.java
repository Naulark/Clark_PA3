import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class clark1 {


    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
        int newSession = 1;
        while (newSession == 1) {
            SecureRandom secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
            Scanner scnr = new Scanner(System.in);
            Scanner fscan = new Scanner(System.in);

            int i;
            int correctCounter = 0, wrongCounter = 0;

            int difficulty = DifficultyNum();
            int type = ProblemType();

            if (difficulty == 1) {
                //Copy here when finished
                for (i = 0; i < 10; i++) {

                    float numOne = secureRandomGenerator.nextInt(9) + 1;
                    float numTwo = secureRandomGenerator.nextInt(9) + 1;

                    if (type == 1) {
                        System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextDouble();

                        String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                        //   boolean correctOrFalse = testForRepeat(Output);

                    } else if (type == 3) {

                        System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);


                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                    } else if (type == 4) {

                        System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                        double userAnswer = fscan.nextFloat();

                        String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    } else if (type == 2) {
                        System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    }

//ENTERING TYPE 5
//***************
                    else if (type == 5) {

                        Random random = new Random();
                        int randomInteger = random.nextInt(4) + 1;

                        if (randomInteger == 1) {
                            System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        } else if (randomInteger == 3) {
                            System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                            float userAnswer = scnr.nextInt();

                            String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);


                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        }
                        //End of random number 2
                        else if (randomInteger == 4) {

                            System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 3
                        else if (randomInteger == 2) {

                            System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 4

                    }
                    //End of type 5

                    //END OF FOR LOOP
                }

            }
            //END OF DIFFICULTY 1
            else if (difficulty == 2) {

                //Copy here when finished
                for (i = 0; i < 10; i++) {

                    float numOne = secureRandomGenerator.nextInt(90) + 10;
                    float numTwo = secureRandomGenerator.nextInt(90) + 10;

                    if (type == 1) {
                        System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextDouble();

                        String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                        //   boolean correctOrFalse = testForRepeat(Output);

                    } else if (type == 3) {

                        System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);


                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                    } else if (type == 4) {

                        System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                        double userAnswer = fscan.nextFloat();

                        String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    } else if (type == 2) {
                        System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    }

//ENTERING TYPE 5
//***************
                    else if (type == 5) {

                        Random random = new Random();
                        int randomInteger = random.nextInt(4) + 1;

                        if (randomInteger == 1) {
                            System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        } else if (randomInteger == 3) {
                            System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                            float userAnswer = scnr.nextInt();

                            String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);


                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        }
                        //End of random number 2
                        else if (randomInteger == 4) {

                            System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 3
                        else if (randomInteger == 2) {

                            System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 4

                    }
                    //End of type 5

                    //END OF FOR LOOP
                }


            } else if (difficulty == 3) {

                //Copy here when finished
                for (i = 0; i < 10; i++) {

                    float numOne = secureRandomGenerator.nextInt(900) + 100;
                    float numTwo = secureRandomGenerator.nextInt(900) + 100;

                    if (type == 1) {
                        System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextDouble();

                        String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                        //   boolean correctOrFalse = testForRepeat(Output);

                    } else if (type == 3) {

                        System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);


                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                    } else if (type == 4) {

                        System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                        double userAnswer = fscan.nextFloat();

                        String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    } else if (type == 2) {
                        System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    }

//ENTERING TYPE 5
//***************
                    else if (type == 5) {

                        Random random = new Random();
                        int randomInteger = random.nextInt(4) + 1;

                        if (randomInteger == 1) {
                            System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        } else if (randomInteger == 3) {
                            System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                            float userAnswer = scnr.nextInt();

                            String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);


                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        }
                        //End of random number 2
                        else if (randomInteger == 4) {

                            System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 3
                        else if (randomInteger == 2) {

                            System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 4

                    }
                    //End of type 5

                    //END OF FOR LOOP
                }


            } else if (difficulty == 4) {

                //Copy here when finished
                for (i = 0; i < 10; i++) {

                    float numOne = secureRandomGenerator.nextInt(9000) + 1000;
                    float numTwo = secureRandomGenerator.nextInt(9000) + 1000;

                    if (type == 1) {
                        System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextDouble();

                        String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                        //   boolean correctOrFalse = testForRepeat(Output);

                    } else if (type == 3) {

                        System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);


                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }

                    } else if (type == 4) {

                        System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                        double userAnswer = fscan.nextFloat();

                        String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    } else if (type == 2) {
                        System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                        double userAnswer = scnr.nextFloat();

                        String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                        System.out.println(Output);

                        boolean correctOrFalse = testForRepeat(Output);

                        if (correctOrFalse == false) {
                            wrongCounter++;
                        } else {
                            correctCounter++;
                        }
                    }

//ENTERING TYPE 5
//***************
                    else if (type == 5) {

                        Random random = new Random();
                        int randomInteger = random.nextInt(4) + 1;

                        if (randomInteger == 1) {
                            System.out.printf("How much is %.0f plus %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckAddition(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        } else if (randomInteger == 3) {
                            System.out.printf("How much is %.0f minus %.0f?\n", numOne, numTwo);
                            float userAnswer = scnr.nextInt();

                            String Output = AnswerCheckSubtraction(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);


                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }
                        }
                        //End of random number 2
                        else if (randomInteger == 4) {

                            System.out.printf("How much is %.0f divided by %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckDiv(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 3
                        else if (randomInteger == 2) {

                            System.out.printf("How much is %.0f times %.0f?\n", numOne, numTwo);
                            double userAnswer = scnr.nextInt();

                            String Output = AnswerCheckMult(numOne, numTwo, userAnswer);

                            System.out.println(Output);

                            boolean correctOrFalse = testForRepeat(Output);

                            if (correctOrFalse == false) {
                                wrongCounter++;
                            } else {
                                correctCounter++;
                            }

                        }
                        //END OF RANDOM NUM 4

                    }
                    //End of type 5

                    //END OF FOR LOOP
                }


            }

            double totalQuestions = 10.00;

            if ((correctCounter / totalQuestions) < .75) {
                System.out.println("Please ask your teacher for extra help.");
                System.out.printf("Your Grade: %.2f\n", (correctCounter / totalQuestions));
                System.out.printf("Total number correct: %d\n", correctCounter);
                System.out.printf("Total number incorrect: %d\n", (10 - correctCounter));

            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.printf("Your Grade: %.2f\n", (correctCounter / totalQuestions));
                System.out.printf("Total number correct: %d\n", correctCounter);
                System.out.printf("Total number incorrect: %d\n", (10 - correctCounter));
            }

            System.out.print("Begin new session?(1 = yes, 2 = no)\n");
            newSession = scnr.nextInt();
        }
        //END OF MAIN
        System.out.print("Thanks for using this program!");
    }

    public static String AnswerCheckMult(float x, float y, double userAnswer) {

        String Response = "";
        Boolean Check;

        if ((x * y) == userAnswer) {
            Check = true;
            Response = RandomResponseGenerator(Check);
        } else {
            Check = false;
            Response = RandomResponseGenerator(Check);

        }

        return (Response);
    }

    public static String AnswerCheckAddition(float x, float y, double userAnswer) {

        String Response = "";
        Boolean Check;

        if ((x + y) == userAnswer) {
            Check = true;
            Response = RandomResponseGenerator(Check);
        } else {
            Check = false;
            Response = RandomResponseGenerator(Check);
        }

        return (Response);
    }

    public static String AnswerCheckSubtraction(float x, float y, double userAnswer) {

        String Response = "";
        Boolean Check;

        if ((x - y) == userAnswer) {
            Check = true;
            Response = RandomResponseGenerator(Check);
        } else {
            Check = false;
            Response = RandomResponseGenerator(Check);
        }

        return (Response);
    }

    //Might need to create a new method for floats on division
    public static String AnswerCheckDiv(float x, float y, double userAnswer) {

        double threshold = 0.0001;
        String Response = "";
        Boolean Check;

        if (Math.abs((x / y) - (userAnswer)) < threshold) {
            Check = true;
            Response = RandomResponseGenerator(Check);
        } else {
            Check = false;
            Response = RandomResponseGenerator(Check);

        }

        return (Response);

    }


    public static String RandomResponseGenerator(Boolean randomResponse) {

        Random randomSwitchCase = new Random();
        String returnString = "";

        int randomNum = randomSwitchCase.nextInt(3) + 1;

        if (randomResponse == true) {
            //Switch for correct response
            switch (randomNum) {

                case 1:
                    returnString = "Very Good!";
                    break;

                case 2:
                    returnString = "Excellent!";
                    break;

                case 3:
                    returnString = "Nice Work!";
                    break;

                case 4:
                    returnString = "Keep up the good work!";
                    break;

                default:
                    break;
            }
            //Ends if == true
        } else {

            switch (randomNum) {

                case 1:
                    returnString = "No. Please try again.";
                    break;

                case 2:
                    returnString = "Wrong. Try once more.";
                    break;

                case 3:
                    returnString = "Don't give up!";
                    break;

                case 4:
                    returnString = "No. Keep trying.";
                    break;

                default:
                    break;

            }

            //Ends if == false
        }

        return (returnString);
    }

    public static int DifficultyNum() {
        Scanner dScan = new Scanner(System.in);
        System.out.println("Enter a difficulty level(1, 2, 3, or 4): ");
        int difficultyLevel = dScan.nextInt();
        return (difficultyLevel);
    }

    public static int ProblemType() {
        Scanner pScan = new Scanner(System.in);
        System.out.println("Enter the type of arithmetic problem to study(1, 2, 3, 4, or 5): ");
        int type = pScan.nextInt();
        return (type);
    }

    public static boolean testForRepeat(String futureOutput) {

        boolean trueOrFalse;

        if (Objects.equals(futureOutput, "No. Please try again.")) {
            trueOrFalse = false;
        } else if (Objects.equals(futureOutput, "Wrong. Try once more.")) {
            trueOrFalse = false;
        } else if (Objects.equals(futureOutput, "Don't give up!")) {
            trueOrFalse = false;
        } else if (Objects.equals(futureOutput, "No. Keep trying.")) {
            trueOrFalse = false;
        } else {
            trueOrFalse = true;
        }

        return (trueOrFalse);
    }

}

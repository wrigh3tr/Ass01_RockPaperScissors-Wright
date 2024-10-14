import java.util.Scanner;
public static void main(String[] args)
{
        String Move1 = "";
        String Move2 = "";
        boolean validMove1 = false;
        boolean validMove2 = false;
        boolean validMove = false;
        boolean playAgain = false;
        Scanner input = new Scanner(System.in);

        do {



                    System.out.print("Please enter a move Player 1 [R,P,or S]: ");
                    Move1 = input.nextLine();
                    validMove1 = true;

                    System.out.print("Please enter a move Player 2 [R,P,or S]: ");
                    Move2 = input.nextLine();
                    validMove2 = true;

                    if (Move1.equalsIgnoreCase("R")) {
                        if (Move2.equalsIgnoreCase("R")) {
                            validMove = true;
                            System.out.println("Its a tie!");

                        } else if (Move2.equalsIgnoreCase("P")) {
                            validMove = true;
                            System.out.println("Paper Covers Rock, Player 2 Wins");
                        } else if (Move2.equalsIgnoreCase("s")) {
                            validMove = true;
                            System.out.println("Scissors Break Under the Pressure of Rock, Player 1 Wins");
                        } else {
                            System.out.println("Enter a Valid Move Player 2");
                        }

                    } else {
                        System.out.println("Enter a Valid Move Player 1");
                    }

                    if (Move1.equalsIgnoreCase("P")) {
                        if (Move2.equalsIgnoreCase("p")) {
                            validMove = true;
                            System.out.println("Its a tie!");

                        } else if (Move2.equalsIgnoreCase("r")) {
                            validMove = true;
                            System.out.println("Paper Covers Rock, Player 2 Wins");

                        } else if (Move2.equalsIgnoreCase("s")) {
                            validMove = true;
                            System.out.println("Scissors cut paper, Player 2 wins");

                        } else
                            System.out.println("Enter a Valid Move Player 2");


                    }
                    if (Move1.equalsIgnoreCase("S")) {
                        if (Move2.equalsIgnoreCase("S")) {
                            validMove = true;
                            System.out.println("Its a tie!");

                        } else if (Move2.equalsIgnoreCase("P")) {
                            validMove = true;
                            System.out.println("Paper Gets Cut by Scissors, Player 1 Wins");

                        } else if (Move2.equalsIgnoreCase("R")) {
                            validMove = true;
                            System.out.println("Scissors Break Under the Pressure of Rock, Player 2 Wins");

                        } else {
                            System.out.println("Enter a Valid Move Player 2");
                        }
                    }

        }while (!validMove);

            System.out.println("Do You Want to Play again[y or n]? ");
            if (input.nextLine().equalsIgnoreCase("n"))
            {
                playAgain = true;
            }
            else
                playAgain = false;
}



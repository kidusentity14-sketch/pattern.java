// Class author: Kidus Getachew
// Date created: November 4, 2026
// General description: Prints patterns using loops.

public class Patterns
{
    // Pre-condition: rows is greater than 0.
    // Post-condition: Prints a star pattern.
    public static void stars(int rows)
    {
        int row = 1;
        int amount = 1;

        while (row <= rows)
        {
            int count = 1;

            while (count <= amount)
            {
                System.out.print("*");
                count++;
            }

            System.out.println();
            amount = amount + 2;
            row++;
        }
    }

    // Pre-condition: rows is greater than 0.
    // Post-condition: Prints a number triangle.
    public static void triangle(int rows)
    {
        int row = 1;

        while (row <= rows)
        {
            int count = 1;

            while (count <= row)
            {
                System.out.print(row);
                count++;
            }

            System.out.println();
            row++;
        }
    }

    // Pre-condition: start is positive and odd.
    // Post-condition: Prints odd numbers down to 1.
    public static void odds(int start)
    {
        int number;
        int count;

        for (number = start; number >= 1; number = number - 2)
        {
            for (count = 1; count <= number; count++)
            {
                System.out.print(number);
            }

            System.out.println();
        }
    }

    // Pre-condition: maxE is greater than 0.
    // Post-condition: Prints the E and O pattern.
    public static void eo(int maxE)
    {
        int row;
        int count;
        String letter = "O";

        if (maxE % 2 == 1)
        {
            letter = "E";
        }

        for (row = 1; row <= maxE; row++)
        {
            for (count = 1; count <= row; count++)
            {
                System.out.print(letter);
            }

            System.out.println();

            if (letter.equals("E"))
            {
                letter = "O";
            }
            else
            {
                letter = "E";
            }
        }

        for (row = maxE - 1; row >= 1; row--)
        {
            for (count = 1; count <= row; count++)
            {
                System.out.print(letter);
            }

            System.out.println();

            if (letter.equals("E"))
            {
                letter = "O";
            }
            else
            {
                letter = "E";
            }
        }
    }

    // Pre-condition: rows is greater than 0.
    // Post-condition: Prints an upside-down number pyramid.
    public static void pyramid(int rows)
    {
        int row;
        int count;
        int amount = rows + rows - 1;
        int spaces = 0;

        for (row = 1; row <= rows; row++)
        {
            for (count = 1; count <= spaces; count++)
            {
                System.out.print(" ");
            }

            for (count = 1; count <= amount; count++)
            {
                System.out.print(row);
            }

            System.out.println();
            spaces++;
            amount = amount - 2;
        }
    }

    // Pre-condition: None.
    // Post-condition: Shows and tests the patterns.
    public static void main(String[] args)
    {
        stars(7);
        System.out.println();

        triangle(9);
        System.out.println();

        odds(9);
        System.out.println();

        eo(6);
        System.out.println();

        eo(5);
        System.out.println();

        pyramid(5);
        System.out.println();

        // Smaller tests
        stars(2);
        System.out.println();

        triangle(2);
        System.out.println();

        odds(3);
        System.out.println();

        eo(1);
        System.out.println();

        pyramid(2);
    }
}
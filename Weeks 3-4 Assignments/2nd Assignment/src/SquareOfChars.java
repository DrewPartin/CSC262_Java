import java.util.Scanner;

public class SquareOfChars {
    
    public void squareOfChars(int side, char fillCharacter)
    {
        System.out.print("Enter a number: ");
        Scanner sideInput = new Scanner(System.in);
        side = sideInput.nextInt();
        System.out.print("Enter a character: ");
        Scanner fillCharacterInput = new Scanner(System.in);
        fillCharacter = fillCharacterInput.next().charAt(0);

        for (int i = 0; i < side; i++)
        {
            for (int j = 0; j < side; j++)
            {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }

        sideInput.close();
        fillCharacterInput.close();
    }
}

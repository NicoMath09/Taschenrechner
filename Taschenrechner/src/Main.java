import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }

    void Start()
    {

        double firstNumber = GetDouble("Bitte geben Sie die erste Zahl ein: ");
        System.out.println();
        double secondNumber = GetDouble("Bitte geben Sie die zweite Zahl ein: ");
        System.out.println();
        int OperatorIndex =
                GetOperatorIndex("+, -, *, /",
                        "Bitte geben sie eine Zahl von 1-4 für den gewünschten Operator an: ");


        double result = 0;
        if(OperatorIndex == 1)
        {
            result = firstNumber + secondNumber;

        }else if(OperatorIndex == 2)
        {
            result = firstNumber - secondNumber;

        }else if(OperatorIndex == 3)
        {
            result = firstNumber * secondNumber;

        }else if(OperatorIndex == 4)
        {
            result = firstNumber / secondNumber;
        }

        String output = Double.toString(result);
        System.out.println(output);
    }

    private int GetOperatorIndex(String operatorList, String text)
    {
        int index = 0;

        while (true)
        {
            System.out.println();
            System.out.println(operatorList);
            System.out.print(text);
            var input = scanner.next();

            try {
                index = Integer.parseInt(input);

                if(index > 4 || index <= 0)
                {
                    throw new Exception();
                }

            }catch (Exception e)
            {
                System.out.println("Falsche Angabe!");
                continue;
            }

            break;
        }

        return index;
    }

    private double GetDouble(String text)
    {
        double result = 0;

        while (true)
        {
            System.out.print(text);
            var input = scanner.next();

            try {
                result = Double.parseDouble(input);

            }catch (Exception e)
            {
                System.out.println("Falsche Angabe!");
                continue;
            }

            break;
        }

        return result;
    }
}
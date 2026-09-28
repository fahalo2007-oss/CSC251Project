import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Project_Fahad_Hassan
{
   public static void main(String[] args) throws IOException
   {
      ArrayList<Policy> policies = new ArrayList<Policy>();

      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);

      while (inputFile.hasNext())
      {
         int policyNumber = inputFile.nextInt();
         inputFile.nextLine();

         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();

         int age = inputFile.nextInt();
         inputFile.nextLine();

         String smokingStatus = inputFile.nextLine();

         double height = inputFile.nextDouble();
         double weight = inputFile.nextDouble();

         if (inputFile.hasNextLine())
         {
            inputFile.nextLine();
         }

         if (inputFile.hasNextLine())
         {
            inputFile.nextLine();
         }

         Policy policy = new Policy(policyNumber, providerName, firstName,
                                    lastName, age, smokingStatus,
                                    height, weight);

         policies.add(policy);
      }

      inputFile.close();
   }
}

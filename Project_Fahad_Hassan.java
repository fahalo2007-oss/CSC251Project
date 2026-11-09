
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

      while (inputFile.hasNextLine())
      {
         String line = inputFile.nextLine();

         // Skip blank lines between policies
         if (line.trim().isEmpty())
         {
            continue;
         }

         int policyNumber = Integer.parseInt(line);
         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = Integer.parseInt(inputFile.nextLine());
         String smokingStatus = inputFile.nextLine();
         double height = Double.parseDouble(inputFile.nextLine());
         double weight = Double.parseDouble(inputFile.nextLine());

         // Create a PolicyHolder object
         PolicyHolder policyHolder = new PolicyHolder(
                                    firstName, lastName, age,
                                    smokingStatus, height, weight);

         // Create a Policy object with a PolicyHolder
         Policy policy = new Policy(policyNumber, providerName,
                                    policyHolder);

         policies.add(policy);
      }

      inputFile.close();

      int smokerCount = 0;
      int nonSmokerCount = 0;

      for (Policy policy : policies)
      {
         // Implicitly calls the Policy toString method
         System.out.println(policy);

         PolicyHolder policyHolder = policy.getPolicyHolder();

         if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount++;
         }
         else
         {
            nonSmokerCount++;
         }
      }

      System.out.println("There were " + Policy.getPolicyCount()
                         + " Policy objects created.");

      System.out.println();

      System.out.println("The number of policies with a smoker is: "
                         + smokerCount);

      System.out.println();

      System.out.println("The number of policies with a non-smoker is: "
                         + nonSmokerCount);
   }
}

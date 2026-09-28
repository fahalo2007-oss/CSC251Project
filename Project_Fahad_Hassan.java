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

         Policy policy = new Policy(policyNumber, providerName, firstName,
                                    lastName, age, smokingStatus,
                                    height, weight);

         policies.add(policy);
      }

      inputFile.close();

      int smokerCount = 0;
      int nonSmokerCount = 0;

      for (Policy policy : policies)
      {
         System.out.printf("Policy Number: %d\n",
                           policy.getPolicyNumber());

         System.out.printf("\nProvider Name: %s\n",
                           policy.getProviderName());

         System.out.printf("\nPolicyholder's First Name: %s\n",
                           policy.getFirstName());

         System.out.printf("\nPolicyholder's Last Name: %s\n",
                           policy.getLastName());

         System.out.printf("\nPolicyholder's Age: %d\n",
                           policy.getAge());

         System.out.printf("\nPolicyholder's Smoking Status (smoker/non-smoker): %s\n",
                           policy.getSmokingStatus());

         System.out.printf("\nPolicyholder's Height: %.1f inches\n",
                           policy.getHeight());

         System.out.printf("\nPolicyholder's Weight: %.1f pounds\n",
                           policy.getWeight());

         System.out.printf("\nPolicyholder's BMI: %.2f\n",
                           policy.calculateBMI());

         System.out.printf("\nPolicy Price: $%.2f\n\n",
                           policy.calculatePolicyPrice());

         if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount++;
         }
         else
         {
            nonSmokerCount++;
         }
      }

      System.out.println("The number of policies with a smoker is: "
                         + smokerCount);

      System.out.println("\nThe number of policies with a non-smoker is: "
                         + nonSmokerCount);
   }
}

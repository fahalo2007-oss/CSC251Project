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
            int smokerCount = 0;
      int nonSmokerCount = 0;

      for (Policy policy : policies)
      {
         System.out.printf("\nPolicy Number: %d\n",
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
         System.out.printf("\nPolicy Price: $%.2f\n",
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

      System.out.println("\nThe number of policies with a smoker is: "
                         + smokerCount);

      System.out.println("\nThe number of policies with a non-smoker is: "
                         + nonSmokerCount);
   }
}

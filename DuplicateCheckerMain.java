import java.util.Scanner;

class DuplicateChecker {

    boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class DuplicateCheckerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        DuplicateChecker obj = new DuplicateChecker();

        boolean result = obj.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);

        sc.close();
    }
}
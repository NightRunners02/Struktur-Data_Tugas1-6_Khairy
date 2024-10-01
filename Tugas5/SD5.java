package Strukturdatatugas.Tugas5;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SD5 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka-angka yang dipisahkan koma (,): ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");

        int[] nums = KonversiArrayStringMenjadiArrrayInteger(numbers);
        PriorityQueue<Integer>[] result = new PriorityQueue[5];
        for (int i = 0; i < result.length; i++) {
            result[i] = new PriorityQueue<>();
        }
        Bubblesort(nums);
        MembuatRangeAntarArray(nums, result);
        MenampilkanHasilYangSudahDiurutDanDiGrupkan(result);
        scanner.close();
    }

    private static int[] KonversiArrayStringMenjadiArrrayInteger(String[] numbers) {
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        return nums;
    }

    private static void MembuatRangeAntarArray(int[] nums, PriorityQueue<Integer>[] result) {
        for (int num : nums) {
            int index;
            if (num >= 1 && num <= 9) {
                index = 0;
            } else if (num >= 10 && num <= 19) {
                index = 1;
            } else if (num >= 20 && num <= 29) {
                index = 2;
            } else if (num >= 30 && num <= 39) {
                index = 3;
            } else if (num >= 40 && num <= 49) {
                index = 4;
            } else {
                continue; 
            }
            result[index].offer(num);
        }
    }

    private static void MenampilkanHasilYangSudahDiurutDanDiGrupkan(PriorityQueue<Integer>[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print("Array ke " + i + ": ");
            while (!result[i].isEmpty()) {
                System.out.print(result[i].poll());
                if (!result[i].isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    private static void Bubblesort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}

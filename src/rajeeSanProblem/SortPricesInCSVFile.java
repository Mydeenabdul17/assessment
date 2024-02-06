package rajeeSanProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPricesInCSVFile {

	public static void main(String[] args) {
//		writeIntegersToFile("stockPrice.csv", List.of(8,5,4,3,7,1));
		readCSV("stockPrice.csv");
		writeIntegersToFile("stockPrice.csv", readAndSortCSV("stockPrice.csv"));
		readCSV("stockPrice.csv");
		
	}
	public static void writeIntegersToFile(String fileName, List<Integer> integers) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Integer integer : integers) {
                writer.append(String.valueOf(integer));
                writer.append('\n');
            }
            System.out.println("CSV file '" + fileName + "' has been created successfully.");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
        }
    }
	public static List<Integer> readAndSortCSV(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }

        // Sort numbers in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        return numbers;
    }
	public static void readCSV(String fileName) {
		List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            System.out.println(numbers);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
	}
}

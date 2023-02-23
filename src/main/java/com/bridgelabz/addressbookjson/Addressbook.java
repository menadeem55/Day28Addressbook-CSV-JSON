package com.bridgelabz.addressbookjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

public class Addressbook {

	public void writeAddressBook() throws IOException {

		FileWriter outputfile = new FileWriter(
				"D:\\BridgelabzClassWork\\Assignment-243\\Day28-Addressbook-JSON\\write.csv");

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// create a List which contains String array
		ArrayList<String[]> addrsBook = new ArrayList<String[]>();
		addrsBook.add(new String[] { "FirstName", "LastName", "City", "State", "Zip", "Email" });
		addrsBook.add(new String[] { "Nadeem", "Akhtar", "saran", "Bihar", "841301", "me.nadeem55@gmailcom" });
		addrsBook.add(new String[] { "Aasif", "sayeed", "BLR", "KA", "23547", "asif.s@gmail.com" });
		addrsBook.add(new String[] { "Amit", "kumar", "Patna", "Bihar", "800001", "amit@gmail" });
		writer.writeAll(addrsBook);

		writer.writeAll(addrsBook);

//	         // closing writer connection
		writer.close();

	}

	public void readAddressBook() throws IOException, Exception {

		FileReader filereader = new FileReader(
				"D:\\BridgelabzClassWork\\Assignment-243\\Day28-Addressbook-JSON\\read.csv");

		// create csvReader object and skip first Line
		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		List<String[]> allData = csvReader.readAll();

		// print Data
		for (String[] row : allData) {
			for (String cell : row) {
				System.out.print(cell + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		Addressbook obj = new Addressbook();
		obj.writeAddressBook();
		obj.readAddressBook();

	}
}
package com.pro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;



import com.pro.dao.TrainDAO;
import com.pro.model.Ticket;
import com.pro.model.Train;

public class Main {

	/*public static void addNewTrain() {
		
		//to enter the new train...
		
		
				Train train2 = new Train();
				Scanner sc2 = new Scanner(System.in);
				
				System.out.println("Enter the Train Number: ");
				train2.setTrainNo(sc2.nextInt());
				
				sc2.nextLine();
				
				System.out.println("Enter Train Name:");

				train2.setTrainName(sc2.nextLine());
				
				System.out.println("Enter source:");

				train2.setSource(sc2.nextLine());
				System.out.println("Enter destination:");

				train2.setDestination(sc2.nextLine());
				
				System.out.println("Enter fare:");

				train2.setTicketPrice(sc2.nextDouble());
				
				TrainDAO trainDAO = new TrainDAO();
				trainDAO.save(train2);
				
				sc2.close();
				
				System.exit(0);
				
	}*/
	
	public static void main(String[] args) {
		
		
		//addNewTrain();
		
		TrainDAO trainDAO = new TrainDAO();

		//Used Only First time
		 //trainDAO.populateTrainTable();
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Train Number: ");
		int trainNo = sc.nextInt();

		Optional<Train> trainOptional = trainDAO.findTrain(trainNo);

		if (trainOptional.isEmpty()) {

			System.out.println("No Train exist in the DB...");
			sc.close();
			return;

		}

		Train train = trainOptional.get();
		
		
		System.out.println("Enter Travel Date (dd/MM/YYYY):");
		String travelDateStr = sc.next();

		Date travelDate = new Date();

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			travelDate = formatter.parse(travelDateStr);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid date format");
			sc.close();
			return;
		}

		Ticket ticket = new Ticket(travelDate, train);
		
		System.out.println("Enter Number of Passengers");
		int noOfPassengers = sc.nextInt();

		sc.nextLine();

		for (int i = 1; i <= noOfPassengers; i++) {

			System.out.println("Enter Passenger Name");
			String name = sc.nextLine();

			System.out.println("Enter Age");
			int age = sc.nextInt();

			System.out.println("Enter Gender(M/F)");
			char gender = sc.next().charAt(0);

			ticket.addPassenger(name, age, gender);

			sc.nextLine();

		}
		ticket.writeTicket();
		ticket.writeTicket();

		System.out.println("Ticket Booked with PNR : " + ticket.getPnr());
		System.out.println("Ticket should be written to the file with filename " + ticket.getPnr() + ".txt");

		sc.close();

	}

		
	}
	
	


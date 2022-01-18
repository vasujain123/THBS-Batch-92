package com.pro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;



import com.pro.model.Train;


public class TrainDAO {

	private static final String TABLE_NAME = "train"; 
	
	public void save(Train train) {

		String insert = "INSERT INTO " + TABLE_NAME + " VALUES(?,?,?,?,?)";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(insert);) {

			ps.setInt(1, train.getTrainNo());
			ps.setString(2, train.getTrainName());
			ps.setString(3, train.getSource());
			ps.setString(4, train.getDestination());
			ps.setDouble(5, train.getTicketPrice());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

	
	public	Optional<Train> findTrain(int trainNo) {

		String select = "SELECT * FROM " + TABLE_NAME + " WHERE trainNo=?";

		Train train = null;

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(select);) {

			ps.setInt(1, trainNo);

			ResultSet rs = ps.executeQuery();

			if (rs.next())

			{

				String trainName = rs.getString("trainName");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				double ticketPrice = rs.getDouble("ticketPrice");

				train = new Train(trainNo, trainName, source, destination, ticketPrice);

			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Optional.ofNullable(train);
	}

	public void populateTrainTable() {

		Train train1 = new Train(1001, "Shatabdi Express", "Bangalore", "Delhi", 2500);
		Train train2 = new Train(1002, "Shatabdi	Express", "Delhi", "Bangalore", 2500);
		Train train3 = new Train(1003, "Udyan Express", "Bangalore", "Mumbai", 1500);
		Train train4 = new Train(1004, "Udyan Express", "Mumbai", "Bangalore", 1500);
		Train train5 = new Train(1005, "Brindavan Express", "Bangalore", "Chennai", 1000);
		Train train6 = new Train(1006, "Brindavan Express", "Chennai", "Bangalore", 1000);

		save(train1);
		save(train2);
		save(train3);
		save(train4);
		save(train5);
		save(train6);

	}
}

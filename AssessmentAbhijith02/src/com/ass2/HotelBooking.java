/*Hotel Room Booking Simulation
 
A hotel has 5 floors, and each floor has 10 rooms.
Rooms are numbered as:
Floor 1 → 101 to 110
Floor 2 → 201 to 210
…
Floor 5 → 501 to 510
Write a Java program using nested loops to:
Print all room numbers floor by floor.
Mark odd-numbered rooms as “Available” and even-numbered rooms as “Booked”.
If the room number ends with 0 (like 110, 210, … 510), print “VIP Suite”.
Finally, count and display:
 
1. Total available rooms
2. Total booked rooms
3. Total VIP suites*/


package com.ass2;

public class HotelBooking {
	public static void main(String[] args) {
		
		int totAvailableRoom=0;
		int totBookedRoom=0;
		int totVipSuit=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Floor:"+i);
			System.out.println();
			
			for(int j=1;j<=10;j++) {
				int roomNo=i*100+j;
				
				 if(j==10) {
					System.out.println("Room :"+roomNo+" VIP Suit");
					 totVipSuit++;
				}
				
				else if(roomNo%2!=0) {
				System.out.println("Room :"+roomNo+" Available");
				totAvailableRoom++;
				}else if(roomNo%2==0) {
					System.out.println("Room :"+roomNo+" Booked");
					totBookedRoom++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Total available rooms:"+totAvailableRoom);
		System.out.println("Total booked rooms:"+totBookedRoom);
		System.out.println("Total VIP suites:"+totVipSuit);
		
	}

}

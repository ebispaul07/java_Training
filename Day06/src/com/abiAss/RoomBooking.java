/*A hotel has 5 floors, and each floor has 10 rooms.
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
3. Total VIP suites */


package com.abiAss;

public class RoomBooking{
	public static void main(String[] args) {
		int AvailableRoom=0;
		int BookedRoom=0;
		int VipRoom=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Floor:"+i);
			System.out.println();
			for(int j=1;j<=10;j++) {
				
				int roomNo=i*100+j;
				
				System.out.print("Room:"+roomNo+"->");
				
				
				
				if(j==10) {
					System.out.println("VIP SUIT");
					VipRoom++;
				}
				
				else if(j%2==0) {
					System.out.println("Booked");
					BookedRoom++;
					
				}
				else {
					System.out.println("Available");
					AvailableRoom++;
				}
				
			}
			
			System.out.println();
			
			
		}
		
		System.out.println();
		
		System.out.println("Total Available Rooms->"+AvailableRoom);
		
		System.out.println("Total Booked Rooms->"+BookedRoom);
		
		System.out.println("Total Vip Suits:"+VipRoom);
		
		
	
	}
}
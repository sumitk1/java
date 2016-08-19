package practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ScheduleMain {

	private int start;
	private int end;
	//private int numberPeople;
	private TreeSet<TimeSlot> sortedSlots = null;
	
	public ScheduleMain(int numberPeople, int start, int end) {
		//this.numberPeople = numberPeople;
		this.start = start;
		this.end = end;
	}
	
	public void addBusySchedule(String personId, int start, int end) {
		if (sortedSlots == null)

			sortedSlots = new TreeSet<TimeSlot>(new Comparator<TimeSlot>(){
				@Override
				public int compare(TimeSlot left, TimeSlot right) {
					return left.start - right.start;
				}
			});
		sortedSlots.add(new TimeSlot(personId, start, end));
	}
	
	public void printFreeTimes() {
		int lastFreeStart = start;
		Iterator<TimeSlot> itr = sortedSlots.iterator();
		
		while (itr.hasNext()) {
			TimeSlot slot = itr.next();
			//System.out.println(slot.personId + ": " + slot.start + " to " + slot.end);
			if (slot.start > lastFreeStart) {
				System.out.println(">> Free: " + lastFreeStart + " to " + slot.start);
				lastFreeStart = slot.end;
			}
			else {
				if (slot.end > lastFreeStart)
					lastFreeStart = slot.end;
			}
		}
		if (lastFreeStart < end)
			System.out.println(">>>> Free: " + lastFreeStart + " to " + end);
	}

	public static void main(String[] args) {
		ScheduleMain s = new ScheduleMain(3, 0, 200);

		s.addBusySchedule("A", 10, 20);
		s.addBusySchedule("A", 30, 60);
		s.addBusySchedule("A", 100, 135);
		s.addBusySchedule("A", 165, 190);
		s.addBusySchedule("B", 0, 35);
		s.addBusySchedule("B", 80, 146);
		s.addBusySchedule("C", 5, 73);
		
		s.printFreeTimes();
	}
	
	static class TimeSlot {
		public String personId;
		public int start;
		public int end;
		
		public TimeSlot(String personId, int start, int end) {
			this.personId = personId;
			this.start = start;
			this.end = end;
		}
	}

}

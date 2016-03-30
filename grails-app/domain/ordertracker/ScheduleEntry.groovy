package ordertracker;

class ScheduleEntry {
	Date plannedDate
	Boolean visited

	static belongsTo = [client: Client, vendor: Vendor]
}

package ordertracker;

class Vendor {
	static hasMany = [entries:ScheduleEntry]
	static belongsTo = [user:User]
	
	Boolean is_active;

	static mapping = {
        entries cascade: 'all-delete-orphan'
    }
}
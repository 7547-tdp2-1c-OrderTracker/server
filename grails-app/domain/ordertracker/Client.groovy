package ordertracker;

class Client {
	String name
	String lastname

	String cuil
	String address

	Float lon;
	Float lat;

	String email;
	String thumbnail;

	String avatar;
	String phone_number;
	
	static hasMany = [entries:ScheduleEntry]
}

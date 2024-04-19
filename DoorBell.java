class DoorBell{
	String brand;
	float cost;
	String type;
	int frequency;
	byte voltage;
	int size;
	
	DoorBell()
	{
		System.out.println("Doorbell with no arguments");
	}
	DoorBell(String brand)
	{
		this.brand=brand;
		
	}
	DoorBell(float cost,String type)
	{
		this.cost=cost;
		this.type=type;
	}
	DoorBell(byte voltage,String brand)
	{
		this.voltage=voltage;
		this.brand=brand;
	}
	DoorBell(String brand,int frequency)
	{
		this.brand=brand;
		this.frequency=frequency;
	}
	DoorBell(int size,String type)
	{
		this.size=size;
		this.type=type;
	}
	DoorBell(int size,float cost,String brand)
	{
		this.size=size;
		this.cost=cost;
		this.brand=brand;
	}
	
}
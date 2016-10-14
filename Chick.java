class Chick implements Animal
{     
    private String chickSound;
    private String chickType;
    public Chick(String typeTwo, String soundTwo)
    {
    	chickSound = soundTwo;
    	chickType = typeTwo;
    }
	public Chick()
	{
		chickSound = "unknown";
		chickType = "unknown";
	}
	public String getSound()
	{
		return chickSound;
	}
	public String getType()
	{
		return chickType;
	}
}
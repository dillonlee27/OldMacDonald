class Chick implements Animal
{     
    private String chickSound;
    private String chickType;
    public Chick(String typeTwo, String soundTwo, String soundTwoV2)
    {
    	chickType = typeTwo;
    	if (Math.random() < 0.5)
    		chickSound = soundTwo;
    	else
    		chickSound = soundTwoV2;
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
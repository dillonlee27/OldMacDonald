class Pig implements Animal
{     
    private String pigSound;
    private String pigType;
    public Pig(String typeThree, String soundThree)
    {
    	pigSound = soundThree;
    	pigType = typeThree;
    }
    public Pig()
    {
    	pigSound = "unknown";
    	pigType = "unknown";
    }
    public String getSound()
    {
    	return pigSound;
    }
    public String getType()
    {
    	return pigType;
    }
}

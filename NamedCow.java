class NamedCow extends Cow
{
	private String myType;
	private String mySound;
	private String myCowName;
	public NamedCow(String type, String name, String sound)
	{
		myType = type;
		mySound = sound;
		myCowName = name;
	}
	public String getName()
	{
		return myCowName;
	}
}
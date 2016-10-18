class Farm 
{     
   private Animal[] gangOfAnimals = new Animal[3];
   public Farm()
   {
   	gangOfAnimals[0] = new NamedCow("cow", "Elsie", "moo");
   	gangOfAnimals[1] = new Chick("chick", "cheep","cluck");
   	gangOfAnimals[2] = new Pig("pig","oink");
   }
   public void getSound()
   {
   		for (int v = 0; v < gangOfAnimals.length; v++)
   		{
   			System.out.println(gangOfAnimals[v].getType() + " goes " + gangOfAnimals[v].getSound());
   		}
   		System.out.println("The cow is known as " + ((NamedCow)gangOfAnimals[0]).getName());

   }
}

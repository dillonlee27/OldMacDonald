class Farm 
{     
   private Animal[] gangOfAnimals = new Animal[3];
   public Farm()
   {
   	gangOfAnimals[0] = new Cow("cow","moo");
   	gangOfAnimals[1] = new Chick("chick", "cheep","cluck");
   	gangOfAnimals[2] = new Pig("pig","oink");
   }
   public void animalSound()
   {
   		for (int v = 0; v < gangOfAnimals.length; v++)
   		{
   			System.out.println(gangOfAnimals[v].getType() + "goes " + gangOfAnimals[v].getSound());
   		}
   }
}

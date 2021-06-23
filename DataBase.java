package Annonymous_class;

public abstract class DataBase
{
String name;
String profile;
String city;

 DataBase(String name, String profile, String city)
{
	this.name=name;
	this.profile=profile;
	this.city=city;
	
}
abstract void details();
}

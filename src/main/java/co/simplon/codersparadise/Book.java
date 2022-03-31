package co.simplon.codersparadise;

public class Book {
	
	private String Name;
	private String Author;
	private double Price;
	
	public Book (String Name, String Author, double Price) {
		this.Name=Name;
		this.Author=Author;
		this.Price=Price;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAuthor() {
		return this.Author;
	}
	public void setAuthor(String author) {
		this.Author = author;
	}
	public double getPrice() {
		return this.Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	} 

}

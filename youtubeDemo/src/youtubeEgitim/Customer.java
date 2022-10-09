package youtubeEgitim;

public class Customer {
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	} //bu constructor bloğu mainde newlediğimiz zaman çalışıyor(heapte nesne oluştuğu zaman)
	
	private int id;
	private String City;
	private int setId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
}

package youtubeEgitim;

public abstract class BaseCreditManager implements ICreditManager{
	public abstract void calculate();
	//bu şekil yazıma sadece imza diyoruz.

	public void save() {
		System.out.println("Öğretmen kaydedildi");
	}
	
	//abstract sınıflar hem tamamlanmış hem tamamlanmamış operasyonları içinde tutabilir.

}

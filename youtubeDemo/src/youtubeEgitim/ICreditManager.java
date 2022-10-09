package youtubeEgitim;

public interface ICreditManager {
	void calculate();
	void save();
	
	//interfacelerin amacı bağımlılıklardan kurtulmak(if yapısından aynı zamanda)
	//bir sınıf sadece bir sınıfı inherit edebilir(extend) ama bir sınıf birden çok interface'i implement edebilir
	//interface kullanımıda abstractiondır
}

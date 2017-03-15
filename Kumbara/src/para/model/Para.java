package para.model;

public class Para {

	private Deger deger;
	public void setDeger(Deger deger)
	{
		this.deger = deger;
	}
	public void hesabaEkle(){
		deger.useCoin();
	}
}

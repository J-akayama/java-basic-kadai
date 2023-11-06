package kadai_017;

abstract public class Kato_Chapter17 {

	public String familyName = "加藤";//姓
	public String givenName= ""; //名
	public String address = "東京都中野区〇×"; //住所
	
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
}
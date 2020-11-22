class Print{
	public String del;
	public Print(String del) {
		this.del =del;
	}
	public void A() {
		System.out.println(this.del);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.del);
		System.out.println("B");
		System.out.println("B");
	}
}
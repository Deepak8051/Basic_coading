package org;

class Car {
	String brand;
	int cost;
	Car(String brand){
		this.brand=brand;

	}
	Car(String brand,int cost){
		this(brand);
		this.cost=cost;

	}
	public static void main(String[] args) {
		Car c= new Car("Suzuki",899999);
		System.out.println("brand:"+c.brand);
		System.out.println("cost:"+c.cost);
	}

}

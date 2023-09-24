public class Demo5 {
   
        int price;
        String color;
        public Demo5(int price,String color ) {
        this.price=price;
        this.color =color;
        }
        public static void main(String[] args) {
        Demo5 m1=new Demo5(15000,"Samsung");
        Demo5 m2=new Demo5(12000,"Real-Me");
        System.out.println(m1.price);
        System.out.println(m1.color);
        System.out.println(m2.price);
        System.out.println(m2.color);
        }
        }
    


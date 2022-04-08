public class Casting {
    /*
     * Trong Java có 2 loại ép kiểu:
     * 1 là ép kiểu cho kiểu nguyên thủy:
     * + ép kiểu ngầm định (widening): byte->short->int->long->float->double: k làm mất mát dữ liệu
     * + ép kiểu tường minh (narrowing): byte<-short<-int<-long<-float<-double: phải chỉ định rõ kiểu muốn ép
     * và dễ gây mất mát dữ liệu
     * 2 là ép kiểu cho kiểu dữ liệu tham chiếu:
     * Ép kiểu kiểu này sẽ khiến cho các kiểu dữ liệu tham chiếu của chúng ta trở thành 1
     * và cùng tham chiếu đến 1 ô nhớ duy nhất
     * */

    protected String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        Casting castingA = new Casting();
        Casting castingB = new Casting();

        castingA.setName("Maria");
        castingB.setName("Eimi");

        System.out.println("Casting a will be  " + castingA.getName());
        System.out.println("Casting b will be  " + castingB.getName());

        //ep kieu khien ca 2 object deu tro den cung 1 o nho
        castingB = castingA;

        castingB.setName("Hanami");

        System.out.println("Casting a will be  " + castingA.getName());
        System.out.println("Casting b will be  " + castingB.getName());
    }

}

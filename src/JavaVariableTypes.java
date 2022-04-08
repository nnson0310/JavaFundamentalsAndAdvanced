public class JavaVariableTypes {

    public void JavaVariableTypes() {

    }

    /*
    * + Biến local là biến được khai báo trong thân hàm hoặc khối lênh và chỉ được sử dụng trong
    * + Không thể khởi tạo với access modifier (public, private...)
    * + Chỉ được khởi tạo cùng với thân hàm và khối lệnh, sau đó sẽ bị hủy khi thân hàm và khối lệnh biến mất
    * + Không có giá trị khởi tạo mặc đinh
    * */

    /*
    * + Biến global là biến được khai báo trong class
    * + Có thể được khai báo với các access modifiers, nếu k chỉ rõ thì sẽ mặc định là default
    * + Chí được khởi tạo cùng instance của Class và được truy cập thông qua instance của class
    * + Có giá trị khởi tạo mặc định: với kiểu byte, short, int, long, float, double sẽ là 0
    * với kiểu char sẽ là kí tự '\u0000' (kí tự có nghĩ là null trong ngôn ngữ Java), còn kiểu boolean sẽ là false
    * */

    /*
    * Biến static là biến được khai báo với từ khóa static
    * Biến static được khởi tạo cùng với chương trình và chỉ bị hủy khi chương trình kết thúc
    * Khi kết hợp với từ khóa final = khai báo constant (hằng số)
    * Được truy cập thông qua class hoặc được gọi trực tiếp trong 1 static method chứ k phải thông qua instance của Class
    * */

    /*
    * Biến hằng (constant) được khai báo với từ khóa final
    * Biến hằng chỉ được khởi tạo 1 lần duy nhất trong toàn bộ chương trình
    * và không thể gán lại giá trị
    * */

    public static final String myName = "Son";

    private static int number;

    private static boolean intial;

    private static char charText;

    public static void main(String args[]) {
        System.out.println(number);
        System.out.println(JavaVariableTypes.intial);
        System.out.println(JavaVariableTypes.charText);
    }
}
